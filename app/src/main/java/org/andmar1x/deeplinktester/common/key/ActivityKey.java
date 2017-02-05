package org.andmar1x.deeplinktester.common.key;

import android.app.Activity;

import dagger.MapKey;

@MapKey
public @interface ActivityKey {

    Class<? extends Activity> value();
}
