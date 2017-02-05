package org.andmar1x.deeplinktester.common.presenter;

import android.support.annotation.CallSuper;
import android.support.annotation.NonNull;
import android.support.annotation.Nullable;

import org.andmar1x.deeplinktester.common.view.MvpView;

import java.lang.ref.WeakReference;

import io.reactivex.disposables.CompositeDisposable;

public class BasePresenter<V extends MvpView>
        implements MvpPresenter<V> {

    private WeakReference<V> viewRef;

    protected final CompositeDisposable compositeDisposable = new CompositeDisposable();

    @CallSuper
    @Override
    public void attachView(@NonNull V view) {
        this.viewRef = new WeakReference<>(view);
    }

    @CallSuper
    @Override
    public void detachView() {
        if (viewRef != null) {
            viewRef.clear();
        }
        compositeDisposable.clear();
    }

    public final void checkViewAttached() {
        if (!isViewAttached()) {
            throw new MvpViewNotAttachedException();
        }
    }

    public final boolean isViewAttached() {
        return getView() != null;
    }

    @Nullable
    public final V getView() {
        return viewRef != null ? viewRef.get() : null;
    }

    public static class MvpViewNotAttachedException extends RuntimeException {
        public MvpViewNotAttachedException() {
            super("Please call Presenter.attachView(MvpView) before requesting data to the Presenter");
        }
    }
}
