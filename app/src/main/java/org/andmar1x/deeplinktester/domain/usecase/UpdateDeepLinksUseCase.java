package org.andmar1x.deeplinktester.domain.usecase;

import android.support.annotation.NonNull;

import io.reactivex.Completable;
import io.reactivex.Observable;
import javax.inject.Inject;
import org.andmar1x.deeplinktester.data.DeepLinkRepository;
import org.andmar1x.deeplinktester.data.model.DeepLink;

public class UpdateDeepLinksUseCase {

    private final DeepLinkRepository deepLinkRepository;

    public UpdateDeepLinksUseCase(@NonNull DeepLinkRepository deepLinkRepository) {
        this.deepLinkRepository = deepLinkRepository;
    }

    public Completable addDeepLink(@NonNull String uriString, long time, int status) {
        return deepLinkRepository.addDeepLink(uriString, time, status);
    }
}
