package com.example.mybatisplus_2_dql.domain;

import lombok.Data;

/**
 * @author :珠代
 * @description :
 * @create :2022-09-17 16:48:00
 */
@Data
public class User {
    private Long id;
    private String name;
    private String password;
    private Integer age;
    private String tel;
}
