package com.facebook.mvputil;

import com.vaadin.flow.component.orderedlayout.VerticalLayout;
import com.vaadin.flow.router.BeforeEnterEvent;
import com.vaadin.flow.router.BeforeEnterObserver;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;

import javax.annotation.PostConstruct;

@Component
public abstract class BaseView<P extends Presenter> extends VerticalLayout implements View<P>, BeforeEnterObserver {
    @Autowired
    private P presenter;

    @PostConstruct
    private void postConstruct() {
        if (presenter != null) {
            presenter.setView(this);
            setSizeFull();
            setPadding(false);
            init();
        }
    }

    protected abstract void init() ;

    @Override
    public P getPresenter() {
        return presenter;
    }

    @Override
    public void beforeEnter(BeforeEnterEvent event) {
        getPresenter().beforeEnter(event);
    }
}
