package com.borjaprieto01.yep;

import android.content.Intent;
import android.graphics.Typeface;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.TextView;

public class LoginActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_login);
        getSupportActionBar().hide();
        TextView myTitle = (TextView)findViewById(R.id.textView);
        TextView mySubtitle = (TextView)findViewById(R.id.textView2);
        Typeface myFont = Typeface.createFromAsset(getAssets(), "AmaticSC-Regular.ttf");
        myTitle.setTypeface(myFont);
        mySubtitle.setTypeface(myFont);
    }

    public void onClickButton(View v){
        Intent intent = new Intent(LoginActivity
                .this,MainActivity.class);
        startActivity(intent);
    }
}
