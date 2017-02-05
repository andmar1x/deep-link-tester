package org.andmar1x.deeplinktester.presentation.ui.details;

import android.support.annotation.UiThread;

import org.andmar1x.deeplinktester.common.view.MvpView;

public interface DetailsView
        extends MvpView {

    @UiThread
    void finish();

    @UiThread
    void setUriString(String uriString);

    @UiThread
    void openLink();
}
