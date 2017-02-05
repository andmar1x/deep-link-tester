package org.andmar1x.deeplinktester.common.component;

import android.app.Activity;

import dagger.MembersInjector;

public interface ActivityComponent<A extends Activity>
        extends MembersInjector<A> {
}
