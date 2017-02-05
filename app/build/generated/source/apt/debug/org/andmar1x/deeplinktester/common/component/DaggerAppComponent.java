package org.andmar1x.deeplinktester.common.component;

import android.app.Activity;
import dagger.MembersInjector;
import dagger.internal.Factory;
import dagger.internal.MapFactory;
import dagger.internal.MapProviderFactory;
import dagger.internal.Preconditions;
import java.util.Map;
import javax.annotation.Generated;
import javax.inject.Provider;
import org.andmar1x.deeplinktester.App;
import org.andmar1x.deeplinktester.App_MembersInjector;
import org.andmar1x.deeplinktester.common.module.AppModule;
import org.andmar1x.deeplinktester.data.DeepLinkDataSource;
import org.andmar1x.deeplinktester.data.DeepLinkModule;
import org.andmar1x.deeplinktester.data.DeepLinkModule_ProvideDeepLinkDataSourceFactory;
import org.andmar1x.deeplinktester.data.DeepLinkModule_ProvideDeepLinkRepositoryFactory;
import org.andmar1x.deeplinktester.data.DeepLinkRepository;
import org.andmar1x.deeplinktester.domain.UseCaseModule;
import org.andmar1x.deeplinktester.domain.UseCaseModule_ProvideLoadDeepLinksUseCaseFactory;
import org.andmar1x.deeplinktester.domain.UseCaseModule_ProvideUpdateDeepLinksUseCaseFactory;
import org.andmar1x.deeplinktester.domain.usecase.LoadDeepLinksUseCase;
import org.andmar1x.deeplinktester.domain.usecase.UpdateDeepLinksUseCase;
import org.andmar1x.deeplinktester.presentation.ui.details.DetailsActivity;
import org.andmar1x.deeplinktester.presentation.ui.details.DetailsActivity_MembersInjector;
import org.andmar1x.deeplinktester.presentation.ui.details.DetailsComponent;
import org.andmar1x.deeplinktester.presentation.ui.details.DetailsPresenter;
import org.andmar1x.deeplinktester.presentation.ui.details.DetailsPresenter_Factory;
import org.andmar1x.deeplinktester.presentation.ui.details.DetailsPresenter_MembersInjector;
import org.andmar1x.deeplinktester.presentation.ui.history.HistoryActivity;
import org.andmar1x.deeplinktester.presentation.ui.history.HistoryActivity_MembersInjector;
import org.andmar1x.deeplinktester.presentation.ui.history.HistoryAdapter;
import org.andmar1x.deeplinktester.presentation.ui.history.HistoryComponent;
import org.andmar1x.deeplinktester.presentation.ui.history.HistoryComponent_Module_ProvideHistoryAdapterFactory;
import org.andmar1x.deeplinktester.presentation.ui.history.HistoryPresenter;
import org.andmar1x.deeplinktester.presentation.ui.history.HistoryPresenter_Factory;
import org.andmar1x.deeplinktester.presentation.ui.history.HistoryPresenter_MembersInjector;

@Generated(
  value = "dagger.internal.codegen.ComponentProcessor",
  comments = "https://google.github.io/dagger"
)
public final class DaggerAppComponent implements AppComponent {
  private Provider<HistoryComponent.Builder> historyComponentBuilderProvider;

  private Provider<ActivityComponentBuilder> homeComponentBuilderProvider;

  private Provider<DetailsComponent.Builder> detailsComponentBuilderProvider;

  private Provider<ActivityComponentBuilder> valueComponentBuilderProvider;

  private Provider<Map<Class<? extends Activity>, Provider<ActivityComponentBuilder>>>
      mapOfClassOfAndProviderOfActivityComponentBuilderProvider;

  private Provider<Map<Class<? extends Activity>, ActivityComponentBuilder>>
      mapOfClassOfAndActivityComponentBuilderProvider;

  private MembersInjector<App> appMembersInjector;

  private final DeepLinkModule deepLinkModule;

