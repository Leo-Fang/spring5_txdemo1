package com.atguigu.spring5.service;

import com.atguigu.spring5.dao.UserDao;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Isolation;
import org.springframework.transaction.annotation.Propagation;
import org.springframework.transaction.annotation.Transactional;

/**
 * @author Leo
 * @date 2020/7/28 - 20:20
 */

@Service
@Transactional(propagation = Propagation.REQUIRED,isolation = Isolation.REPEATABLE_READ,timeout = -1,readOnly = false)
public class UserService {

    //注入dao
    @Autowired
    private UserDao userDao;

    //转账的方法
    public void accountMoney() {
        /*try {
            //第一步：开启事务

            //第二步：进行业务操作
            //lucy少100
            userDao.reduceMoney();

            //模拟异常
            int i = 10/0;

            //marry多100
            userDao.addMoney();

            //第三步：没有发生异常，提交事务
        } catch (Exception e) {
            //第四步：出现异常，事务回滚
        }*/
        //lucy少100
        userDao.reduceMoney();

        //模拟异常
        int i = 10/0;

        //marry多100
        userDao.addMoney();
    }

}
