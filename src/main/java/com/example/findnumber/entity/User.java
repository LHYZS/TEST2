package com.example.findnumber.entity;

import lombok.Data;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.Id;
import java.io.Serializable;

@Entity
@Data
public class User implements Serializable {
    @Id
    @GeneratedValue
    private Long id;

    @Column(nullable = false)
    private String account;

    @Column(nullable = false)
    private String password;

    private String nickname;

    private Integer fans;

    public User(String account, String password, String nickname, Integer fans) {
        this.account = account;
        this.password = password;
        this.nickname = nickname;
        this.fans = fans;
    }

    public User() {
    }
}