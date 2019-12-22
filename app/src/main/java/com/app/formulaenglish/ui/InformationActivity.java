package com.app.formulaenglish.ui;

import android.os.Bundle;
import android.view.View;
import android.widget.ImageView;

import com.app.formulaenglish.BaseActivity;
import com.app.formulaenglish.R;
/**
 * Thông tin
 */

public class InformationActivity extends BaseActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_information);
        initViews();
    }

    private void initViews() {
        ImageView mImgBack = findViewById(R.id.imgBack);
        mImgBack.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                onBackPressed();
            }
        });
    }

    @Override
    public void onBackPressed() {
        finish();
        overridePendingTransition(R.anim.translate_still, R.anim.translate_right);
    }
}
