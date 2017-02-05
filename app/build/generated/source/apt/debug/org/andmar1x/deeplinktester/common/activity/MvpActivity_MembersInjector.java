package org.andmar1x.deeplinktester.common.activity;

import dagger.MembersInjector;
import javax.annotation.Generated;
import javax.inject.Provider;
import org.andmar1x.deeplinktester.common.presenter.MvpPresenter;
import org.andmar1x.deeplinktester.common.view.MvpView;

@Generated(
  value = "dagger.internal.codegen.ComponentProcessor",
  comments = "https://google.github.io/dagger"
)
public final class MvpActivity_MembersInjector<V extends MvpView, P extends MvpPresenter<V>>
    implements MembersInjector<MvpActivity<V, P>> {
  private final Provider<P> presenterProvider;

  public MvpActivity_MembersInjector(Provider<P> presenterProvider) {
    assert presenterProvider != null;
    this.presenterProvider = presenterProvider;
  }

  public static <V extends MvpView, P extends MvpPresenter<V>>
      MembersInjector<MvpActivity<V, P>> create(Provider<P> presenterProvider) {
    return new MvpActivity_MembersInjector<V, P>(presenterProvider);
  }

  @Override
  public void injectMembers(MvpActivity<V, P> instance) {
    if (instance == null) {
      throw new NullPointerException("Cannot inject members into a null reference");
    }
    instance.presenter = presenterProvider.get();
  }

  public static <V extends MvpView, P extends MvpPresenter<V>> void injectPresenter(
      MvpActivity<V, P> instance, Provider<P> presenterProvider) {
    instance.presenter = presenterProvider.get();
  }
}
