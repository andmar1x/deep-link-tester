package org.andmar1x.deeplinktester.common.module;

import android.app.Activity;
import android.content.Context;
import android.support.annotation.NonNull;
import android.support.v4.app.FragmentActivity;
import android.support.v4.app.FragmentManager;

import org.andmar1x.deeplinktester.common.scope.ActivityScope;

import dagger.Module;
import dagger.Provides;

@Module
public abstract class ActivityModule<A extends Activity> {

    protected final A activity;

    public ActivityModule(@NonNull A activity) {
        this.activity = activity;
    }

    @Provides
    @ActivityScope
    public A provideActivity() {
        return activity;
    }

    @Provides
    public Context provideContext() {
        return activity;
    }

    @Provides
    public FragmentManager provideFragmentManager() {
        return ((FragmentActivity) activity).getSupportFragmentManager();
    }
}
