package com.zhaomsdemo.research.mybatisdemo.controller;

import com.zhaomsdemo.research.mybatisdemo.model.UserModel;
import com.zhaomsdemo.research.mybatisdemo.repository.UserMapper;
import lombok.AccessLevel;
import lombok.AllArgsConstructor;
import lombok.experimental.FieldDefaults;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("/user")
@FieldDefaults(level = AccessLevel.PRIVATE)
@AllArgsConstructor
public class UserController {

    final UserMapper userMapper;

    @GetMapping("/{id}")
    public UserModel findById(@PathVariable String id) {
        return userMapper.findUserById(id);
    }
}
