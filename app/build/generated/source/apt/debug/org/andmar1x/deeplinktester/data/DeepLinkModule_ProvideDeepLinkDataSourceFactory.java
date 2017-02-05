package org.andmar1x.deeplinktester.data;

import dagger.internal.Factory;
import dagger.internal.Preconditions;
import javax.annotation.Generated;

@Generated(
  value = "dagger.internal.codegen.ComponentProcessor",
  comments = "https://google.github.io/dagger"
)
public final class DeepLinkModule_ProvideDeepLinkDataSourceFactory
    implements Factory<DeepLinkDataSource> {
  private final DeepLinkModule module;

  public DeepLinkModule_ProvideDeepLinkDataSourceFactory(DeepLinkModule module) {
    assert module != null;
    this.module = module;
  }

  @Override
  public DeepLinkDataSource get() {
    return Preconditions.checkNotNull(
        module.provideDeepLinkDataSource(),
        "Cannot return null from a non-@Nullable @Provides method");
  }

  public static Factory<DeepLinkDataSource> create(DeepLinkModule module) {
    return new DeepLinkModule_ProvideDeepLinkDataSourceFactory(module);
  }
}
