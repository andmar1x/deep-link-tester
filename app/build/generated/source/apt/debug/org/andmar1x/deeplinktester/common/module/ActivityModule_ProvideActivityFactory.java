package org.andmar1x.deeplinktester.common.module;

import android.app.Activity;
import dagger.internal.Factory;
import dagger.internal.Preconditions;
import javax.annotation.Generated;

@Generated(
  value = "dagger.internal.codegen.ComponentProcessor",
  comments = "https://google.github.io/dagger"
)
public final class ActivityModule_ProvideActivityFactory<A extends Activity> implements Factory<A> {
  private final ActivityModule<A> module;

  public ActivityModule_ProvideActivityFactory(ActivityModule<A> module) {
    assert module != null;
    this.module = module;
  }

  @Override
  public A get() {
    return Preconditions.checkNotNull(
        module.provideActivity(), "Cannot return null from a non-@Nullable @Provides method");
  }

  public static <A extends Activity> Factory<A> create(ActivityModule<A> module) {
    return new ActivityModule_ProvideActivityFactory<A>(module);
  }
}
