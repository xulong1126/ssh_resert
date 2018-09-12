package com.xu.service;

import com.xu.dao.impl.UserDaoImpl;
import com.xu.entity.User;
import com.xu.service.impl.UserServiceImpl;
import org.junit.Test;
import org.junit.runner.RunWith;
import org.springframework.context.support.ClassPathXmlApplicationContext;
import org.springframework.test.context.ContextConfiguration;
import org.springframework.test.context.junit4.SpringJUnit4ClassRunner;

import javax.sql.DataSource;

@RunWith(value = SpringJUnit4ClassRunner.class)
@ContextConfiguration(value = "classpath:applicationContext.xml")
public class TestService {
    @Test
    public void testQueryOne(){
        ClassPathXmlApplicationContext context = new ClassPathXmlApplicationContext("classpath:applicationContext.xml");
        DataSource dataSource = context.getBean("dataSource", DataSource.class);
        UserDaoImpl userDao = context.getBean("userDao", UserDaoImpl.class);

        IUserService userService = context.getBean("userService", UserServiceImpl.class);
        System.out.println(dataSource);
        System.out.println(userDao);
        System.out.println(userService);
        User user = userService.queryOne(1);
//        System.out.println(user);
    }

}
