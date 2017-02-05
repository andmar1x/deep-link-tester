package org.andmar1x.deeplinktester.common.activity;

import android.os.Bundle;
import android.support.annotation.NonNull;
import android.support.annotation.Nullable;
import android.support.v7.app.AppCompatActivity;
import javax.inject.Inject;
import org.andmar1x.deeplinktester.App;
import org.andmar1x.deeplinktester.common.component.HasActivitySubcomponentBuilders;
import org.andmar1x.deeplinktester.common.presenter.MvpPresenter;
import org.andmar1x.deeplinktester.common.view.MvpView;

public abstract class MvpActivity<V extends MvpView, P extends MvpPresenter<V>>
        extends AppCompatActivity {

    @Inject
    protected P presenter;

    @Override
    protected void onCreate(@Nullable Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        inject(App.getHasActivitySubcomponentBuilders(this));
        presenter.attachView((V)this);
    }

    protected abstract void inject(@NonNull HasActivitySubcomponentBuilders hasActivitySubcomponentBuilders);

    @Override
    protected void onDestroy() {
        super.onDestroy();
        presenter.detachView();
    }
}
