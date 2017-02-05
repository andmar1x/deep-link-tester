// Generated code from Butter Knife. Do not modify!
package org.andmar1x.deeplinktester.presentation.ui.details;

import android.support.annotation.CallSuper;
import android.support.annotation.UiThread;
import android.support.v7.widget.Toolbar;
import android.text.Editable;
import android.text.TextWatcher;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.TextView;
import butterknife.Unbinder;
import butterknife.internal.DebouncingOnClickListener;
import butterknife.internal.Utils;
import java.lang.CharSequence;
import java.lang.IllegalStateException;
import java.lang.Override;
import org.andmar1x.deeplinktester.R;

public class DetailsActivity_ViewBinding<T extends DetailsActivity> implements Unbinder {
  protected T target;

  private View view2131558516;

  private TextWatcher view2131558516TextWatcher;

  private View view2131558517;

  @UiThread
  public DetailsActivity_ViewBinding(final T target, View source) {
    this.target = target;

    View view;
    target.toolbar = Utils.findRequiredViewAsType(source, R.id.toolbar, "field 'toolbar'", Toolbar.class);
    view = Utils.findRequiredView(source, R.id.edit_text_link, "field 'linkEditText' and method 'onLinkTextChanged'");
    target.linkEditText = Utils.castView(view, R.id.edit_text_link, "field 'linkEditText'", EditText.class);
    view2131558516 = view;
    view2131558516TextWatcher = new TextWatcher() {
      @Override
      public void onTextChanged(CharSequence p0, int p1, int p2, int p3) {
        target.onLinkTextChanged(p0);
      }

      @Override
      public void beforeTextChanged(CharSequence p0, int p1, int p2, int p3) {
      }

      @Override
      public void afterTextChanged(Editable p0) {
      }
    };
    ((TextView) view).addTextChangedListener(view2131558516TextWatcher);
    view = Utils.findRequiredView(source, R.id.button_launch, "field 'launchButton' and method 'onLinkClick'");
    target.launchButton = Utils.castView(view, R.id.button_launch, "field 'launchButton'", Button.class);
    view2131558517 = view;
    view.setOnClickListener(new DebouncingOnClickListener() {
      @Override
      public void doClick(View p0) {
        target.onLinkClick();
      }
    });
  }

  @Override
  @CallSuper
  public void unbind() {
    T target = this.target;
    if (target == null) throw new IllegalStateException("Bindings already cleared.");

    target.toolbar = null;
    target.linkEditText = null;
    target.launchButton = null;

    ((TextView) view2131558516).removeTextChangedListener(view2131558516TextWatcher);
    view2131558516TextWatcher = null;
    view2131558516 = null;
    view2131558517.setOnClickListener(null);
    view2131558517 = null;

    this.target = null;
  }
}
