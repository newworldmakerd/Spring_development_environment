package com.njupt.demoproject2.service;

import com.njupt.demoproject2.domian.User;

import java.util.List;

public interface UserService {
    public String login(String userName,String pwd);
    public List<User> listUser();
}
