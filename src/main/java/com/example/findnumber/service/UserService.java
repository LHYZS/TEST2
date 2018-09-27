package com.example.findnumber.service;

import com.example.findnumber.entity.User;

import java.util.List;

public interface UserService {
    //查询所有用户
    List<User> getAll();

    //根据id查询用户
    User getUser(Long id);

    //根据账号精确查询用户
    User getUserByAccount(String account);

    //根据昵称关键字查询用户
    List<User> getUsersByNicknameLike(String keywords);

    //查询昵称含有指定关键词并且按粉丝数降序排列
    List<User> getUsersOrderByFans(String nickname);
}
