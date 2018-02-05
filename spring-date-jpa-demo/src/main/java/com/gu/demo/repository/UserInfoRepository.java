package com.gu.demo.repository;

import com.gu.demo.pojo.UserInfo;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;
import org.springframework.data.repository.query.Param;

import java.util.List;

public interface UserInfoRepository extends JpaRepository<UserInfo,Long> {
    List<UserInfo> findByLastName(String lastName);
    UserInfo findByFirstName(String firstName);

    @Query("select u from UserInfo u where u.firstName=:name or u.lastName=:name  order by u.id desc")
    List<UserInfo> findByName(@Param("name") String name);

    @Query(nativeQuery = true,value = "select * from user_info u where u.first_name like concat('%' ,?1,'%') ")
    List<UserInfo> findByName2(@Param("name") String name);
}
