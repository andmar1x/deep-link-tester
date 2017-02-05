package org.andmar1x.deeplinktester.presentation.ui.history;

import dagger.MembersInjector;
import javax.annotation.Generated;
import javax.inject.Provider;

@Generated(
  value = "dagger.internal.codegen.ComponentProcessor",
  comments = "https://google.github.io/dagger"
)
public final class HistoryActivity_MembersInjector implements MembersInjector<HistoryActivity> {
  private final Provider<HistoryPresenter> presenterProvider;

  private final Provider<HistoryAdapter> historyAdapterProvider;

  public HistoryActivity_MembersInjector(
      Provider<HistoryPresenter> presenterProvider,
      Provider<HistoryAdapter> historyAdapterProvider) {
    assert presenterProvider != null;
    this.presenterProvider = presenterProvider;
    assert historyAdapterProvider != null;
    this.historyAdapterProvider = historyAdapterProvider;
  }

  public static MembersInjector<HistoryActivity> create(
      Provider<HistoryPresenter> presenterProvider,
      Provider<HistoryAdapter> historyAdapterProvider) {
    return new HistoryActivity_MembersInjector(presenterProvider, historyAdapterProvider);
  }

  @Override
  public void injectMembers(HistoryActivity instance) {
    if (instance == null) {
      throw new NullPointerException("Cannot inject members into a null reference");
    }
    org.andmar1x.deeplinktester.common.activity.MvpActivity_MembersInjector.injectPresenter(
        instance, presenterProvider);
    instance.historyAdapter = historyAdapterProvider.get();
  }

  public static void injectHistoryAdapter(
      HistoryActivity instance, Provider<HistoryAdapter> historyAdapterProvider) {
    instance.historyAdapter = historyAdapterProvider.get();
  }
}
