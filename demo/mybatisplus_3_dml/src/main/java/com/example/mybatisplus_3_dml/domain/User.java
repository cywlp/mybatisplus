package com.example.mybatisplus_3_dml.domain;

import com.baomidou.mybatisplus.annotation.*;
import lombok.Data;

/**
 * @author :珠代
 * @description :
 * @create :2022-09-17 16:48:00
 */
@Data
//@TableName("t_user")
public class User {

    @TableId(type = IdType.AUTO)
    private Long id;
    private String name;
    @TableField(value = "pwd",select = false)
    private String password;
    private Integer age;
    private String tel;
    @TableField(exist = false)
    private Integer online;
    /**
     * 逻辑删除后字段 0-未删除 1-已删除
      */
//    @TableLogic(value = "0",delval = "1")
    private Integer deleted;
    /**
     *  乐观锁实现，需要开启乐观锁拦截器
     */
    @Version
    private Integer version;
}
