package org.andmar1x.deeplinktester.common.component;

import org.andmar1x.deeplinktester.App;
import org.andmar1x.deeplinktester.common.module.ActivityBindingModule;
import org.andmar1x.deeplinktester.common.module.AppModule;

import javax.inject.Singleton;

import dagger.Component;
import dagger.MembersInjector;
import org.andmar1x.deeplinktester.domain.UseCaseModule;

@Singleton
@Component(
        modules = {
                AppModule.class, ActivityBindingModule.class, UseCaseModule.class
        })
public interface AppComponent
        extends MembersInjector<App> {
}