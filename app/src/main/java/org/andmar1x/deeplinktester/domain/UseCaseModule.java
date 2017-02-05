package org.andmar1x.deeplinktester.domain;

import android.support.annotation.NonNull;
import dagger.Module;
import dagger.Provides;
import org.andmar1x.deeplinktester.data.DeepLinkRepository;
import org.andmar1x.deeplinktester.data.DeepLinkModule;
import org.andmar1x.deeplinktester.domain.usecase.LoadDeepLinksUseCase;
import org.andmar1x.deeplinktester.domain.usecase.UpdateDeepLinksUseCase;

@Module(includes = DeepLinkModule.class)
public class UseCaseModule {

    @Provides
    public LoadDeepLinksUseCase provideLoadDeepLinksUseCase(@NonNull DeepLinkRepository deepLinkRepository) {
        return new LoadDeepLinksUseCase(deepLinkRepository);
    }

    @Provides
    public UpdateDeepLinksUseCase provideUpdateDeepLinksUseCase(@NonNull DeepLinkRepository deepLinkRepository) {
        return new UpdateDeepLinksUseCase(deepLinkRepository);
    }
}
