package com.antao.springcloud.mapper;

import com.antao.springcloud.pojo.model.SysRole;
import com.antao.springcloud.pojo.model.SysUser;
import com.baomidou.mybatisplus.core.mapper.BaseMapper;
import org.apache.ibatis.annotations.Mapper;

/**
 * @author ：antao
 * @date 2022/9/3 21:11
 * @description：
 * @modified By：
 */
@Mapper
public interface RoleMapper extends BaseMapper<SysRole> {
}
