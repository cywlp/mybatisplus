package com.example.mybatisplus_4_generator.service.impl;

import com.example.mybatisplus_4_generator.domain.User;
import com.example.mybatisplus_4_generator.dao.UserDao;
import com.example.mybatisplus_4_generator.service.IUserService;
import com.baomidou.mybatisplus.extension.service.impl.ServiceImpl;
import org.springframework.stereotype.Service;

/**
 * <p>
 *  服务实现类
 * </p>
 *
 * @author 珠代
 * @since 2022-09-18
 */
@Service
public class UserServiceImpl extends ServiceImpl<UserDao, User> implements IUserService {

}
