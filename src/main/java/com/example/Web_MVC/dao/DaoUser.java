package com.example.Web_MVC.dao;


import com.example.Web_MVC.model.User;

import java.util.List;

public interface DaoUser {

    List<User> getUsers();

    void addUser(User user);

    void deleteUser(long id);

    void updateUser(User user);

    User getUserById(long id);

}
