package com.example.mybatisplus_2_dql.domain;

import com.baomidou.mybatisplus.annotation.TableField;
import com.baomidou.mybatisplus.annotation.TableName;
import lombok.Data;

/**
 * @author :珠代
 * @description :
 * @create :2022-09-17 16:48:00
 */
@Data
@TableName("t_user")
public class User {
    private Long id;
    private String name;
    @TableField(value = "pwd",select = false)
    private String password;
    private Integer age;
    private String tel;
    @TableField(exist = false)
    private Integer online;
}
