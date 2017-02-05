package org.andmar1x.deeplinktester.presentation.ui.details;

import android.content.Context;
import android.content.Intent;
import android.net.Uri;
import android.os.Bundle;
import android.support.annotation.NonNull;
import android.support.v7.app.ActionBar;
import android.support.v7.widget.Toolbar;
import android.text.TextUtils;
import android.view.MenuItem;
import android.widget.Button;
import android.widget.EditText;
import butterknife.*;
import org.andmar1x.deeplinktester.R;
import org.andmar1x.deeplinktester.common.activity.MvpActivity;
import org.andmar1x.deeplinktester.common.component.HasActivitySubcomponentBuilders;

public class DetailsActivity
        extends MvpActivity<DetailsView, DetailsPresenter>
        implements DetailsView {

    protected Unbinder unbinder;

    @BindView(R.id.toolbar)
    protected Toolbar toolbar;

    @BindView(R.id.edit_text_link)
    protected EditText linkEditText;

    @BindView(R.id.button_launch)
    protected Button launchButton;

    public static Intent newIntent(@NonNull Context context, @NonNull String uriString) {
        Intent intent = new Intent(context, DetailsActivity.class);
        intent.putExtra(DetailsPresenter.KEY_LINK_STRING, uriString);
        return intent;
    }

    @Override
    protected void inject(@NonNull HasActivitySubcomponentBuilders hasActivitySubcomponentBuilders) {
        ((DetailsComponent.Builder)hasActivitySubcomponentBuilders.getActivityComponentBuilder(
                DetailsActivity.class)).activityModule(new DetailsComponent.Module(this))
                .build()
                .injectMembers(this);
    }

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_details);

        unbinder = ButterKnife.bind(this);

        setSupportActionBar(toolbar);
        ActionBar actionBar = getSupportActionBar();
        if (actionBar != null) {
            actionBar.setDisplayHomeAsUpEnabled(true);
        }

        presenter.resolveExtras(getIntent());
    }

    @Override
    protected void onDestroy() {
        super.onDestroy();
        unbinder.unbind();
    }

    @Override
    public boolean onOptionsItemSelected(MenuItem item) {
        int id = item.getItemId();
        if (id == android.R.id.home) {
            finish();
            return true;
        }
        return super.onOptionsItemSelected(item);
    }

    @Override
    public void setUriString(String uriString) {
        linkEditText.setText(uriString);
    }

    @Override
    public void openLink() {
        boolean success = false;
        String uriString = linkEditText.getText()
                .toString();
        try {
            Intent intent = new Intent(Intent.ACTION_VIEW);
            intent.setData(Uri.parse(uriString));
            startActivity(intent);
            success = true;
        } catch (Exception ignored) {
        }
        presenter.addDeepLink(uriString, success);
    }

    @OnClick(R.id.button_launch)
    public void onLinkClick() {
        presenter.launchLink();
    }

    @OnTextChanged(R.id.edit_text_link)
    public void onLinkTextChanged(CharSequence s) {
        launchButton.setEnabled(!TextUtils.isEmpty(s));
    }
}
