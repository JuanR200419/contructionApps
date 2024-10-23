package com.example.blogging.dto;

import com.example.blogging.entity.Comment;
import com.example.blogging.entity.Follow;
import com.example.blogging.entity.Post;
import com.example.blogging.entity.Role;
import jakarta.persistence.*;
import jakarta.validation.Valid;
import jakarta.validation.constraints.*;

import java.util.List;

public class UserDto {

    @NotBlank
    @Max(value = 80, message = "EL Nick name  tiene un límite de 80 caracteres")
    private String nickname;

    @NotBlank
    @Max(value = 10, message = "EL  nombre completo tiene un límite de 80 caracteres")
    private String full_name;

    @NotBlank
    @Size(min =10 , max = 10, message = "EL phone number")
    private String phone_number;

    @Email
    @NotBlank
    private String email;

    @NotBlank
    @Max(value = 16, message = "La contraseña  tiene un límite de 16 caracteres")
    private String password;

    public UserDto() {
        super();
    }

    public UserDto(String nickname, String full_name, String phone_number, String email, String password) {
        this.nickname = nickname;
        this.full_name = full_name;
        this.phone_number = phone_number;
        this.email = email;
        this.password = password;
    }

    public String getNickname() {
        return nickname;
    }

    public void setNickname(String nickname) {
        this.nickname = nickname;
    }

    public String getFull_name() {
        return full_name;
    }

    public void setFull_name(String full_name) {
        this.full_name = full_name;
    }

    public String getPhone_number() {
        return phone_number;
    }

    public void setPhone_number(String phone_number) {
        this.phone_number = phone_number;
    }

    public String getEmail() {
        return email;
    }

    public void setEmail(String email) {
        this.email = email;
    }

    public String getPassword() {
        return password;
    }

    public void setPassword(String password) {
        this.password = password;
    }
}
