package org.andmar1x.deeplinktester.common.module;

import android.app.Activity;
import android.support.v4.app.FragmentManager;
import dagger.internal.Factory;
import dagger.internal.Preconditions;
import javax.annotation.Generated;

@Generated(
  value = "dagger.internal.codegen.ComponentProcessor",
  comments = "https://google.github.io/dagger"
)
public final class ActivityModule_ProvideFragmentManagerFactory<A extends Activity>
    implements Factory<FragmentManager> {
  private final ActivityModule<A> module;

  public ActivityModule_ProvideFragmentManagerFactory(ActivityModule<A> module) {
    assert module != null;
    this.module = module;
  }

  @Override
  public FragmentManager get() {
    return Preconditions.checkNotNull(
        module.provideFragmentManager(),
        "Cannot return null from a non-@Nullable @Provides method");
  }

  public static <A extends Activity> Factory<FragmentManager> create(ActivityModule<A> module) {
    return new ActivityModule_ProvideFragmentManagerFactory<A>(module);
  }
}
