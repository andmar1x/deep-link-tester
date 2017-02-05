package org.andmar1x.deeplinktester.presentation.ui.history;

import android.support.annotation.NonNull;

import org.andmar1x.deeplinktester.common.presenter.BasePresenter;
import org.andmar1x.deeplinktester.data.model.DeepLink;
import org.andmar1x.deeplinktester.data.model.DeepLinkViewModel;
import org.andmar1x.deeplinktester.domain.usecase.LoadDeepLinksUseCase;

import java.util.List;

import javax.inject.Inject;

import io.reactivex.Observable;
import io.reactivex.ObservableSource;
import io.reactivex.android.schedulers.AndroidSchedulers;
import io.reactivex.disposables.Disposable;
import io.reactivex.functions.Consumer;
import io.reactivex.functions.Function;
import io.reactivex.schedulers.Schedulers;

public class HistoryPresenter
        extends BasePresenter<HistoryView> {

    @Inject
    protected LoadDeepLinksUseCase loadDeepLinksUseCase;

    private List<DeepLink> allDeepLinks;

    @Inject
    public HistoryPresenter() {
    }

    @Override
    public void attachView(@NonNull HistoryView view) {
        super.attachView(view);
        loadHistory();
    }

    public void openLinkEditor(String link) {
        final HistoryView view = getView();
        if (view != null) {
            view.openDetails(link);
        }
    }

    public void openLinkEditor(int position) {
        if (position < allDeepLinks.size()) {
            DeepLink deepLink = allDeepLinks.get(position);
            openLinkEditor(deepLink.uriString);
        }
    }

    public void loadHistory() {
        Disposable getDeepLinksDisposable = loadDeepLinksUseCase.getDeepLinks()
                .subscribeOn(Schedulers.computation())
                .doOnNext(deepLinks -> allDeepLinks = deepLinks)
                .flatMap(deepLinks -> Observable.fromIterable(deepLinks)
                        .map(DeepLinkViewModel.FROM_DEEP_LINK_MAPPER)
                        .toList()
                        .toObservable())
                .observeOn(AndroidSchedulers.mainThread())
                .subscribe(deepLinkViewModels -> {
                    final HistoryView view = getView();
                    if (view != null) {
                        if (!deepLinkViewModels.isEmpty()) {
                            view.showData(deepLinkViewModels);
                        } else {
                            view.showEmpty();
                        }
                    }
                });
        compositeDisposable.add(getDeepLinksDisposable);
    }
}
