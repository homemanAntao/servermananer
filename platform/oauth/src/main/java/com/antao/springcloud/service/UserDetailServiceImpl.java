package com.antao.springcloud.service;

import com.antao.springcloud.mapper.RoleMapper;
import com.antao.springcloud.mapper.UserMapper;
import com.antao.springcloud.mapper.UserRoleMapper;
import com.antao.springcloud.pojo.model.SysRole;
import com.antao.springcloud.pojo.model.SysUser;
import com.antao.springcloud.pojo.model.SysUserRole;
import com.baomidou.mybatisplus.core.conditions.query.QueryWrapper;
import org.springframework.security.core.userdetails.UserDetails;
import org.springframework.security.core.userdetails.UsernameNotFoundException;
import org.springframework.stereotype.Service;

import javax.annotation.Resource;
import java.util.ArrayList;
import java.util.List;

/**
 * 用户业务接口
 * @author     ：antao
 * @date        2022/9/3 20:57
 * @description：
 * @modified By：
 */
@Service
public class UserDetailServiceImpl implements UserService {
    @Resource
    private UserMapper userMapper;

    @Resource
    private RoleMapper roleMapper;

    @Resource
    private UserRoleMapper userRoleMapper;


    @Override
    public UserDetails loadUserByUsername(String s) throws UsernameNotFoundException {
        SysUser user = new SysUser();
        List<SysUserRole> userRoles = new ArrayList<>();
        List<SysRole> roles = new ArrayList<>();
        List<Integer> rIds = new ArrayList<>();
        user = userMapper.selectOne(new QueryWrapper<SysUser>().lambda().eq(SysUser::getUsername,s));
        userRoles = userRoleMapper.selectList(new QueryWrapper<SysUserRole>().lambda().eq(SysUserRole::getUId,user.getId()));
        userRoles.forEach(a->{
            rIds.add(a.getRId());
        });
        roles = roleMapper.selectList(new QueryWrapper<SysRole>().lambda().in(SysRole::getId,rIds));
        user.setRoleList(roles);
        return user;
    }

//    @Override
//    public SysUser Login(Principal principal,String userName, String password) throws HttpRequestMethodNotSupportedException {
//        SysUser sysUser = new SysUser();
//        sysUser = userMapper.selectOne(new QueryWrapper<SysUser>().lambda()
//                .eq(SysUser::getUsername,userName).eq(SysUser::getPassword,password));
//        return sysUser;
//    }
}