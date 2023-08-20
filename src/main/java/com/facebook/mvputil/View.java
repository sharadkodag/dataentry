package com.facebook.mvputil;

public interface View<P extends Presenter> {
    P getPresenter();
}
