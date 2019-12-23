package com.app.formulaenglish.ui;

import android.os.Bundle;
import android.support.design.widget.TabLayout;
import android.support.v4.view.ViewPager;
import android.view.View;
import android.widget.ImageView;

import com.app.formulaenglish.BaseActivity;
import com.app.formulaenglish.R;
import com.app.formulaenglish.adapter.FormulaPagerAdapter;

/**
 * FormulaEnglishActivity - Ngữ pháp
 */

public class FormulaEnglishActivity extends BaseActivity implements View.OnClickListener {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_formula);
        initViews();
    }

    private void initViews() {
        ImageView mImgBack = findViewById(R.id.imgBack);
        mImgBack.setOnClickListener(this);


        FormulaPagerAdapter mFormulaPagerAdapter = new FormulaPagerAdapter(getSupportFragmentManager(), this);

        /*Khai báo và set các thuộc tính TabLayout*/
        TabLayout tabLayout = findViewById(R.id.tab_layout);
        tabLayout.addTab(tabLayout.newTab().setText(getString(R.string.tab_sentence)));
        tabLayout.addTab(tabLayout.newTab().setText(getString(R.string.tab_word)));
        tabLayout.setTabGravity(TabLayout.GRAVITY_FILL);

        /*truyền dữ liệu vào cho viewPager*/
        final ViewPager viewPager = findViewById(R.id.viewPager);
        viewPager.setAdapter(mFormulaPagerAdapter);

        /*Sự kiện khi vuốt màn hình qua trái phải và chọn tab*/
        viewPager.addOnPageChangeListener(new TabLayout.TabLayoutOnPageChangeListener(tabLayout));
        tabLayout.setOnTabSelectedListener(new TabLayout.OnTabSelectedListener() {
            //khi chuyển tab thì gọi hàm này
            @Override
            public void onTabSelected(TabLayout.Tab tab) {
                /*tab.getPosition() là lấy ra vị trí của tab (tab 0 và tab1)*/
                viewPager.setCurrentItem(tab.getPosition());
            }

            @Override
            public void onTabUnselected(TabLayout.Tab tab) {
                // No-op
            }

            @Override
            public void onTabReselected(TabLayout.Tab tab) {
                // No-op
            }
        });
    }

    @Override
    protected void onResume() {
        super.onResume();
    }

    @Override
    public void onBackPressed() {
        finish();
        overridePendingTransition(R.anim.translate_still, R.anim.translate_right);
    }

    /*Khi click vào nút <- */
    @Override
    public void onClick(View view) {
        if (view.getId() == R.id.imgBack) {
            onBackPressed();
        }
    }
    /*khi chọn 1 item thi nhảy vào hàm này*/
    public void overridePendingTransition() {
        overridePendingTransition(R.anim.translate_left, R.anim.translate_still);
    }
}
