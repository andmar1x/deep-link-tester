// Generated code from Butter Knife. Do not modify!
package org.andmar1x.deeplinktester.presentation.ui.history;

import android.support.annotation.CallSuper;
import android.support.annotation.UiThread;
import android.support.v7.widget.RecyclerView;
import android.support.v7.widget.Toolbar;
import android.view.View;
import android.widget.FrameLayout;
import butterknife.Unbinder;
import butterknife.internal.DebouncingOnClickListener;
import butterknife.internal.Utils;
import java.lang.IllegalStateException;
import java.lang.Override;
import org.andmar1x.deeplinktester.R;

public class HistoryActivity_ViewBinding<T extends HistoryActivity> implements Unbinder {
  protected T target;

  private View view2131558520;

  @UiThread
  public HistoryActivity_ViewBinding(final T target, View source) {
    this.target = target;

    View view;
    target.toolbar = Utils.findRequiredViewAsType(source, R.id.toolbar, "field 'toolbar'", Toolbar.class);
    target.emptyLayout = Utils.findRequiredViewAsType(source, R.id.layout_empty, "field 'emptyLayout'", FrameLayout.class);
    target.linksRecyclerView = Utils.findRequiredViewAsType(source, R.id.list_view_links, "field 'linksRecyclerView'", RecyclerView.class);
    view = Utils.findRequiredView(source, R.id.fab_link_editor, "method 'onAddLinkClick'");
    view2131558520 = view;
    view.setOnClickListener(new DebouncingOnClickListener() {
      @Override
      public void doClick(View p0) {
        target.onAddLinkClick();
      }
    });
  }

  @Override
  @CallSuper
  public void unbind() {
    T target = this.target;
    if (target == null) throw new IllegalStateException("Bindings already cleared.");

    target.toolbar = null;
    target.emptyLayout = null;
    target.linksRecyclerView = null;

    view2131558520.setOnClickListener(null);
    view2131558520 = null;

    this.target = null;
  }
}
