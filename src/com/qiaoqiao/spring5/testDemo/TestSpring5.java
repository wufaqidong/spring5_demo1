package com.qiaoqiao.spring5.testDemo;

import com.qiaoqiao.spring5.User;
import org.junit.Test;
import org.springframework.beans.factory.BeanFactory;
import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

/**
 * @program: spring5_demo1
 * @description:
 * @author: qiaoqiao
 * @create: 2022-07-21 13:09
 **/


public class TestSpring5 {

    @Test
    public void testDemo(){
        // 加载spring配置文件
        // IOC实现的两种方式之一,ApplicationContext是BeanFactory的子接口，提供更强大的功能，一般用于开发使用
        // 加载配置文件的时候创建对象
        ApplicationContext applicationContext = new ClassPathXmlApplicationContext("bean1.xml");
        // 获取配置创建的对象
        User user=applicationContext.getBean("user",User.class);
        System.out.println(user);
        user.add();

    }

    @Test
    public void testDemo1(){
        // 加载spring配置文件
        // BeanFactory,IOC实现的两种方式之一，是spring内部的使用接口，不提供开发人员使用
        // 加载配置文件的时候不会创建对象，在使用时候才去创建对象
        BeanFactory applicationContext = new ClassPathXmlApplicationContext("bean1.xml");
        // 获取配置创建的对象
        User user=applicationContext.getBean("user",User.class);
        System.out.println(user);
        user.add();

    }
}


