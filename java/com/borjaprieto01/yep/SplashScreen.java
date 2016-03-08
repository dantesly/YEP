package com.borjaprieto01.yep;

import android.content.Intent;
import android.graphics.Typeface;
import android.os.Handler;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.animation.Animation;
import android.view.animation.AnimationUtils;
import android.widget.TextView;

public class SplashScreen extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_splash_screen);
        getSupportActionBar().hide();

        TextView myTitle = (TextView)findViewById(R.id.textView3);
        TextView mySubtitle = (TextView)findViewById(R.id.textView4);
        Typeface myFont = Typeface.createFromAsset(getAssets(), "AmaticSC-Regular.ttf");
        myTitle.setTypeface(myFont);
        mySubtitle.setTypeface(myFont);
        Animation shake = AnimationUtils.loadAnimation(this, R.anim.pulse_animation);
        mySubtitle.startAnimation(shake);
        abrirLogin(true);
    }

    private void abrirLogin(boolean locationPermission) {
        Handler handler = new Handler();
        handler.postDelayed(new Runnable() {
            @Override
            public void run() {
                Intent intent = new Intent(SplashScreen
                        .this,LoginActivity.class);
                startActivity(intent);
                finish();
            }
        }, 3000);
    }
}
