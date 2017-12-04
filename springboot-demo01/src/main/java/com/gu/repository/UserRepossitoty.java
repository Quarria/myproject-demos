package com.gu.repository;

import com.gu.entity.User;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;
import org.springframework.data.repository.query.Param;
import org.springframework.stereotype.Repository;

/**
 * Created by Song on 2017/2/15.
 * User表操作接口
 */
@Repository
public interface UserRepossitoty extends JpaRepository<User,Long> {

    @Query("select t from User t where t.user_name = :user_name")
    User findByUserName(@Param("user_name") String user_name);
}
