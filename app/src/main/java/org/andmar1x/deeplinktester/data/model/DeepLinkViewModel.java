package org.andmar1x.deeplinktester.data.model;

import java.util.Date;

import io.reactivex.functions.Function;

public class DeepLinkViewModel {

    public static final Function<DeepLink, DeepLinkViewModel> FROM_DEEP_LINK_MAPPER = deepLink -> {
        DeepLinkViewModel deepLinkViewModel = new DeepLinkViewModel();
        deepLinkViewModel.uriString = deepLink.uriString;
        deepLinkViewModel.success = deepLink.status > 0;
        deepLinkViewModel.date = new Date(deepLink.timestamp);
        return deepLinkViewModel;
    };

    public String uriString;

    public boolean success;

    public Date date;
}
