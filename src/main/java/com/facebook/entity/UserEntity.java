package com.facebook.entity;

import lombok.*;

@Builder
@Getter
@Setter
@NoArgsConstructor
@AllArgsConstructor
public class UserEntity {
    private Long id;
    private String name;
    private String mobileNumber;
    private String email;
    private String gender;
    private String userType;
    private String password;
}
