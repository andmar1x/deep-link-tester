package org.andmar1x.deeplinktester.presentation.ui.details;

import dagger.MembersInjector;
import javax.annotation.Generated;
import javax.inject.Provider;
import org.andmar1x.deeplinktester.domain.usecase.UpdateDeepLinksUseCase;

@Generated(
  value = "dagger.internal.codegen.ComponentProcessor",
  comments = "https://google.github.io/dagger"
)
public final class DetailsPresenter_MembersInjector implements MembersInjector<DetailsPresenter> {
  private final Provider<UpdateDeepLinksUseCase> updateDeepLinksUseCaseProvider;

  public DetailsPresenter_MembersInjector(
      Provider<UpdateDeepLinksUseCase> updateDeepLinksUseCaseProvider) {
    assert updateDeepLinksUseCaseProvider != null;
    this.updateDeepLinksUseCaseProvider = updateDeepLinksUseCaseProvider;
  }

  public static MembersInjector<DetailsPresenter> create(
      Provider<UpdateDeepLinksUseCase> updateDeepLinksUseCaseProvider) {
    return new DetailsPresenter_MembersInjector(updateDeepLinksUseCaseProvider);
  }

  @Override
  public void injectMembers(DetailsPresenter instance) {
    if (instance == null) {
      throw new NullPointerException("Cannot inject members into a null reference");
    }
    instance.updateDeepLinksUseCase = updateDeepLinksUseCaseProvider.get();
  }

  public static void injectUpdateDeepLinksUseCase(
      DetailsPresenter instance, Provider<UpdateDeepLinksUseCase> updateDeepLinksUseCaseProvider) {
    instance.updateDeepLinksUseCase = updateDeepLinksUseCaseProvider.get();
  }
}
