package com.antao.springcloud.mapper;

import com.antao.springcloud.pojo.model.SysUserRole;
import com.baomidou.mybatisplus.core.mapper.BaseMapper;
import org.apache.ibatis.annotations.Mapper;

/**
 * @author ：antao
 * @date 2022/9/3 21:13
 * @description：
 * @modified By：
 */
@Mapper
public interface UserRoleMapper extends BaseMapper<SysUserRole> {
}
