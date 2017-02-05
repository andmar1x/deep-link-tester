package org.andmar1x.deeplinktester.presentation.ui.details;

import android.content.Intent;
import android.support.annotation.NonNull;

import io.reactivex.functions.Consumer;
import org.andmar1x.deeplinktester.common.presenter.BasePresenter;
import org.andmar1x.deeplinktester.data.model.DeepLink;
import org.andmar1x.deeplinktester.domain.usecase.UpdateDeepLinksUseCase;

import javax.inject.Inject;

import io.reactivex.android.schedulers.AndroidSchedulers;
import io.reactivex.disposables.Disposable;
import io.reactivex.functions.Action;
import io.reactivex.schedulers.Schedulers;

public class DetailsPresenter
        extends BasePresenter<DetailsView> {

    public static final String KEY_LINK_STRING = "KEY_LINK_STRING";

    @Inject
    protected UpdateDeepLinksUseCase updateDeepLinksUseCase;

    @Inject
    public DetailsPresenter() {
    }

    public void resolveExtras(Intent intent) {
        if (intent != null) {
            String linkString = intent.getStringExtra(KEY_LINK_STRING);
            DetailsView view = getView();
            if (view != null) {
                view.setUriString(linkString);
            }
        }
    }

    public void launchLink() {
        DetailsView view = getView();
        if (view != null) {
            view.openLink();
        }
    }

    public void addDeepLink(@NonNull String uriString, boolean success) {
        Disposable addDeepLinkDisposable = updateDeepLinksUseCase.addDeepLink(uriString, System.currentTimeMillis(), success ? 1 : 0)
                .subscribeOn(Schedulers.computation())
                .observeOn(AndroidSchedulers.mainThread())
                .subscribe(() -> {
                    DetailsView view = getView();
                    if (view != null) {
                        view.finish();
                    }
                });
        compositeDisposable.add(addDeepLinkDisposable);
    }
}
