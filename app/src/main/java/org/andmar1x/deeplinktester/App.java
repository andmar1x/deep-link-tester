package org.andmar1x.deeplinktester;

import android.app.Activity;
import android.app.Application;
import android.content.Context;
import android.support.annotation.NonNull;
import com.raizlabs.android.dbflow.config.FlowConfig;
import com.raizlabs.android.dbflow.config.FlowManager;
import java.util.Map;
import javax.inject.Inject;
import org.andmar1x.deeplinktester.common.component.ActivityComponentBuilder;
import org.andmar1x.deeplinktester.common.component.DaggerAppComponent;
import org.andmar1x.deeplinktester.common.component.HasActivitySubcomponentBuilders;
import org.andmar1x.deeplinktester.common.module.AppModule;

public class App
        extends Application
        implements HasActivitySubcomponentBuilders {

    @Inject
    protected Map<Class<? extends Activity>, ActivityComponentBuilder> activityComponentBuilders;

    public static HasActivitySubcomponentBuilders getHasActivitySubcomponentBuilders(@NonNull Context context) {
        return ((HasActivitySubcomponentBuilders)context.getApplicationContext());
    }

    @Override
    public void onCreate() {
        super.onCreate();
        FlowManager.init(new FlowConfig.Builder(this).build());
        DaggerAppComponent.builder()
                .appModule(new AppModule(this))
                .build()
                .injectMembers(this);
    }

    @Override
    public ActivityComponentBuilder getActivityComponentBuilder(@NonNull Class<? extends Activity> activityClass) {
        return activityComponentBuilders.get(activityClass);
    }
}