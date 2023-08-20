package com.facebook.modules.login;

import com.facebook.mvputil.BasePresenter;
import com.facebook.service.UserService;
import com.vaadin.flow.spring.annotation.SpringComponent;
import com.vaadin.flow.spring.annotation.UIScope;

import javax.annotation.Resource;

@SpringComponent
@UIScope
public class LoginPresenter extends BasePresenter<LoginView> {

    @Resource
    private UserService userService;

    public Boolean checkUser(String userName, String password){
        return userService.findUser(userName, password).isPresent();
    }

}
