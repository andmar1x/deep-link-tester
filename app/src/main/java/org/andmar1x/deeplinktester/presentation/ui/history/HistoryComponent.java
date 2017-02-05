package org.andmar1x.deeplinktester.presentation.ui.history;

import dagger.Provides;
import dagger.Subcomponent;
import org.andmar1x.deeplinktester.domain.UseCaseModule;
import org.andmar1x.deeplinktester.common.component.ActivityComponent;
import org.andmar1x.deeplinktester.common.component.ActivityComponentBuilder;
import org.andmar1x.deeplinktester.common.module.ActivityModule;
import org.andmar1x.deeplinktester.common.scope.ActivityScope;

@ActivityScope
@Subcomponent(modules = {
        HistoryComponent.Module.class, UseCaseModule.class
})
public interface HistoryComponent
        extends ActivityComponent<HistoryActivity> {

    @Subcomponent.Builder
    interface Builder
            extends ActivityComponentBuilder<Module, HistoryComponent> {
    }

    @dagger.Module
    class Module
            extends ActivityModule<HistoryActivity> {

        Module(HistoryActivity activity) {
            super(activity);
        }

        @Provides
        public HistoryAdapter provideHistoryAdapter() {
            return new HistoryAdapter();
        }
    }
}
