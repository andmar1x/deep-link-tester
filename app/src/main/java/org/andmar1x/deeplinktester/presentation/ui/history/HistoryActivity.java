package org.andmar1x.deeplinktester.presentation.ui.history;

import android.os.Bundle;
import android.support.annotation.NonNull;
import android.support.v7.widget.DividerItemDecoration;
import android.support.v7.widget.LinearLayoutManager;
import android.support.v7.widget.RecyclerView;
import android.support.v7.widget.Toolbar;
import android.view.View;
import android.widget.FrameLayout;

import org.andmar1x.deeplinktester.R;
import org.andmar1x.deeplinktester.common.activity.MvpActivity;
import org.andmar1x.deeplinktester.common.component.HasActivitySubcomponentBuilders;
import org.andmar1x.deeplinktester.common.widget.RecyclerViewClickListener;
import org.andmar1x.deeplinktester.common.widget.RecyclerViewTouchListener;
import org.andmar1x.deeplinktester.data.model.DeepLinkViewModel;
import org.andmar1x.deeplinktester.presentation.ui.details.DetailsActivity;

import java.util.List;

import javax.inject.Inject;

import butterknife.BindView;
import butterknife.ButterKnife;
import butterknife.OnClick;
import butterknife.Unbinder;

public class HistoryActivity
        extends MvpActivity<HistoryView, HistoryPresenter>
        implements HistoryView, RecyclerViewClickListener {

    @Inject
    protected HistoryAdapter historyAdapter;

    protected Unbinder unbinder;

    @BindView(R.id.toolbar)
    protected Toolbar toolbar;

    @BindView(R.id.layout_empty)
    protected FrameLayout emptyLayout;

    @BindView(R.id.list_view_links)
    protected RecyclerView linksRecyclerView;

    @Override
    protected void inject(@NonNull HasActivitySubcomponentBuilders hasActivitySubcomponentBuilders) {
        ((HistoryComponent.Builder) hasActivitySubcomponentBuilders.getActivityComponentBuilder(
                HistoryActivity.class)).activityModule(new HistoryComponent.Module(this))
                .build()
                .injectMembers(this);
    }

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_history);

        unbinder = ButterKnife.bind(this);

        setSupportActionBar(toolbar);

        linksRecyclerView.addOnItemTouchListener(new RecyclerViewTouchListener(this, this));
        linksRecyclerView.addItemDecoration(new DividerItemDecoration(this, LinearLayoutManager.VERTICAL));
        linksRecyclerView.setLayoutManager(new LinearLayoutManager(this));
        linksRecyclerView.setAdapter(historyAdapter);
    }

    @Override
    protected void onDestroy() {
        super.onDestroy();
        unbinder.unbind();
    }

    @Override
    public void showData(@NonNull List<DeepLinkViewModel> deepLinkViewModels) {
        emptyLayout.setVisibility(View.GONE);
        linksRecyclerView.setVisibility(View.VISIBLE);
        historyAdapter.setDeepLinkViewModels(deepLinkViewModels);
    }

    @Override
    public void showEmpty() {
        linksRecyclerView.setVisibility(View.GONE);
        emptyLayout.setVisibility(View.VISIBLE);
    }

    @Override
    public void openDetails(String deepLinkString) {
        startActivity(DetailsActivity.newIntent(this, deepLinkString));
    }

    @Override
    public void onClick(@NonNull View view, int position) {
        presenter.openLinkEditor(position);
    }

    @OnClick(R.id.fab_link_editor)
    public void onAddLinkClick() {
        presenter.openLinkEditor(null);
    }
}
