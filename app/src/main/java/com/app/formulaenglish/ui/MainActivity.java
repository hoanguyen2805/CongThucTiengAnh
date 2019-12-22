package com.app.formulaenglish.ui;
import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.ImageView;
import com.app.formulaenglish.BaseActivity;
import com.app.formulaenglish.R;

public class MainActivity extends BaseActivity implements View.OnClickListener {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        initViews();
    }

    public void initViews() {
        ImageView mImgCreateVideo = findViewById(R.id.imgCreateVideo);
        ImageView mImgMyVideo = findViewById(R.id.imgMyVideo);
        mImgCreateVideo.setOnClickListener(this);
        mImgMyVideo.setOnClickListener(this);
    }

    @Override
    protected void onResume() {
        super.onResume();
    }

    @Override
    public void onClick(View view) {
        //nếu click vào ngữ pháp
        if (view.getId() == R.id.imgCreateVideo) {
            startActivity(new Intent(MainActivity.this, FormulaEnglishActivity.class));
            overridePendingTransition(R.anim.translate_left, R.anim.translate_still);
            return;
        }
        //nếu click vào thông tin
        if (view.getId() == R.id.imgMyVideo) {
            startActivity(new Intent(MainActivity.this, InformationActivity.class));
            overridePendingTransition(R.anim.translate_left, R.anim.translate_still);
            return;
        }
    }

}
