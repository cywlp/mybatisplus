package com.example.mybatisplus_3_dml.dao;

import com.baomidou.mybatisplus.core.mapper.BaseMapper;
import com.example.mybatisplus_3_dml.domain.User;
import org.apache.ibatis.annotations.Mapper;

/**
 * @author :珠代
 * @description :
 * @create :2022-09-17 16:50:00
 */
@Mapper
public interface UserDao extends BaseMapper<User> {
}
