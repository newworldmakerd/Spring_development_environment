package com.njupt.demoproject2.service.impl;

import com.njupt.demoproject2.domian.User;
import com.njupt.demoproject2.mapper.UserMapper;
import com.njupt.demoproject2.service.UserService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.HashMap;
import java.util.List;
import java.util.Map;
import java.util.UUID;

@Service
public class UserServiceImpl implements UserService {
    private static Map<String,User> sessionId=new HashMap<>();
    @Autowired
    private UserMapper userMapper;
    @Override
    public String login(String userName, String pwd) {
        User user = userMapper.findByUserName(userName, pwd);
        if(user==null){
            return null;
        }
        else {
            String token = UUID.randomUUID().toString();
            System.out.println(token);
            sessionId.put(token,user);
            return token;
        }

    }

    @Override
    public List<User> listUser() {
        return userMapper.listUser();
    }
}
