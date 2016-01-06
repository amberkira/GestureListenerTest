package com.amber.gesturelistenertest;

import android.app.Activity;
import android.os.Bundle;
import android.util.Log;
import android.view.View;

/**
 * Created by Administrator on 2016/1/6.
 */
public class Btnclickinterrupt extends Activity{

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.btnlayout);
    }

    public void test(View v){
        switch (v.getId()){
            case R.id.small:
                Log.i("record","small one");
            case R.id.big:
                Log.i("record","big one");


        }

    }
}
