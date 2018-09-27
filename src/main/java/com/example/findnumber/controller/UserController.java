package com.example.findnumber.controller;

import com.example.findnumber.entity.User;
import com.example.findnumber.service.UserService;
import org.springframework.web.bind.annotation.*;

import javax.annotation.Resource;
import java.util.List;

@RestController
@RequestMapping(value = "/user")
public class UserController {
    @Resource
    private UserService userService;

    @GetMapping("/all")
    public List<User> getAll() {
        return userService.getAll();
    }

    @GetMapping("/nickname")
    public List<User> getUsersByNicknameLike(@RequestParam String keywords) {
        return (List<User>) userService.getUsersByNicknameLike(keywords);
    }

    @GetMapping("/{id}")
    public User getUser(@PathVariable Long id) {
        return userService.getUser(id);
    }

    @GetMapping("/account")
    public User getUserByAccount(@RequestParam String account) {
        return userService.getUserByAccount(account);
    }

    @GetMapping("/order")
    public List<User> getUsersOrderByFans(@RequestParam String nickname) {
        return userService.getUsersOrderByFans(nickname);
    }
}
