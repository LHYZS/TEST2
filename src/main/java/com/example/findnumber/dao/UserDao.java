package com.example.findnumber.dao;

import com.example.findnumber.entity.User;
import lombok.Data;
import org.springframework.context.annotation.Configuration;

import java.util.Arrays;
import java.util.List;

@Configuration
@Data
public class UserDao {
    public List<User> getUsers() {
        User[] users  = {
                new User("11","11","张三",1000),
                new User("22","22","李四",2000),
                new User("33","33","于五",1500),
                new User("44","44","王七",3000),
        };
        List<User> userList = Arrays.asList(users);
        return userList;
    }
}
