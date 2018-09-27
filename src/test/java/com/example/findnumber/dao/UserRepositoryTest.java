package com.example.findnumber.dao;

import com.example.findnumber.entity.User;
import org.junit.Before;
import org.junit.Test;
import org.junit.runner.RunWith;
import org.springframework.boot.test.context.SpringBootTest;
import org.springframework.test.context.junit4.SpringRunner;

import javax.annotation.Resource;
import javax.xml.ws.RequestWrapper;

import java.util.List;
import java.util.function.Consumer;

import static org.junit.Assert.*;
@RunWith(SpringRunner.class)
@SpringBootTest
public class UserRepositoryTest {
@Resource
private UserRepository userRepository;
@Before
public void setUp() throws Exception{
}
    @Test
    public void findUserBy() {
        User user = userRepository.findUserBy("张三");
        System.out.println(user);
    }

    @Test
    public void findByAccount() {
        User user = userRepository.findByAccount("22");
        System.out.println(user);
    }

    @Test
    public void findByAccountAndNickname() {
        User user = userRepository.findByAccountAndNickname("33","于五");
        System.out.println(user);
    }

    @Test
    public void findByNicknameLike() {
       List<User> users = userRepository.findByNicknameLike("李四");
       users.forEach(user -> System.out.println(user));

    }

}