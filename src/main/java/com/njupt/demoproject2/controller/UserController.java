package com.njupt.demoproject2.controller;

import com.njupt.demoproject2.domian.User;
import com.njupt.demoproject2.service.UserService;
import com.njupt.demoproject2.utils.JsonData;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

@RestController
@RequestMapping("/api/pub/user")
public class UserController {
    @Autowired
    private UserService userService;
    @PostMapping("login")
    public JsonData login(@RequestBody User user){
        System.out.println("user+"+user.toString());
        String token = userService.login(user.getUserName(), user.getPwd());
        return token!=null?JsonData.buildSucess(""):JsonData.buildError("账号密码错误",-1);
    }
    @GetMapping("list")
    public JsonData list(){
        System.out.println("3");
        return JsonData.buildSucess(userService.listUser());
    }
}
