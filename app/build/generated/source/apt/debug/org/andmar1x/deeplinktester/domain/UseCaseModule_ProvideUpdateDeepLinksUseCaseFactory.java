package org.andmar1x.deeplinktester.domain;

import dagger.internal.Factory;
import dagger.internal.Preconditions;
import javax.annotation.Generated;
import javax.inject.Provider;
import org.andmar1x.deeplinktester.data.DeepLinkRepository;
import org.andmar1x.deeplinktester.domain.usecase.UpdateDeepLinksUseCase;

@Generated(
  value = "dagger.internal.codegen.ComponentProcessor",
  comments = "https://google.github.io/dagger"
)
public final class UseCaseModule_ProvideUpdateDeepLinksUseCaseFactory
    implements Factory<UpdateDeepLinksUseCase> {
  private final UseCaseModule module;

  private final Provider<DeepLinkRepository> deepLinkRepositoryProvider;

  public UseCaseModule_ProvideUpdateDeepLinksUseCaseFactory(
      UseCaseModule module, Provider<DeepLinkRepository> deepLinkRepositoryProvider) {
    assert module != null;
    this.module = module;
    assert deepLinkRepositoryProvider != null;
    this.deepLinkRepositoryProvider = deepLinkRepositoryProvider;
  }

  @Override
  public UpdateDeepLinksUseCase get() {
    return Preconditions.checkNotNull(
        module.provideUpdateDeepLinksUseCase(deepLinkRepositoryProvider.get()),
        "Cannot return null from a non-@Nullable @Provides method");
  }

  public static Factory<UpdateDeepLinksUseCase> create(
      UseCaseModule module, Provider<DeepLinkRepository> deepLinkRepositoryProvider) {
    return new UseCaseModule_ProvideUpdateDeepLinksUseCaseFactory(
        module, deepLinkRepositoryProvider);
  }
}
