package org.andmar1x.deeplinktester.common.component;

import android.support.annotation.NonNull;

import org.andmar1x.deeplinktester.common.module.ActivityModule;

public interface ActivityComponentBuilder<M extends ActivityModule, C extends ActivityComponent> {

    ActivityComponentBuilder<M, C> activityModule(@NonNull M module);

    C build();
}
