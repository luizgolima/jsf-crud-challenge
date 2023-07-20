package com.example.jsfcrud.helpers;

import com.example.jsfcrud.models.User;

public class UsersHelper {

    public static String editUserPath(User user) {
        return "/views/users/edit.xhtml?id=" + user.getId();
    }

    public static String usersPath() {
        return "/views/users/index.xhtml";
    }

    public static String newUserPath() {
        return "/views/users/new.xhtml";
    }

    public static String userPath(User user) {
        return "/views/users/show.xhtml?id=" + user.getId();
    }

}
