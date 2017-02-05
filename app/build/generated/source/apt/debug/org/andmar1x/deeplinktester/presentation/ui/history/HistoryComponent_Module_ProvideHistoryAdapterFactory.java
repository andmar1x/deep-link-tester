package org.andmar1x.deeplinktester.presentation.ui.history;

import dagger.internal.Factory;
import dagger.internal.Preconditions;
import javax.annotation.Generated;

@Generated(
  value = "dagger.internal.codegen.ComponentProcessor",
  comments = "https://google.github.io/dagger"
)
public final class HistoryComponent_Module_ProvideHistoryAdapterFactory
    implements Factory<HistoryAdapter> {
  private final HistoryComponent.Module module;

  public HistoryComponent_Module_ProvideHistoryAdapterFactory(HistoryComponent.Module module) {
    assert module != null;
    this.module = module;
  }

  @Override
  public HistoryAdapter get() {
    return Preconditions.checkNotNull(
        module.provideHistoryAdapter(), "Cannot return null from a non-@Nullable @Provides method");
  }

  public static Factory<HistoryAdapter> create(HistoryComponent.Module module) {
    return new HistoryComponent_Module_ProvideHistoryAdapterFactory(module);
  }
}
