package com.antao.springcloud.pojo.model;

import com.baomidou.mybatisplus.annotation.IdType;
import com.baomidou.mybatisplus.annotation.TableField;
import com.baomidou.mybatisplus.annotation.TableId;
import com.baomidou.mybatisplus.annotation.TableName;
import lombok.Data;

/**
 * @author     ：antao
 * @date        2022/9/3 21:01
 * @description：
 * @modified By：
 */
@Data
@TableName(value = "")
public class SysUserRole {
    @TableId(type = IdType.AUTO)
    private int id;

    @TableField("u_id")
    private int uId;

    @TableField("r_id")
    private int rId;
}