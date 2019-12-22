package com.app.formulaenglish.ui;

import android.annotation.SuppressLint;
import android.os.Bundle;
import android.view.View;
import android.webkit.WebView;
import android.widget.ImageView;
import android.widget.TextView;

import com.app.formulaenglish.BaseActivity;
import com.app.formulaenglish.R;
import com.app.formulaenglish.common.Constants;
import com.app.formulaenglish.model.Sentence;
import com.app.formulaenglish.utils.DataUtil;

import java.util.List;

public class DetailActivity extends BaseActivity {

    private WebView mWebView;
    private TextView mTvTitle;
    private ImageView mImgBack;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_detail);
        initViews();
        initData();
    }

    private void initViews() {
        mWebView = findViewById(R.id.webView);
        mTvTitle = findViewById(R.id.tvName);
        mImgBack = findViewById(R.id.imgBack);

        mImgBack.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                onBackPressed();
            }
        });
    }

    @SuppressLint({"SetJavaScriptEnabled"})
    private void initData() {
        if (getIntent() == null || getIntent().getExtras() == null) {
            finish();
            return;
        }

        int position = getIntent().getIntExtra(Constants.KEY_POSITION, 0);
        int positionChild = getIntent().getIntExtra(Constants.KEY_POSITION_CHILD, 0);
        boolean isChild = getIntent().getBooleanExtra(Constants.KEY_CHILD, false);
        boolean isSentence = getIntent().getBooleanExtra(Constants.KEY_SENTENCE, false);

        List<Sentence> list;
        if (isSentence) {
            list = DataUtil.getSentenceData();
        } else {
            list = DataUtil.getWordData();
        }

        if (isChild) {
            mTvTitle.setText(list.get(position).getChildSentence()[positionChild]);
        } else {
            mTvTitle.setText(list.get(position).getTitle());
        }

        if (list.size() > 0) {
            String html;
            if (!isChild) {
                html = list.get(position).getFileName() + ".html";
            } else {
                html = list.get(position).getFileNameChild()[positionChild] + ".html";
            }
            if (isSentence) {
                html = "sentence/" + html;
            } else {
                html = "word/" + html;
            }

            mWebView.loadUrl("file:///android_asset/" + html);
            mWebView.getSettings().setJavaScriptEnabled(true);
            mWebView.getSettings().setUseWideViewPort(true);

            /*mWebView.requestFocus(View.FOCUS_DOWN);
            mWebView.requestFocusFromTouch();*/
        }
    }

    @Override
    public void onBackPressed() {
        finish();
        overridePendingTransition(R.anim.translate_still, R.anim.translate_right);
    }
}
