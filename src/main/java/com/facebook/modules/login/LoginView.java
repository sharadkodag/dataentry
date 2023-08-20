package com.facebook.modules.login;

import com.facebook.mvputil.BaseView;
import com.vaadin.flow.component.login.LoginForm;
import com.vaadin.flow.component.notification.Notification;
import com.vaadin.flow.component.orderedlayout.VerticalLayout;
import com.vaadin.flow.router.Route;
import com.vaadin.flow.spring.annotation.SpringComponent;
import com.vaadin.flow.spring.annotation.UIScope;

import javax.annotation.PostConstruct;

@Route(value = "")
@UIScope
@SpringComponent
public class LoginView extends BaseView<LoginPresenter> {

    @Override
    protected void init(){
        addLoginBox();
    }

    private void addLoginBox(){
        LoginForm loginForm = new LoginForm();
        setAlignItems(Alignment.CENTER);
        setJustifyContentMode(JustifyContentMode.CENTER);
        add(loginForm);

        loginForm.addLoginListener(event -> {
            Boolean aBoolean = getPresenter().checkUser(event.getUsername(), event.getPassword());
            if(aBoolean){
                Notification.show("Logged in", 3000, Notification.Position.MIDDLE);
            }
        });
    }
}