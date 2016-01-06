package com.amber.gesturelistenertest;

import android.content.Context;
import android.util.AttributeSet;
import android.util.Log;
import android.view.MotionEvent;
import android.widget.Button;

/**
 * Created by Administrator on 2016/1/6.
 */
public class smallbtn extends Button {

    public smallbtn(Context context, AttributeSet attrs) {
        super(context, attrs);

    }

    public smallbtn(Context context) {
        super(context);
    }

    public smallbtn(Context context, AttributeSet attrs, int defStyleAttr) {
        super(context, attrs, defStyleAttr);
    }



    @Override
    public boolean onTouchEvent(MotionEvent event) {
        Log.i("R","smallbtn---onTouchEvent"+event.getAction());
        return super.onTouchEvent(event);
    }

    @Override
    public boolean dispatchTouchEvent(MotionEvent event) {
        Log.i("R","smallbtn---dispatchTouchEvent"+event.getAction());
        return super.dispatchTouchEvent(event);
    }
}
