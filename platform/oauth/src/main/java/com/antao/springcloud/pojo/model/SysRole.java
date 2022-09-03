package com.antao.springcloud.pojo.model;

import com.baomidou.mybatisplus.annotation.IdType;
import com.baomidou.mybatisplus.annotation.TableField;
import com.baomidou.mybatisplus.annotation.TableId;
import com.baomidou.mybatisplus.annotation.TableName;
import lombok.Data;
import org.springframework.security.core.GrantedAuthority;

/**
 * @author     ：antao
 * @date        2022/9/3 20:41
 * @description：
 * @modified By：
 */
@Data
@TableName("sys_role")
public class SysRole implements GrantedAuthority {

    @TableId(value = "id",type = IdType.AUTO)
    private Long id;

    @TableField("role_name")
    private String roleName;

    @TableField("role_dec")
    private String roleDec;

    @Override
    public String getAuthority() {
        return roleName;
    }
}