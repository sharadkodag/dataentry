package com.facebook.modules.homepage;

import com.facebook.mvputil.BaseView;
import com.vaadin.flow.router.Route;
import com.vaadin.flow.spring.annotation.SpringComponent;
import com.vaadin.flow.spring.annotation.UIScope;

@Route(value = "/homepage")
@UIScope
@SpringComponent
public class HomePageView extends BaseView<HomePagePresenter> {

    @Override
    protected void init() {

    }
}
