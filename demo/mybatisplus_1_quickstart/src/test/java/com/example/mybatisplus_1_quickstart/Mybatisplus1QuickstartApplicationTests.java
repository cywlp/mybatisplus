package com.example.mybatisplus_1_quickstart;

import com.baomidou.mybatisplus.extension.plugins.pagination.Page;
import com.example.mybatisplus_1_quickstart.dao.UserDao;
import com.example.mybatisplus_1_quickstart.domain.User;
import org.junit.jupiter.api.Test;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;

import java.util.List;

@SpringBootTest
class Mybatisplus1QuickstartApplicationTests {

    @Autowired
    private UserDao userDao;

    @Test
    void testSave(){
        User user = new User();
        user.setName("tom");
        user.setAge(18);
        user.setPassword("14151555");
        userDao.insert(user);
    }

    @Test
    void testDelete(){
        userDao.deleteById("1571123306382295042");
    }

    @Test
    void testUpdate(){
        User user = new User();
        user.setId(1L);
        user.setPassword("12345");
        userDao.updateById(user);
    }

    @Test
    void testGetById() {
        User user = userDao.selectById("1");
        System.out.println(user);
    }

    @Test
    void testGetByPage() {
        //需要配置分页拦截器才会生效
        Page<User> userPage = new Page<>(2,1);
        userDao.selectPage(userPage,null);
        System.out.println("当前页码值" + userPage.getCurrent());
        System.out.println("每页显示数" + userPage.getSize());
        System.out.println("一共多少页" + userPage.getPages());
        System.out.println("一共多少数据" + userPage.getTotal());
        System.out.println("数据" + userPage.getRecords());
    }

    @Test
    void testGetAll() {
        List<User> userList = userDao.selectList(null);
        System.out.println(userList);
    }

}
