package com.app.formulaenglish.fragment;

import android.content.Intent;
import android.net.Uri;
import android.os.Bundle;
import android.support.v4.app.Fragment;
import android.support.v7.widget.LinearLayoutManager;
import android.support.v7.widget.RecyclerView;
import android.util.Log;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;

import com.app.formulaenglish.R;
import com.app.formulaenglish.adapter.SentenceAdapter;
import com.app.formulaenglish.common.Constants;
import com.app.formulaenglish.model.Sentence;
import com.app.formulaenglish.ui.DetailActivity;
import com.app.formulaenglish.ui.FormulaEnglishActivity;
import com.app.formulaenglish.ui.SentenceChildActivity;
import com.app.formulaenglish.utils.DataUtil;

import java.util.ArrayList;
import java.util.List;

public class SentenceFragment extends Fragment implements SentenceAdapter.OnItemSentenceClickListener {
    private static final String TAG = SentenceFragment.class.getName();
    private RecyclerView mRecyclerView;
    private String mTitle;
    private int mPage;
    private SentenceAdapter mSentenceAdapter;
    private List<Sentence> mListSentences = new ArrayList<>();

    public static SentenceFragment newInstance(int page, String title) {
        SentenceFragment fragmentFirst = new SentenceFragment();
        Bundle args = new Bundle();
        args.putInt("someInt", page);
        args.putString("someTitle", title);
        fragmentFirst.setArguments(args);
        return fragmentFirst;
    }

    @Override
    public void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        mPage = getArguments().getInt("someInt", 0);
        mTitle = getArguments().getString("someTitle");
    }

    @Override
    public View onCreateView(LayoutInflater inflater, ViewGroup container,
                             Bundle savedInstanceState) {
        View view = inflater.inflate(R.layout.fragment_sentence, container, false);
        Log.d(TAG, "Select: " + mPage + " " + mTitle);
        initViews(view);
        initData();
        return view;
    }

    private void initViews(View view) {
        mRecyclerView = view.findViewById(R.id.recyclerView);
        mSentenceAdapter = new SentenceAdapter(mListSentences, getActivity(), this);

        LinearLayoutManager layoutManager = new LinearLayoutManager(getActivity());
        layoutManager.setOrientation(LinearLayoutManager.VERTICAL);
        mRecyclerView.setLayoutManager(layoutManager);

        mRecyclerView.setAdapter(mSentenceAdapter);
    }

    private void initData() {
        mListSentences.addAll(DataUtil.getSentenceData());
        mSentenceAdapter.notifyDataSetChanged();
    }

    @Override
    public void onClickItem(int position) {
        if (mListSentences.get(position).getType() == 0) {
            Intent intent = new Intent(getActivity(), DetailActivity.class);
            intent.putExtra(Constants.KEY_POSITION, position);
            intent.putExtra(Constants.KEY_CHILD, false);
            intent.putExtra(Constants.KEY_SENTENCE, true);
            startActivity(intent);
            if (getActivity() != null && getActivity() instanceof FormulaEnglishActivity) {
                ((FormulaEnglishActivity) getActivity()).overridePendingTransition();
            }
            return;
        }
        Intent intent = new Intent(getActivity(), SentenceChildActivity.class);
        intent.putExtra(Constants.KEY_POSITION, position);
        intent.putExtra(Constants.KEY_SENTENCE, true);
        startActivity(intent);
        if (getActivity() != null && getActivity() instanceof FormulaEnglishActivity) {
            ((FormulaEnglishActivity) getActivity()).overridePendingTransition();
        }
    }
}