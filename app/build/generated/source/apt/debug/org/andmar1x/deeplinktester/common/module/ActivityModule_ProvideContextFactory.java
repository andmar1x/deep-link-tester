package org.andmar1x.deeplinktester.common.module;

import android.app.Activity;
import android.content.Context;
import dagger.internal.Factory;
import dagger.internal.Preconditions;
import javax.annotation.Generated;

@Generated(
  value = "dagger.internal.codegen.ComponentProcessor",
  comments = "https://google.github.io/dagger"
)
public final class ActivityModule_ProvideContextFactory<A extends Activity>
    implements Factory<Context> {
  private final ActivityModule<A> module;

  public ActivityModule_ProvideContextFactory(ActivityModule<A> module) {
    assert module != null;
    this.module = module;
  }

  @Override
  public Context get() {
    return Preconditions.checkNotNull(
        module.provideContext(), "Cannot return null from a non-@Nullable @Provides method");
  }

  public static <A extends Activity> Factory<Context> create(ActivityModule<A> module) {
    return new ActivityModule_ProvideContextFactory<A>(module);
  }
}
