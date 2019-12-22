package com.app.formulaenglish.views.item;

import android.content.Context;
import android.support.annotation.Nullable;
import android.util.AttributeSet;


public class CustomImage extends android.support.v7.widget.AppCompatImageView {
    public CustomImage(Context context) {
        super(context);
    }

    public CustomImage(Context context, @Nullable AttributeSet attrs) {
        super(context, attrs);
    }

    public CustomImage(Context context, @Nullable AttributeSet attrs, int defStyleAttr) {
        super(context, attrs, defStyleAttr);
    }

    @Override
    protected void onMeasure(int widthMeasureSpec, int heightMeasureSpec) {
        super.onMeasure(widthMeasureSpec, heightMeasureSpec);

        int width = getMeasuredWidth();
        setMeasuredDimension(width, width * 9 / 16);
    }
}
