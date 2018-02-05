package com.gu.demo.controller;

import com.gu.demo.service.UserService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;

import java.util.List;

@Controller
@RequestMapping("/userInfo")
public class UserInfoController {
    @Autowired
    private UserService userService ;
    /**
     * 初始化数据
     */
    @RequestMapping("/save")
    public void index() {
        userService.index();
    }
    /**
     * 查询所有
     */
    @RequestMapping("/findAll")
    public void findAll(){
        userService.findAll();
    }
    /**
     * 查询ID为1的数据
     */
    @RequestMapping("/findOne")
    public void findOne(){
        userService.findOne();
    }

    /**
     * 删除
     */
    @RequestMapping("/delete")
    public void delete(){
        userService.delete();
    }

    /**
     * 以lastName 为条件查询
     */
    @RequestMapping("/findByLastName")
    public void findByLastName(){
        userService.findByLastName();
    }

    /**
     * 以firstName 为条件查询 通过NamedQueries方式
     */
    @RequestMapping("/findByFirstName")
    public void findByFirstName(){
        userService.findByFirstName();
    }

    /**
     * @Query注解实现查询
     */
    @RequestMapping("/findByName")
    public void findByName(){
        userService.findByName();
    }

    /**
     * @Query注解实现查询开启nativeQuery=true 使用原生sql进行查询
     */
    @RequestMapping("/findByName2")
    public void findByName2(){
        userService.findByName2();
    }
}
