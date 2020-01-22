package com.fh.controller;

import com.fh.model.ServerResponse;
import com.fh.model.User;
import com.fh.service.UserService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import javax.servlet.http.HttpServletRequest;

@RestController
@RequestMapping("UserController")
public class UserController {

    @Autowired
    private UserService userService;


    @RequestMapping("login")
    public ServerResponse login(String username, String password){
        try {
            ServerResponse serverResponse = userService.login(username,password);
            return serverResponse;
        } catch (Exception e) {
            e.printStackTrace();
        }

        return ServerResponse.error();

    }


    //获取当前登录会员信息的API接口
    @RequestMapping("getCurrentLoginUser")
    public ServerResponse getCurrentLoginUser(HttpServletRequest request){
        try {
            User loginUser = (User) request.getAttribute("loginUser");
            User user = userService.getUserById(loginUser.getId());
            return ServerResponse.success(user);
        } catch (Exception e) {
            e.printStackTrace();
            return ServerResponse.error();
        }
    }

}
