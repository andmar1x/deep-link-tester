package org.andmar1x.deeplinktester.presentation.ui.history;

import dagger.MembersInjector;
import javax.annotation.Generated;
import javax.inject.Provider;
import org.andmar1x.deeplinktester.domain.usecase.LoadDeepLinksUseCase;

@Generated(
  value = "dagger.internal.codegen.ComponentProcessor",
  comments = "https://google.github.io/dagger"
)
public final class HistoryPresenter_MembersInjector implements MembersInjector<HistoryPresenter> {
  private final Provider<LoadDeepLinksUseCase> loadDeepLinksUseCaseProvider;

  public HistoryPresenter_MembersInjector(
      Provider<LoadDeepLinksUseCase> loadDeepLinksUseCaseProvider) {
    assert loadDeepLinksUseCaseProvider != null;
    this.loadDeepLinksUseCaseProvider = loadDeepLinksUseCaseProvider;
  }

  public static MembersInjector<HistoryPresenter> create(
      Provider<LoadDeepLinksUseCase> loadDeepLinksUseCaseProvider) {
    return new HistoryPresenter_MembersInjector(loadDeepLinksUseCaseProvider);
  }

  @Override
  public void injectMembers(HistoryPresenter instance) {
    if (instance == null) {
      throw new NullPointerException("Cannot inject members into a null reference");
    }
    instance.loadDeepLinksUseCase = loadDeepLinksUseCaseProvider.get();
  }

  public static void injectLoadDeepLinksUseCase(
      HistoryPresenter instance, Provider<LoadDeepLinksUseCase> loadDeepLinksUseCaseProvider) {
    instance.loadDeepLinksUseCase = loadDeepLinksUseCaseProvider.get();
  }
}
