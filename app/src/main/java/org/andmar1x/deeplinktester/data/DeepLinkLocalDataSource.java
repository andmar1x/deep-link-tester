package org.andmar1x.deeplinktester.data;

import android.support.annotation.NonNull;
import com.raizlabs.android.dbflow.sql.language.OrderBy;
import com.raizlabs.android.dbflow.sql.language.SQLite;
import io.reactivex.Completable;
import io.reactivex.Observable;
import java.util.List;
import java.util.concurrent.Callable;
import org.andmar1x.deeplinktester.data.model.DeepLink;
import org.andmar1x.deeplinktester.data.model.DeepLink_Table;

public class DeepLinkLocalDataSource
        implements DeepLinkDataSource {

    @Override
    public Observable<List<DeepLink>> getDeepLinks() {
        return Observable.fromCallable(() -> SQLite.select()
                .from(DeepLink.class)
                .orderBy(OrderBy.fromProperty(DeepLink_Table.timestamp))
                .queryList());
    }

    @Override
    public Observable<DeepLink> getDeepLink(final long id) {
        return Observable.fromCallable(() -> SQLite.select()
                .from(DeepLink.class)
                .where(DeepLink_Table.id.eq(id))
                .querySingle());
    }

    @Override
    public Completable addDeepLink(@NonNull final String uriString, final long time, final int status) {
        return Completable.fromCallable(() -> {
            SQLite.insert(DeepLink.class)
                    .columns(DeepLink_Table.uriString, DeepLink_Table.timestamp, DeepLink_Table.status)
                    .values(uriString, time, status)
                    .execute();
            return null;
        });
    }

    @Override
    public Completable removeDeepLinks() {
        throw new UnsupportedOperationException("Not yet implemented.");
    }

    @Override
    public Completable removeDeepLink(long id) {
        throw new UnsupportedOperationException("Not yet implemented.");
    }
}
