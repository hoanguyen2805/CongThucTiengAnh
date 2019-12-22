package com.app.formulaenglish.ui;

import android.content.Intent;
import android.os.Bundle;
import android.support.v7.widget.LinearLayoutManager;
import android.support.v7.widget.RecyclerView;
import android.view.View;
import android.widget.ImageView;
import android.widget.TextView;

import com.app.formulaenglish.BaseActivity;
import com.app.formulaenglish.R;
import com.app.formulaenglish.adapter.SentenceAdapter;
import com.app.formulaenglish.common.Constants;
import com.app.formulaenglish.model.Sentence;
import com.app.formulaenglish.utils.DataUtil;

import java.util.ArrayList;
import java.util.List;

public class SentenceChildActivity extends BaseActivity implements SentenceAdapter.OnItemSentenceClickListener {
    private RecyclerView mRecyclerView;
    private ImageView mImgBack;
    private SentenceAdapter mSentenceAdapter;
    private List<Sentence> mListSentences = new ArrayList<>();
    private int mPosition;
    private boolean mIsSentence;
    private TextView mTvTitle;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_sentence_child);
        initViews();
        initListener();
        initData();
    }

    private void initViews() {
        mImgBack = findViewById(R.id.imgBack);
        mTvTitle = findViewById(R.id.tvName);
        mRecyclerView = findViewById(R.id.recyclerView);
        mSentenceAdapter = new SentenceAdapter(mListSentences, this, this);

        LinearLayoutManager layoutManager = new LinearLayoutManager(this);
        layoutManager.setOrientation(LinearLayoutManager.VERTICAL);
        mRecyclerView.setLayoutManager(layoutManager);

        mRecyclerView.setAdapter(mSentenceAdapter);
    }

    private void initListener() {
        mImgBack.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                onBackPressed();
            }
        });
    }

    private void initData() {
        if (getIntent() == null || getIntent().getExtras() == null) {
            finish();
            return;
        }

        mPosition = getIntent().getIntExtra(Constants.KEY_POSITION, 0);
        mIsSentence = getIntent().getBooleanExtra(Constants.KEY_SENTENCE, true);

        List<Sentence> list;
        if (mIsSentence) {
            list = DataUtil.getSentenceData();
        } else {
            list = DataUtil.getWordData();
        }
        mTvTitle.setText(list.get(mPosition).getTitle());
        String[] strings = list.get(mPosition).getChildSentence();
        if (strings != null && strings.length > 0) {
            for (String string : strings) {
                Sentence sentence = new Sentence();
                sentence.setTitle(string);
                mListSentences.add(sentence);
            }
        }
        mSentenceAdapter.notifyDataSetChanged();
    }

    @Override
    public void onClickItem(int position) {
        Intent intent = new Intent(this, DetailActivity.class);
        intent.putExtra(Constants.KEY_POSITION, mPosition);
        intent.putExtra(Constants.KEY_POSITION_CHILD, position);
        intent.putExtra(Constants.KEY_CHILD, true);
        intent.putExtra(Constants.KEY_SENTENCE, mIsSentence);
        startActivity(intent);
        overridePendingTransition(R.anim.translate_left, R.anim.translate_still);
    }

    @Override
    public void onBackPressed() {
        finish();
        overridePendingTransition(R.anim.translate_still, R.anim.translate_right);
    }
}
