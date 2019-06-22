package com.zjmlw.solr.web.service.impl;

import com.zjmlw.solr.web.service.UserService;
import org.junit.After;
import org.junit.Before;
import org.junit.Test;
import org.junit.runner.RunWith;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Qualifier;
import org.springframework.test.context.ContextConfiguration;
import org.springframework.test.context.junit4.SpringJUnit4ClassRunner;

@RunWith(SpringJUnit4ClassRunner.class)
@ContextConfiguration(locations={"classpath:applicationContext.xml"})
public class UserServiceImplTest {

    @Autowired(required = false)
    @Qualifier("userService")
    UserService userService;

    @Before
    public void setUp() throws Exception {
        System.out.println("我是在方法之前执行");
    }

    @Test
    public void testGetUserList() {
        System.out.println(userService.getUserList());
    }

    @After
    public void tearDown() throws Exception {
        System.out.println("我是在方法之后执行");
    }

}