package org.andmar1x.deeplinktester.presentation.ui.details;

import dagger.MembersInjector;
import dagger.internal.Factory;
import dagger.internal.MembersInjectors;
import javax.annotation.Generated;

@Generated(
  value = "dagger.internal.codegen.ComponentProcessor",
  comments = "https://google.github.io/dagger"
)
public final class DetailsPresenter_Factory implements Factory<DetailsPresenter> {
  private final MembersInjector<DetailsPresenter> detailsPresenterMembersInjector;

  public DetailsPresenter_Factory(
      MembersInjector<DetailsPresenter> detailsPresenterMembersInjector) {
    assert detailsPresenterMembersInjector != null;
    this.detailsPresenterMembersInjector = detailsPresenterMembersInjector;
  }

  @Override
  public DetailsPresenter get() {
    return MembersInjectors.injectMembers(detailsPresenterMembersInjector, new DetailsPresenter());
  }

  public static Factory<DetailsPresenter> create(
      MembersInjector<DetailsPresenter> detailsPresenterMembersInjector) {
    return new DetailsPresenter_Factory(detailsPresenterMembersInjector);
  }
}
