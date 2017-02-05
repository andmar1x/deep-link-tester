package org.andmar1x.deeplinktester.data;

import android.support.annotation.NonNull;
import io.reactivex.Completable;
import io.reactivex.Observable;
import java.util.List;
import org.andmar1x.deeplinktester.data.model.DeepLink;

public interface DeepLinkDataSource {

    Observable<List<DeepLink>> getDeepLinks();

    Observable<DeepLink> getDeepLink(long id);

    Completable addDeepLink(@NonNull String uriString, long time, int status);

    Completable removeDeepLinks();

    Completable removeDeepLink(long id);
}
