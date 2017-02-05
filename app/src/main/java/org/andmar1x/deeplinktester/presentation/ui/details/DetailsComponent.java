package org.andmar1x.deeplinktester.presentation.ui.details;

import org.andmar1x.deeplinktester.domain.UseCaseModule;
import org.andmar1x.deeplinktester.common.component.ActivityComponent;
import org.andmar1x.deeplinktester.common.component.ActivityComponentBuilder;
import org.andmar1x.deeplinktester.common.module.ActivityModule;
import org.andmar1x.deeplinktester.common.scope.ActivityScope;

import dagger.Subcomponent;

@ActivityScope
@Subcomponent(
        modules = {
                DetailsComponent.Module.class,
                UseCaseModule.class
        })
public interface DetailsComponent
        extends ActivityComponent<DetailsActivity> {

    @Subcomponent.Builder
    interface Builder
            extends ActivityComponentBuilder<Module, DetailsComponent> {
    }

    @dagger.Module
    class Module
            extends ActivityModule<DetailsActivity> {

        Module(DetailsActivity activity) {
            super(activity);
        }
    }
}
