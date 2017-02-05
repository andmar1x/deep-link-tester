package org.andmar1x.deeplinktester.presentation.ui.details;

import dagger.MembersInjector;
import javax.annotation.Generated;
import javax.inject.Provider;

@Generated(
  value = "dagger.internal.codegen.ComponentProcessor",
  comments = "https://google.github.io/dagger"
)
public final class DetailsActivity_MembersInjector implements MembersInjector<DetailsActivity> {
  private final Provider<DetailsPresenter> presenterProvider;

  public DetailsActivity_MembersInjector(Provider<DetailsPresenter> presenterProvider) {
    assert presenterProvider != null;
    this.presenterProvider = presenterProvider;
  }

  public static MembersInjector<DetailsActivity> create(
      Provider<DetailsPresenter> presenterProvider) {
    return new DetailsActivity_MembersInjector(presenterProvider);
  }

  @Override
  public void injectMembers(DetailsActivity instance) {
    if (instance == null) {
      throw new NullPointerException("Cannot inject members into a null reference");
    }
    org.andmar1x.deeplinktester.common.activity.MvpActivity_MembersInjector.injectPresenter(
        instance, presenterProvider);
  }
}
