package com.example.mybatisplus_2_dql;

import com.baomidou.mybatisplus.core.conditions.query.LambdaQueryWrapper;
import com.example.mybatisplus_2_dql.dao.UserDao;
import com.example.mybatisplus_2_dql.domain.User;
import com.example.mybatisplus_2_dql.domain.query.UserQuery;
import org.junit.jupiter.api.Test;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;

import java.util.List;

@SpringBootTest
class Mybatisplus2DqlApplicationTests {

    @Autowired
    private UserDao userDao;

    @Test
    void testGetAll() {
        // 1.按条件查询
//        QueryWrapper qw = new QueryWrapper();
//        qw.lt("age",13);
//        List<User> userList = userDao.selectList(qw);

        // 2.lambda格式条件查询
//        QueryWrapper<User> qw = new QueryWrapper();
//        qw.lambda().lt(User::getAge, 13);
//        List<User> userList = userDao.selectList(qw);

        // 3.lambda格式条件查询
//        LambdaQueryWrapper<User> lqw = new LambdaQueryWrapper<>();
//        lqw.lt(User::getAge, 13);
//        List<User> userList = userDao.selectList(lqw);

//        LambdaQueryWrapper<User> lqw = new LambdaQueryWrapper<>();
//        // &&
////        lqw.lt(User::getAge, 19).gt(User::getAge,11);
//        // ||
//        lqw.lt(User::getAge, 11).or().gt(User::getAge,19);
//        List<User> userList = userDao.selectList(lqw);

        // 模拟页面传递过来的查询数据
        UserQuery uq = new UserQuery();
        uq.setAge(10);
        uq.setAge2(30);

        // null判定
//        LambdaQueryWrapper<User> lqw = new LambdaQueryWrapper<>();
//        lqw.gt(null != uq.getAge(), User::getAge, uq.getAge())
//           .lt(null != uq.getAge2(), User::getAge, uq.getAge2());
//        List<User> userList = userDao.selectList(lqw);
        // 投影
//        LambdaQueryWrapper<User> lqw = new LambdaQueryWrapper<>();
//        lqw.select(User::getName,User::getAge);
//        List<User> userList = userDao.selectList(lqw);
//        System.out.println(userList);
//
//        QueryWrapper<User> qw = new QueryWrapper<>();
//        qw.select("count(*) as count, tel");
//        qw.groupBy("tel");
//        List<Map<String, Object>> maps = userDao.selectMaps(qw);
//        System.out.println(maps);

        // 登录条件查询
        LambdaQueryWrapper<User> lqw = new LambdaQueryWrapper<>();
//        lqw.eq(User::getName,"tom").eq(User::getPassword,"14151555");
//        User user = userDao.selectOne(lqw);
//        System.out.println(user);

        // 范围查询 lt le gt ge between
//        lqw.between(User::getAge, 10, 30);
        // 模糊匹配
        lqw.like(User::getName,"o");
        List<User> userList = userDao.selectList(lqw);
        System.out.println(userList);



    }

}
