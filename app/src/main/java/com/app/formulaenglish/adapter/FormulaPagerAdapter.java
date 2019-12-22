package com.app.formulaenglish.adapter;


import android.content.Context;
import android.support.v4.app.Fragment;
import android.support.v4.app.FragmentManager;
import android.support.v4.app.FragmentStatePagerAdapter;

import com.app.formulaenglish.R;
import com.app.formulaenglish.fragment.SentenceFragment;
import com.app.formulaenglish.fragment.WordFragment;

public class FormulaPagerAdapter extends FragmentStatePagerAdapter {
    private Context mContext;

    public FormulaPagerAdapter(FragmentManager fm, Context context) {
        super(fm);
        mContext = context;
    }

    /*khi chọn tab thì vào hàm này để lấy dữ liệu*/
    @Override
    public Fragment getItem(int position) {
        switch (position) {
            case 0:
                return SentenceFragment.newInstance(0, mContext.getString(R.string.tab_sentence));
            case 1:
                return WordFragment.newInstance(1, mContext.getString(R.string.tab_word));
            default:
                return null;
        }
    }

    @Override
    public int getCount() {
        return 2;
    }

    @Override
    public CharSequence getPageTitle(int position) {
        return "Page " + position;
    }
}
