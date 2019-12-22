package com.app.formulaenglish.adapter;


import android.annotation.SuppressLint;
import android.content.Context;
import android.support.v7.widget.RecyclerView;
import android.text.TextUtils;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.RelativeLayout;
import android.widget.TextView;

import com.app.formulaenglish.R;
import com.app.formulaenglish.model.Sentence;

import java.util.ArrayList;
import java.util.List;

public class SentenceAdapter extends RecyclerView.Adapter<SentenceAdapter.SentenceHolder> {

    private OnItemSentenceClickListener mOnItemSentenceClickListener;
    private List<Sentence> mList = new ArrayList<>();
    private Context mContext;


    public SentenceAdapter(List<Sentence> list, Context context, OnItemSentenceClickListener onItemSentenceClickListener) {
        mList = list;
        mContext = context;
        mOnItemSentenceClickListener = onItemSentenceClickListener;
    }

    @Override
    public SentenceHolder onCreateViewHolder(ViewGroup parent, int viewType) {
        View view = LayoutInflater.from(mContext).inflate(R.layout.item_sentence, parent, false);
        return new SentenceHolder(view);
    }

    @SuppressLint("SetTextI18n")
    @Override
    public void onBindViewHolder(SentenceHolder holder, int position) {
        if (mList != null && mList.size() > 0) {
            holder.tvTitle.setText(String.valueOf(position + 1) + ". " + mList.get(position).getTitle());
            if (TextUtils.isEmpty(mList.get(position).getDescription())) {
                holder.tvDescription.setVisibility(View.GONE);
            } else {
                holder.tvDescription.setVisibility(View.VISIBLE);
                holder.tvDescription.setText(mList.get(position).getDescription());
            }
        }
    }

    @Override
    public int getItemCount() {
        if (mList != null) {
            return mList.size();
        }
        return 0;
    }

    class SentenceHolder extends RecyclerView.ViewHolder {
        private final RelativeLayout content;
        private final TextView tvTitle;
        private final TextView tvDescription;

        SentenceHolder(View itemView) {
            super(itemView);
            content = itemView.findViewById(R.id.rlContent);
            tvTitle = itemView.findViewById(R.id.tvTitle);
            tvDescription = itemView.findViewById(R.id.tvDescription);
            content.setOnClickListener(new View.OnClickListener() {
                @Override
                public void onClick(View v) {
                    if (mOnItemSentenceClickListener != null) {
                        mOnItemSentenceClickListener.onClickItem(getAdapterPosition());
                    }
                }
            });
        }
    }

    public interface OnItemSentenceClickListener {
        void onClickItem(int position);
    }
}