  private final UseCaseModule useCaseModule;

  private DaggerAppComponent(Builder builder) {
    assert builder != null;
    initialize(builder);
    this.deepLinkModule = builder.deepLinkModule;
    this.useCaseModule = builder.useCaseModule;
  }

  public static Builder builder() {
    return new Builder();
  }

  public static AppComponent create() {
    return builder().build();
  }

  @SuppressWarnings("unchecked")
  private void initialize(final Builder builder) {

    this.historyComponentBuilderProvider =
        new Factory<HistoryComponent.Builder>() {
          @Override
          public HistoryComponent.Builder get() {
            return new HistoryComponentBuilder();
          }
        };

    this.homeComponentBuilderProvider = (Provider) historyComponentBuilderProvider;

    this.detailsComponentBuilderProvider =
        new Factory<DetailsComponent.Builder>() {
          @Override
          public DetailsComponent.Builder get() {
            return new DetailsComponentBuilder();
          }
        };

    this.valueComponentBuilderProvider = (Provider) detailsComponentBuilderProvider;

    this.mapOfClassOfAndProviderOfActivityComponentBuilderProvider =
        MapProviderFactory.<Class<? extends Activity>, ActivityComponentBuilder>builder(2)
            .put(HistoryActivity.class, homeComponentBuilderProvider)
            .put(DetailsActivity.class, valueComponentBuilderProvider)
            .build();

    this.mapOfClassOfAndActivityComponentBuilderProvider =
        MapFactory.create(mapOfClassOfAndProviderOfActivityComponentBuilderProvider);

    this.appMembersInjector =
        App_MembersInjector.create(mapOfClassOfAndActivityComponentBuilderProvider);
  }

  @Override
  public void injectMembers(App arg0) {
    appMembersInjector.injectMembers(arg0);
  }

  public static final class Builder {
    private DeepLinkModule deepLinkModule;

    private UseCaseModule useCaseModule;

    private Builder() {}

    public AppComponent build() {
      if (deepLinkModule == null) {
        this.deepLinkModule = new DeepLinkModule();
      }
      if (useCaseModule == null) {
        this.useCaseModule = new UseCaseModule();
      }
      return new DaggerAppComponent(this);
    }

    /**
     * @deprecated This module is declared, but an instance is not used in the component. This method is a no-op. For more, see https://google.github.io/dagger/unused-modules.
     */
    @Deprecated
    public Builder appModule(AppModule appModule) {
      Preconditions.checkNotNull(appModule);
      return this;
    }

    public Builder useCaseModule(UseCaseModule useCaseModule) {
      this.useCaseModule = Preconditions.checkNotNull(useCaseModule);
      return this;
    }

    public Builder deepLinkModule(DeepLinkModule deepLinkModule) {
      this.deepLinkModule = Preconditions.checkNotNull(deepLinkModule);
      return this;
    }
  }

  private final class HistoryComponentBuilder implements HistoryComponent.Builder {
    private HistoryComponent.Module module;

    @Override
    public HistoryComponent build() {
      if (module == null) {
        throw new IllegalStateException(
            HistoryComponent.Module.class.getCanonicalName() + " must be set");
      }
      return new HistoryComponentImpl(this);
    }

    @Override
    public HistoryComponentBuilder activityModule(HistoryComponent.Module module) {
      this.module = Preconditions.checkNotNull(module);
      return this;
    }
  }

  private final class HistoryComponentImpl implements HistoryComponent {
    private Provider<DeepLinkDataSource> provideDeepLinkDataSourceProvider;

    private Provider<DeepLinkRepository> provideDeepLinkRepositoryProvider;

    private Provider<LoadDeepLinksUseCase> provideLoadDeepLinksUseCaseProvider;

    private MembersInjector<HistoryPresenter> historyPresenterMembersInjector;

    private Provider<HistoryPresenter> historyPresenterProvider;

    private Provider<HistoryAdapter> provideHistoryAdapterProvider;

