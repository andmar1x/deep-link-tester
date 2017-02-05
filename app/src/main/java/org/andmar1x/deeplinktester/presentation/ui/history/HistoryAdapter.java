package org.andmar1x.deeplinktester.presentation.ui.history;

import android.support.annotation.NonNull;
import android.support.v7.widget.RecyclerView;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ImageView;
import android.widget.TextView;
import butterknife.BindView;
import butterknife.ButterKnife;
import butterknife.Unbinder;
import java.util.Collections;
import java.util.List;
import org.andmar1x.deeplinktester.R;
import org.andmar1x.deeplinktester.data.model.DeepLinkViewModel;

public class HistoryAdapter
        extends RecyclerView.Adapter<HistoryAdapter.HistoryViewHolder> {

    private List<DeepLinkViewModel> deepLinkViewModels;

    public HistoryAdapter() {
        this.deepLinkViewModels = Collections.emptyList();
        setHasStableIds(true);
    }

    public void setDeepLinkViewModels(@NonNull List<DeepLinkViewModel> deepLinkViewModels) {
        this.deepLinkViewModels = deepLinkViewModels;
        notifyDataSetChanged();
    }

    @Override
    public HistoryViewHolder onCreateViewHolder(ViewGroup parent, int viewType) {
        View itemView = LayoutInflater.from(parent.getContext())
                .inflate(R.layout.item_history, parent, false);
        return new HistoryViewHolder(itemView);
    }

    @Override
    public void onBindViewHolder(HistoryViewHolder holder, int position) {
        DeepLinkViewModel deepLinkViewModel = deepLinkViewModels.get(position);
        holder.statusImageView.setImageResource(deepLinkViewModel.success ? R.drawable.ic_success : R.drawable.ic_error);
        holder.dateTextView.setText(deepLinkViewModel.date.toString());
        holder.stringTextView.setText(deepLinkViewModel.uriString);
    }

    @Override
    public int getItemCount() {
        return deepLinkViewModels.size();
    }

    public static class HistoryViewHolder
            extends RecyclerView.ViewHolder {

        protected Unbinder unbinder;

        @BindView(R.id.image_view_status)
        protected ImageView statusImageView;

        @BindView(R.id.text_view_string)
        protected TextView stringTextView;

        @BindView(R.id.text_view_date)
        protected TextView dateTextView;

        public HistoryViewHolder(View itemView) {
            super(itemView);
            unbinder = ButterKnife.bind(this, itemView);
        }
    }
}
