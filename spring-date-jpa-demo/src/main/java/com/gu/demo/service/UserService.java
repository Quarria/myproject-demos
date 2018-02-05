package com.gu.demo.service;

import com.gu.demo.pojo.UserInfo;
import com.gu.demo.repository.UserInfoRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import java.util.List;

@Service
public class UserService {
    @Autowired
    private UserInfoRepository repository;

    /**
     * 初始化数据
     */
    public void index() {
        repository.save(new UserInfo("Jack", "Bauer"));
        repository.save(new UserInfo("Chloe", "O'Brian"));
        repository.save(new UserInfo("Kim", "Bauer"));
        repository.save(new UserInfo("David", "Palmer"));
        repository.save(new UserInfo("Michelle", "Dessler"));
        repository.save(new UserInfo("Bauer", "Dessler"));
    }
    /**
     * 查询所有
     */
    public void findAll(){
        List<UserInfo> result = repository.findAll();
        for (UserInfo userInfo:result){
            System.out.println(userInfo.toString());
        }
        System.out.println("-------------------------------------------");
    }
    /**
     * 查询ID为1的数据
     */
    public void findOne(){
        UserInfo result = repository.findOne(1L);
        if(result!=null){
            System.out.println(result.toString());
        }
        System.out.println("-------------------------------------------");
    }

    /**
     * 查询ID为1的数据
     */
    public void delete(){

        System.out.println("删除前数据：");
        List<UserInfo> userInfos = repository.findAll();
        for (UserInfo userInfo:userInfos){
            System.out.println(userInfo.toString());
        }

        System.out.println("删除ID=6数据：");
        repository.delete(6l);

        System.out.println("删除后数据：");
        userInfos = repository.findAll();
        for (UserInfo userInfo:userInfos){
            System.out.println(userInfo.toString());
        }
        System.out.println("-------------------------------------------");
    }

    /**
     * 查询lastName为指定用户昵称
     */
    public void findByLastName(){
        //还有很多诸如findByLastNameAndFirstname(lastName=? and firstName=?)
        //findByAgeLessThen(age < ?)   findByLastnameNot(lastname<>?) 诸如此类的方法命名来实现查询
        List<UserInfo> userInfos = repository.findByLastName("Bauer");
        for (UserInfo userInfo:userInfos){
            System.out.println(userInfo.toString());
        }
        System.out.println("-------------------------------------------");
    }

    public void findByFirstName(){
        UserInfo userInfo = repository.findByFirstName("121");
        if(userInfo!=null){
            System.out.println(userInfo.toString());
        }else{
            System.out.println("无数据");
        }
        System.out.println("-------------------------------------------");
    }

    public void findByName(){
        List<UserInfo> userInfos = repository.findByName("e");
        for (UserInfo userInfo:userInfos){
            System.out.println(userInfo.toString());
        }
        System.out.println("-------------------------------------------");
    }

    public void findByName2(){
        List<UserInfo> userInfos = repository.findByName2("e");
        for (UserInfo userInfo:userInfos){
            System.out.println(userInfo.toString());
        }
        System.out.println("-------------------------------------------");
    }
}
