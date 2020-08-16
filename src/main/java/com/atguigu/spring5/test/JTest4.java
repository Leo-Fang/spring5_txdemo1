package com.atguigu.spring5.test;

import com.atguigu.spring5.service.UserService;


import org.junit.Test;
import org.junit.runner.RunWith;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.test.context.ContextConfiguration;
import org.springframework.test.context.junit4.SpringJUnit4ClassRunner;

/**
 * @author Leo
 * @date 2020/7/29 - 21:47
 */

@RunWith(SpringJUnit4ClassRunner.class)//指定单元测试框架版本
@ContextConfiguration("classpath:bean1.xml")//加载配置文件
public class JTest4 {

    @Autowired
    private UserService userService;

    @Test
    public void test1() {
        userService.accountMoney();
    }

}
