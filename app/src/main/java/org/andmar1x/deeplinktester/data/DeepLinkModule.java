package org.andmar1x.deeplinktester.data;

import android.support.annotation.NonNull;

import dagger.Module;
import dagger.Provides;

@Module
public class DeepLinkModule {

    @Provides
    public DeepLinkDataSource provideDeepLinkDataSource() {
        return new DeepLinkLocalDataSource();
    }

    @Provides
    public DeepLinkRepository provideDeepLinkRepository(@NonNull DeepLinkDataSource localDataSource) {
        return new DeepLinkRepository(localDataSource);
    }
}
