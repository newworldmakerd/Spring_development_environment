package com.njupt.demoproject2.mapper;

import com.njupt.demoproject2.domian.User;
import org.springframework.stereotype.Repository;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;
@Repository
public class UserMapper {
    private static Map<String, User> userMap=new HashMap<>();
    static {
        userMap.put("lyh",new User(1,"lyh","lyh123"));
        userMap.put("lyh2",new User(2,"lyh2","lyh123"));
        userMap.put("lyh3",new User(3,"lyh3","lyh123"));
    }
    public User findByUserName(String userName,String pwd){
        User user = userMap.get(userName);
        if(user==null){
            return null;
        }
        if (user.getPwd().equals(pwd)){
            return user;
        }
        return null;
    }
    public List<User> listUser(){
        List<User> userList=new ArrayList<>();
        userList.addAll(userMap.values());
        return userList;
    }
}
