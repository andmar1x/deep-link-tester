package org.andmar1x.deeplinktester.common.module;

import android.support.annotation.NonNull;
import dagger.Binds;
import dagger.Module;
import dagger.multibindings.IntoMap;
import org.andmar1x.deeplinktester.common.component.ActivityComponentBuilder;
import org.andmar1x.deeplinktester.common.key.ActivityKey;
import org.andmar1x.deeplinktester.presentation.ui.details.DetailsActivity;
import org.andmar1x.deeplinktester.presentation.ui.details.DetailsComponent;
import org.andmar1x.deeplinktester.presentation.ui.history.HistoryActivity;
import org.andmar1x.deeplinktester.presentation.ui.history.HistoryComponent;

@Module(subcomponents = {
        HistoryComponent.class, DetailsComponent.class
})
public abstract class ActivityBindingModule {

    @Binds
    @IntoMap
    @ActivityKey(HistoryActivity.class)
    public abstract ActivityComponentBuilder homeComponentBuilder(@NonNull HistoryComponent.Builder builder);

    @Binds
    @IntoMap
    @ActivityKey(DetailsActivity.class)
    public abstract ActivityComponentBuilder valueComponentBuilder(@NonNull DetailsComponent.Builder builder);
}
