package org.andmar1x.deeplinktester.data;

import android.support.annotation.NonNull;

import org.andmar1x.deeplinktester.data.model.DeepLink;

import java.util.List;

import javax.inject.Inject;

import io.reactivex.Completable;
import io.reactivex.Observable;

public class DeepLinkRepository
        implements DeepLinkDataSource {

    private final DeepLinkDataSource localDataSource;

    @Inject
    public DeepLinkRepository(@NonNull DeepLinkDataSource localDataSource) {
        this.localDataSource = localDataSource;
    }

    @Override
    public Observable<List<DeepLink>> getDeepLinks() {
        return localDataSource.getDeepLinks();
    }

    @Override
    public Observable<DeepLink> getDeepLink(long id) {
        return localDataSource.getDeepLink(id);
    }

    @Override
    public Completable addDeepLink(@NonNull String uriString, long time, int status) {
        return localDataSource.addDeepLink(uriString, time, status);
    }

    @Override
    public Completable removeDeepLinks() {
        return localDataSource.removeDeepLinks();
    }

    @Override
    public Completable removeDeepLink(long id) {
        return localDataSource.removeDeepLink(id);
    }
}
