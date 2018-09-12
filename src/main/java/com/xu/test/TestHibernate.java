package com.xu.test;

import com.xu.entity.User;
import com.xu.service.IUserService;
import com.xu.service.impl.UserServiceImpl;
import org.springframework.context.support.ClassPathXmlApplicationContext;

public class TestHibernate {
    public static void main(String[] args) {
//        Configuration configuration = new Configuration();
        //        Configuration configure = configuration.configure("applicationContext.xml");
        System.out.println("aaa");
        ClassPathXmlApplicationContext context = new ClassPathXmlApplicationContext("applicationContext.xml");
       IUserService userService = context.getBean("userService", UserServiceImpl.class);
    //    UserDaoImpl userService = context.getBean("userDao", UserDaoImpl.class);
       // System.out.println(userService);
//s
        User user = userService.queryOne(1);
        System.out.println(user.getUsername());
    }

}
