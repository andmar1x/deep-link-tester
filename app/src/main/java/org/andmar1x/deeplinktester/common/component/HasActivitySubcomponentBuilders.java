package org.andmar1x.deeplinktester.common.component;

import android.app.Activity;
import android.support.annotation.NonNull;

public interface HasActivitySubcomponentBuilders {

    ActivityComponentBuilder getActivityComponentBuilder(@NonNull Class<? extends Activity> activityClass);
}
