package com.amber.gesturelistenertest;

import android.content.Context;
import android.util.AttributeSet;
import android.util.Log;
import android.view.MotionEvent;
import android.widget.Button;

/**
 * Created by Administrator on 2016/1/6.
 */
public class bigbtn extends Button{
    public bigbtn(Context context) {
        super(context);
    }

    public bigbtn(Context context, AttributeSet attrs) {
        super(context, attrs);
    }

    public bigbtn(Context context, AttributeSet attrs, int defStyleAttr) {
        super(context, attrs, defStyleAttr);
    }

    @Override
    public boolean onTouchEvent(MotionEvent event) {
        Log.i("R", "bigbtn---onTouchEvent " + event.getAction());
        return super.onTouchEvent(event);
    }

    @Override
    public boolean dispatchTouchEvent(MotionEvent event) {
        Log.i("R", "bigbtn---dispatchTouchEvent " + event.getAction());
        return super.dispatchTouchEvent(event);
    }
}
