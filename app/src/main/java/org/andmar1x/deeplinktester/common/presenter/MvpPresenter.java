package org.andmar1x.deeplinktester.common.presenter;

import android.support.annotation.NonNull;

import org.andmar1x.deeplinktester.common.view.MvpView;

public interface MvpPresenter<V extends MvpView> {

    void attachView(@NonNull V mvpView);

    void detachView();
}
