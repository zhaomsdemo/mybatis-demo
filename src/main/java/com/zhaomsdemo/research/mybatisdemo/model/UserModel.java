package com.zhaomsdemo.research.mybatisdemo.model;

import lombok.*;
import lombok.experimental.FieldDefaults;

import java.util.Date;

@Data
@Builder
@AllArgsConstructor
@NoArgsConstructor
@FieldDefaults(level = AccessLevel.PRIVATE)
public class UserModel {

    String id;
    Date createdDate;
    Date modifiedDate;
    String createdUser;
    String modifiedUser;
    String name;
    String email;
    String phone;
    Date birthday;
    String gender;
}
