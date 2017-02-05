package org.andmar1x.deeplinktester.domain;

import dagger.internal.Factory;
import dagger.internal.Preconditions;
import javax.annotation.Generated;
import javax.inject.Provider;
import org.andmar1x.deeplinktester.data.DeepLinkRepository;
import org.andmar1x.deeplinktester.domain.usecase.LoadDeepLinksUseCase;

@Generated(
  value = "dagger.internal.codegen.ComponentProcessor",
  comments = "https://google.github.io/dagger"
)
public final class UseCaseModule_ProvideLoadDeepLinksUseCaseFactory
    implements Factory<LoadDeepLinksUseCase> {
  private final UseCaseModule module;

  private final Provider<DeepLinkRepository> deepLinkRepositoryProvider;

  public UseCaseModule_ProvideLoadDeepLinksUseCaseFactory(
      UseCaseModule module, Provider<DeepLinkRepository> deepLinkRepositoryProvider) {
    assert module != null;
    this.module = module;
    assert deepLinkRepositoryProvider != null;
    this.deepLinkRepositoryProvider = deepLinkRepositoryProvider;
  }

  @Override
  public LoadDeepLinksUseCase get() {
    return Preconditions.checkNotNull(
        module.provideLoadDeepLinksUseCase(deepLinkRepositoryProvider.get()),
        "Cannot return null from a non-@Nullable @Provides method");
  }

  public static Factory<LoadDeepLinksUseCase> create(
      UseCaseModule module, Provider<DeepLinkRepository> deepLinkRepositoryProvider) {
    return new UseCaseModule_ProvideLoadDeepLinksUseCaseFactory(module, deepLinkRepositoryProvider);
  }
}
