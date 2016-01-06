package com.amber.gesturelistenertest;


import android.widget.ImageView;
import android.widget.TextView;

/**
 * Created by Administrator on 2016/1/4.
 */
public class Adapter {
    Holder holder=new Holder();

    protected final class Holder{
        public ImageView imageView;
        public TextView textView;
    }
}
