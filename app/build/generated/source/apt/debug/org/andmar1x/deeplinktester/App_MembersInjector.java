package org.andmar1x.deeplinktester;

import android.app.Activity;
import dagger.MembersInjector;
import java.util.Map;
import javax.annotation.Generated;
import javax.inject.Provider;
import org.andmar1x.deeplinktester.common.component.ActivityComponentBuilder;

@Generated(
  value = "dagger.internal.codegen.ComponentProcessor",
  comments = "https://google.github.io/dagger"
)
public final class App_MembersInjector implements MembersInjector<App> {
  private final Provider<Map<Class<? extends Activity>, ActivityComponentBuilder>>
      activityComponentBuildersProvider;

  public App_MembersInjector(
      Provider<Map<Class<? extends Activity>, ActivityComponentBuilder>>
          activityComponentBuildersProvider) {
    assert activityComponentBuildersProvider != null;
    this.activityComponentBuildersProvider = activityComponentBuildersProvider;
  }

  public static MembersInjector<App> create(
      Provider<Map<Class<? extends Activity>, ActivityComponentBuilder>>
          activityComponentBuildersProvider) {
    return new App_MembersInjector(activityComponentBuildersProvider);
  }

  @Override
  public void injectMembers(App instance) {
    if (instance == null) {
      throw new NullPointerException("Cannot inject members into a null reference");
    }
    instance.activityComponentBuilders = activityComponentBuildersProvider.get();
  }

  public static void injectActivityComponentBuilders(
      App instance,
      Provider<Map<Class<? extends Activity>, ActivityComponentBuilder>>
          activityComponentBuildersProvider) {
    instance.activityComponentBuilders = activityComponentBuildersProvider.get();
  }
}
