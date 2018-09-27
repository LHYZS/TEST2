package com.example.findnumber.service.impl;

import com.example.findnumber.dao.UserRepository;
import com.example.findnumber.entity.User;
import com.example.findnumber.service.UserService;
import org.springframework.stereotype.Service;

import javax.annotation.Resource;
import java.util.List;

@Service
public class UserServiceImpl implements UserService {
    @Resource
    private UserRepository userRepository;

    @Override
    public List<User> getAll() {
        return userRepository.findAll();
    }

    @Override
    public User getUser(Long id) {
        return userRepository.findById(id).get();
    }

    @Override
    public User getUserByAccount(String account) {
        return userRepository.findByAccount(account);
    }

    @Override
    public List<User> getUsersByNicknameLike(String keywords) {
        return userRepository.findByNicknameLike(keywords);
    }

    @Override
    public List<User> getUsersOrderByFans(String nickname) {
        return (List<User>) userRepository.findUserBy(nickname);
    }


}
