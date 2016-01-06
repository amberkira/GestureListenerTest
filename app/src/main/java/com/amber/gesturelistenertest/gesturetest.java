package com.amber.gesturelistenertest;

import android.app.Activity;
import android.content.Intent;
import android.os.Bundle;
import android.util.Log;
import android.view.GestureDetector;
import android.view.MotionEvent;
import android.view.SurfaceHolder;
import android.view.SurfaceView;
import android.view.View;
import android.widget.Button;
import android.widget.TextView;
import android.widget.Toast;


public class gesturetest extends Activity implements GestureDetector.OnGestureListener,SurfaceHolder.Callback {
    public SurfaceView surfaceView;
    public TextView tv;
    public Button btn;
    public GestureDetector gd;
    private SurfaceHolder holder;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_gesturetest);
        gd = new GestureDetector(this,this);
        btn= (Button) findViewById(R.id.actionbtn);
        tv= (TextView) findViewById(R.id.tv);
        surfaceView= (SurfaceView) findViewById(R.id.sur);
        btn.setOnTouchListener(new View.OnTouchListener() {
            @Override
            public boolean onTouch(View v, MotionEvent event) {
                return gd.onTouchEvent(event);
            }
        });
        btn.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent it=new Intent(gesturetest.this,Btnclickinterrupt.class);
                startActivity(it);
            }
        });
    }



    @Override
    public boolean onDown(MotionEvent e) {
        Toast.makeText(this,"Down",Toast.LENGTH_LONG).show();
        Log.i("2", "Down");
        tv.setText("Downing");
        return false;
    }

    @Override
    public void onShowPress(MotionEvent e) {

    }

    @Override
    public boolean onSingleTapUp(MotionEvent e) {
        Log.i("2","SingleTap");
        tv.setText("SingleTap");
        return false;
    }

    @Override
    public boolean onScroll(MotionEvent e1, MotionEvent e2, float distanceX, float distanceY) {
        Log.i("2", "onScroll");
        return false;
    }

    @Override
    public void onLongPress(MotionEvent e) {
        Log.i("2", "onLongPress");
    }

    @Override
    public boolean onFling(MotionEvent e1, MotionEvent e2, float velocityX, float velocityY) {
         float i=e1.getX()-e2.getX();
        Log.i("2", "onFling");
        tv.setText("onFling and"+i);
        return false;
    }

    @Override
    public void surfaceCreated(SurfaceHolder holder) {

    }

    @Override
    public void surfaceChanged(SurfaceHolder holder, int format, int width, int height) {

    }

    @Override
    public void surfaceDestroyed(SurfaceHolder holder) {

    }
}
