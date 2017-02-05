package org.andmar1x.deeplinktester.common.module;

import android.app.Application;
import android.content.Context;
import android.support.annotation.NonNull;
import dagger.Module;
import dagger.Provides;
import org.andmar1x.deeplinktester.App;

@Module
public class AppModule {

    protected final App app;

    public AppModule(@NonNull App app) {
        this.app = app;
    }

    @Provides
    public Application provideApplication() {
        return app;
    }

    @Provides
    public Context provideContext() {
        return app;
    }
}
