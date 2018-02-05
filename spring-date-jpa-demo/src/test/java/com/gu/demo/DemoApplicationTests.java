package com.gu.demo;

import com.gu.demo.controller.UserInfoController;
import com.gu.demo.service.UserService;
import org.junit.Test;
import org.junit.runner.RunWith;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;
import org.springframework.test.context.junit4.SpringRunner;

@RunWith(SpringRunner.class)
@SpringBootTest
public class DemoApplicationTests {

    @Autowired
    private UserService userService;
    @Test
    public void index() {
        userService.index();
    }

    @Test
    public void findAll() {
        userService.findAll();
    }
    @Test
    public void findOne() {
        userService.findOne();
    }

    @Test
    public void delete() {
        userService.delete();
    }
    @Test
    public void findByLastName() {
        userService.findByLastName();
    }

    @Test
    public void findByFirstName() {
        userService.findByFirstName();
    }

    @Test
    public void findByName() {
        userService.findByName();
    }

    @Test
    public void findByName2() {
        userService.findByName2();
    }
}
