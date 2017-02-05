// Generated code from Butter Knife. Do not modify!
package org.andmar1x.deeplinktester.presentation.ui.history;

import android.support.annotation.CallSuper;
import android.support.annotation.UiThread;
import android.view.View;
import android.widget.ImageView;
import android.widget.TextView;
import butterknife.Unbinder;
import butterknife.internal.Utils;
import java.lang.IllegalStateException;
import java.lang.Override;
import org.andmar1x.deeplinktester.R;

public class HistoryAdapter$HistoryViewHolder_ViewBinding<T extends HistoryAdapter.HistoryViewHolder> implements Unbinder {
  protected T target;

  @UiThread
  public HistoryAdapter$HistoryViewHolder_ViewBinding(T target, View source) {
    this.target = target;

    target.statusImageView = Utils.findRequiredViewAsType(source, R.id.image_view_status, "field 'statusImageView'", ImageView.class);
    target.stringTextView = Utils.findRequiredViewAsType(source, R.id.text_view_string, "field 'stringTextView'", TextView.class);
    target.dateTextView = Utils.findRequiredViewAsType(source, R.id.text_view_date, "field 'dateTextView'", TextView.class);
  }

  @Override
  @CallSuper
  public void unbind() {
    T target = this.target;
    if (target == null) throw new IllegalStateException("Bindings already cleared.");

    target.statusImageView = null;
    target.stringTextView = null;
    target.dateTextView = null;

    this.target = null;
  }
}
