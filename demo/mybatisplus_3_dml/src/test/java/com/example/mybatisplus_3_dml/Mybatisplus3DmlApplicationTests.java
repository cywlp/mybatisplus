package com.example.mybatisplus_3_dml;

import com.example.mybatisplus_3_dml.dao.UserDao;
import com.example.mybatisplus_3_dml.domain.User;
import org.junit.jupiter.api.Test;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;

import java.util.ArrayList;
import java.util.List;

@SpringBootTest
class Mybatisplus3DmlApplicationTests {

    @Autowired
    private UserDao userDao;

    @Test
    void testSave(){
        User user = new User();
        user.setName("tom");
        user.setAge(18);
        user.setPassword("14151555");
        user.setTel("13456789001");
        userDao.insert(user);
    }

    @Test
    void testDelete(){
        List<Long> list = new ArrayList();
        list.add(2L);
        list.add(3L);
        list.add(4L);
        list.add(5L);
//        userDao.deleteBatchIds(list);
        userDao.deleteById(1L);
    }

    @Test
    void testUpdate(){
        User user = new User();
        user.setId(2L);
        user.setPassword("123456");
        // 必须设置version值
        user.setVersion(1);
        userDao.updateById(user);
    }

}
