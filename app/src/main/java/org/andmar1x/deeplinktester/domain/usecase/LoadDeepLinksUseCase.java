package org.andmar1x.deeplinktester.domain.usecase;

import android.support.annotation.NonNull;
import io.reactivex.Observable;
import java.util.List;
import javax.inject.Inject;
import org.andmar1x.deeplinktester.data.DeepLinkRepository;
import org.andmar1x.deeplinktester.data.model.DeepLink;

public class LoadDeepLinksUseCase {

    private final DeepLinkRepository deepLinkRepository;

    public LoadDeepLinksUseCase(@NonNull DeepLinkRepository deepLinkRepository) {
        this.deepLinkRepository = deepLinkRepository;
    }

    public Observable<List<DeepLink>> getDeepLinks() {
        return deepLinkRepository.getDeepLinks();
    }
}
