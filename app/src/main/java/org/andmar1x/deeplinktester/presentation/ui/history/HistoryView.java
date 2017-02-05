package org.andmar1x.deeplinktester.presentation.ui.history;

import android.support.annotation.NonNull;
import android.support.annotation.UiThread;
import java.util.List;
import org.andmar1x.deeplinktester.common.view.MvpView;
import org.andmar1x.deeplinktester.data.model.DeepLinkViewModel;

public interface HistoryView
        extends MvpView {

    @UiThread
    void showData(@NonNull List<DeepLinkViewModel> deepLinkViewModels);

    @UiThread
    void showEmpty();

    @UiThread
    void openDetails(String deepLinkString);
}
