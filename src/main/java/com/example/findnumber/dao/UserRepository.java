package com.example.findnumber.dao;

import com.example.findnumber.entity.User;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;
import org.springframework.data.repository.query.Param;

import java.util.List;

public interface UserRepository extends JpaRepository<User,Long> {

//    根据昵称查询，自定义JPQL语句
    @Query("from User u where u.nickname=:nickname")
    User findUserBy(@Param("nickname") String nickname);

    //根据账号查询
    User findByAccount(String account);
    //根据账号和昵称查询
    User findByAccountAndNickname(String account,String nickname);

     //根据昵称关键词查询用户
    List<User> findByNicknameLike(String keywords);
}
