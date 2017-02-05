package org.andmar1x.deeplinktester.data;

import dagger.internal.Factory;
import dagger.internal.Preconditions;
import javax.annotation.Generated;
import javax.inject.Provider;

@Generated(
  value = "dagger.internal.codegen.ComponentProcessor",
  comments = "https://google.github.io/dagger"
)
public final class DeepLinkModule_ProvideDeepLinkRepositoryFactory
    implements Factory<DeepLinkRepository> {
  private final DeepLinkModule module;

  private final Provider<DeepLinkDataSource> localDataSourceProvider;

  public DeepLinkModule_ProvideDeepLinkRepositoryFactory(
      DeepLinkModule module, Provider<DeepLinkDataSource> localDataSourceProvider) {
    assert module != null;
    this.module = module;
    assert localDataSourceProvider != null;
    this.localDataSourceProvider = localDataSourceProvider;
  }

  @Override
  public DeepLinkRepository get() {
    return Preconditions.checkNotNull(
        module.provideDeepLinkRepository(localDataSourceProvider.get()),
        "Cannot return null from a non-@Nullable @Provides method");
  }

  public static Factory<DeepLinkRepository> create(
      DeepLinkModule module, Provider<DeepLinkDataSource> localDataSourceProvider) {
    return new DeepLinkModule_ProvideDeepLinkRepositoryFactory(module, localDataSourceProvider);
  }
}
