package com.lovejoy.layouttest;

import android.content.pm.ActivityInfo;
import android.os.Bundle;
import android.support.v7.app.AppCompatActivity;
import android.view.MotionEvent;
import android.view.View;
import android.view.Window;
import android.view.WindowManager;
import android.widget.FrameLayout;

public class MainActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);

        // Must before setContentView()
        // Hide title
        requestWindowFeature(Window.FEATURE_NO_TITLE);
        // Set fullscreen
        getWindow().setFlags(WindowManager.LayoutParams.FLAG_FULLSCREEN,
                WindowManager.LayoutParams.FLAG_FULLSCREEN);

        // Keep screen
        getWindow().setFlags(WindowManager.LayoutParams.FLAG_KEEP_SCREEN_ON,
                WindowManager.LayoutParams.FLAG_KEEP_SCREEN_ON);

        setContentView(R.layout.activity_main);

        // add movable logo in frame layout
        FrameLayout frameLayout = (FrameLayout) findViewById(R.id.frameLayout);
        final LogoView logoView = new LogoView(MainActivity.this);
        logoView.setOnTouchListener(new View.OnTouchListener() {
            @Override
            public boolean onTouch(View view, MotionEvent motionEvent) {
                logoView.bitmapX = motionEvent.getX() - 150;
                logoView.bitmapY = motionEvent.getY() - 150;
                logoView.invalidate();
                return true;
            }
        });
        frameLayout.addView(logoView);
    }

    @Override
    protected void onResume() {

        // Set screen orientation as landscape
        // Or set orientation in AndroidManifest.xml
        if (getRequestedOrientation() != ActivityInfo.SCREEN_ORIENTATION_LANDSCAPE) {
            setRequestedOrientation(ActivityInfo.SCREEN_ORIENTATION_LANDSCAPE);
        }
        super.onResume();
    }
}