    private MembersInjector<HistoryActivity> historyActivityMembersInjector;

    private HistoryComponentImpl(HistoryComponentBuilder builder) {
      assert builder != null;
      initialize(builder);
    }

    @SuppressWarnings("unchecked")
    private void initialize(final HistoryComponentBuilder builder) {

      this.provideDeepLinkDataSourceProvider =
          DeepLinkModule_ProvideDeepLinkDataSourceFactory.create(deepLinkModule);

      this.provideDeepLinkRepositoryProvider =
          DeepLinkModule_ProvideDeepLinkRepositoryFactory.create(
              deepLinkModule, provideDeepLinkDataSourceProvider);

      this.provideLoadDeepLinksUseCaseProvider =
          UseCaseModule_ProvideLoadDeepLinksUseCaseFactory.create(
              useCaseModule, provideDeepLinkRepositoryProvider);

      this.historyPresenterMembersInjector =
          HistoryPresenter_MembersInjector.create(provideLoadDeepLinksUseCaseProvider);

      this.historyPresenterProvider =
          HistoryPresenter_Factory.create(historyPresenterMembersInjector);

      this.provideHistoryAdapterProvider =
          HistoryComponent_Module_ProvideHistoryAdapterFactory.create(builder.module);

      this.historyActivityMembersInjector =
          HistoryActivity_MembersInjector.create(
              historyPresenterProvider, provideHistoryAdapterProvider);
    }

    @Override
    public void injectMembers(HistoryActivity arg0) {
      historyActivityMembersInjector.injectMembers(arg0);
    }
  }

  private final class DetailsComponentBuilder implements DetailsComponent.Builder {
    @Override
    public DetailsComponent build() {
      return new DetailsComponentImpl(this);
    }

    /**
     * This module is declared, but an instance is not used in the component. This method is a no-op. For more, see https://google.github.io/dagger/unused-modules.
     */
    @Override
    public DetailsComponentBuilder activityModule(DetailsComponent.Module module) {
      return this;
    }
  }

  private final class DetailsComponentImpl implements DetailsComponent {
    private Provider<DeepLinkDataSource> provideDeepLinkDataSourceProvider;

    private Provider<DeepLinkRepository> provideDeepLinkRepositoryProvider;

    private Provider<UpdateDeepLinksUseCase> provideUpdateDeepLinksUseCaseProvider;

    private MembersInjector<DetailsPresenter> detailsPresenterMembersInjector;

    private Provider<DetailsPresenter> detailsPresenterProvider;

    private MembersInjector<DetailsActivity> detailsActivityMembersInjector;

    private DetailsComponentImpl(DetailsComponentBuilder builder) {
      assert builder != null;
      initialize(builder);
    }

    @SuppressWarnings("unchecked")
    private void initialize(final DetailsComponentBuilder builder) {

      this.provideDeepLinkDataSourceProvider =
          DeepLinkModule_ProvideDeepLinkDataSourceFactory.create(deepLinkModule);

      this.provideDeepLinkRepositoryProvider =
          DeepLinkModule_ProvideDeepLinkRepositoryFactory.create(
              deepLinkModule, provideDeepLinkDataSourceProvider);

      this.provideUpdateDeepLinksUseCaseProvider =
          UseCaseModule_ProvideUpdateDeepLinksUseCaseFactory.create(
              useCaseModule, provideDeepLinkRepositoryProvider);

      this.detailsPresenterMembersInjector =
          DetailsPresenter_MembersInjector.create(provideUpdateDeepLinksUseCaseProvider);

      this.detailsPresenterProvider =
          DetailsPresenter_Factory.create(detailsPresenterMembersInjector);

      this.detailsActivityMembersInjector =
          DetailsActivity_MembersInjector.create(detailsPresenterProvider);
    }

    @Override
    public void injectMembers(DetailsActivity arg0) {
      detailsActivityMembersInjector.injectMembers(arg0);
    }
  }
}
