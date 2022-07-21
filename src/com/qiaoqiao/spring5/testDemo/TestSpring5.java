package com.qiaoqiao.spring5.testDemo;

import com.qiaoqiao.spring5.User;
import org.junit.Test;
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
        ApplicationContext applicationContext = new ClassPathXmlApplicationContext("bean1.xml");
        // 获取配置创建的对象
        User user=applicationContext.getBean("user",User.class);
        System.out.println(user);
        user.add();

    }
}


