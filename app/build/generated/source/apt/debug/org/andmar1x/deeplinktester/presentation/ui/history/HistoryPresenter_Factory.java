package org.andmar1x.deeplinktester.presentation.ui.history;

import dagger.MembersInjector;
import dagger.internal.Factory;
import dagger.internal.MembersInjectors;
import javax.annotation.Generated;

@Generated(
  value = "dagger.internal.codegen.ComponentProcessor",
  comments = "https://google.github.io/dagger"
)
public final class HistoryPresenter_Factory implements Factory<HistoryPresenter> {
  private final MembersInjector<HistoryPresenter> historyPresenterMembersInjector;

  public HistoryPresenter_Factory(
      MembersInjector<HistoryPresenter> historyPresenterMembersInjector) {
    assert historyPresenterMembersInjector != null;
    this.historyPresenterMembersInjector = historyPresenterMembersInjector;
  }

  @Override
  public HistoryPresenter get() {
    return MembersInjectors.injectMembers(historyPresenterMembersInjector, new HistoryPresenter());
  }

  public static Factory<HistoryPresenter> create(
      MembersInjector<HistoryPresenter> historyPresenterMembersInjector) {
    return new HistoryPresenter_Factory(historyPresenterMembersInjector);
  }
}
