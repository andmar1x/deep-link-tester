package org.andmar1x.deeplinktester.data;

import dagger.internal.Factory;
import javax.annotation.Generated;
import javax.inject.Provider;

@Generated(
  value = "dagger.internal.codegen.ComponentProcessor",
  comments = "https://google.github.io/dagger"
)
public final class DeepLinkRepository_Factory implements Factory<DeepLinkRepository> {
  private final Provider<DeepLinkDataSource> localDataSourceProvider;

  public DeepLinkRepository_Factory(Provider<DeepLinkDataSource> localDataSourceProvider) {
    assert localDataSourceProvider != null;
    this.localDataSourceProvider = localDataSourceProvider;
  }

  @Override
  public DeepLinkRepository get() {
    return new DeepLinkRepository(localDataSourceProvider.get());
  }

  public static Factory<DeepLinkRepository> create(
      Provider<DeepLinkDataSource> localDataSourceProvider) {
    return new DeepLinkRepository_Factory(localDataSourceProvider);
  }
}
