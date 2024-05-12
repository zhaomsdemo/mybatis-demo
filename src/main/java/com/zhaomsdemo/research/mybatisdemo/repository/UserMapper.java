package com.zhaomsdemo.research.mybatisdemo.repository;

import com.zhaomsdemo.research.mybatisdemo.model.UserModel;
import org.apache.ibatis.annotations.Mapper;

import java.util.List;

@Mapper
public interface UserMapper {

    List<UserModel> findAllUsers();
    UserModel findUserById(String id);
}
