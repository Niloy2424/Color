package com.example.administrator.color;

import android.graphics.Color;
import android.media.MediaPlayer;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.view.Window;
import android.view.WindowManager;
import android.view.animation.TranslateAnimation;
import android.widget.Button;
import android.widget.TextView;

public class StandardColorActivity extends AppCompatActivity implements View.OnClickListener {
    private Button redButton, greenButton, blueButton, yellowButton, whiteButton, silverButton, blackButton, maroonButton, limeButton, aquaButton, navyButton, purppelButton;
    private TextView colorNameTV;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        requestWindowFeature(Window.FEATURE_NO_TITLE);
        getWindow().setFlags(WindowManager.LayoutParams.FLAG_FULLSCREEN,
                WindowManager.LayoutParams.FLAG_FULLSCREEN);
        setContentView(R.layout.activity_standard_color);
        redButton = (Button) findViewById(R.id.redButton);

        greenButton = (Button) findViewById(R.id.greenButton);
        blueButton = (Button) findViewById(R.id.blueButton);
        yellowButton = (Button) findViewById(R.id.yellowButton);
        whiteButton = (Button) findViewById(R.id.whiteButton);
        silverButton = (Button) findViewById(R.id.silverButton);
        blackButton = (Button) findViewById(R.id.blackButton);
        maroonButton = (Button) findViewById(R.id.maroonButton);
        limeButton = (Button) findViewById(R.id.limeButton);
        aquaButton = (Button) findViewById(R.id.aquaButton);
        navyButton = (Button) findViewById(R.id.navyButton);
        purppelButton = (Button) findViewById(R.id.purpleButton);
        colorNameTV = (TextView) findViewById(R.id.colorNameTV);
        redButton.setOnClickListener(this);
        blueButton.setOnClickListener(this);
        yellowButton.setOnClickListener(this);
        purppelButton.setOnClickListener(this);
        maroonButton.setOnClickListener(this);
        aquaButton.setOnClickListener(this);
        navyButton.setOnClickListener(this);
        greenButton.setOnClickListener(this);
        silverButton.setOnClickListener(this);
        blackButton.setOnClickListener(this);
        whiteButton.setOnClickListener(this);
        limeButton.setOnClickListener(this);

    }

    @Override
    public void onClick(View v) {
        colorNameTV.setVisibility(View.VISIBLE);
        final MediaPlayer mp;
        switch (v.getId()) {
            case R.id.redButton:
                animate(300, 150, "RED","#ff0000","#ffffff");
                mp = MediaPlayer.create(this, R.raw.red);
                mp.start();
                break;
            case R.id.blueButton:
                animate(300,175, "BLUE","#0000ff","#ffffff");
                mp = MediaPlayer.create(this, R.raw.blue);
                mp.start();
                break;
            case R.id.yellowButton:
                animate(300, 300, "YELLOW","#ffff00","#ffffff");
                mp = MediaPlayer.create(this, R.raw.yellow);
                mp.start();
                break;
            case R.id.purpleButton:
                animate(200, 300, "PURPPLE","#800080","#ffffff");
                mp = MediaPlayer.create(this, R.raw.purpple);
                mp.start();
                break;
            case R.id.maroonButton:
                animate(300, 100, "MAROON","#800000","#ffffff");
                mp = MediaPlayer.create(this, R.raw.maroon);
                mp.start();
                break;
            case R.id.aquaButton:
                animate(100, 300, "AQUA","#00ffff","#ffffff");
                mp = MediaPlayer.create(this, R.raw.aqua);
                mp.start();
                break;
            case R.id.navyButton:
                animate(300,200, "NAVY","#000080","#ffffff");
                mp = MediaPlayer.create(this, R.raw.navy);
                mp.start();
                break;
            case R.id.silverButton:
                animate(300, 300, "SILVER","#c0c0c0","#ffffff");
                mp = MediaPlayer.create(this, R.raw.silver);
                mp.start();
                break;
            case R.id.greenButton:
                animate(300, 100, "GREEN","#008000","#ffffff");
                mp = MediaPlayer.create(this, R.raw.green);
                mp.start();
                break;
            case R.id.blackButton:
                animate(300, 300, "BLACK","#000000","#ffffff");
                mp = MediaPlayer.create(this, R.raw.black);
                mp.start();
                break;
            case R.id.whiteButton:
                animate(100, 300, "WHITE","#ffffff","#000000");
                mp = MediaPlayer.create(this, R.raw.white);
                mp.start();
                break;
            case R.id.limeButton:
                animate(200, 300, "LIME","#00ff00","#ffffff");
                mp = MediaPlayer.create(this, R.raw.lime);
                mp.start();
                break;
        }

    }

    private void animate(float x, float y, String colorName,String colorValue,String textColor) {
        colorNameTV.setVisibility(View.VISIBLE);
        colorNameTV.setText(colorName);
        colorNameTV.setBackgroundColor(Color.parseColor(colorValue));
        colorNameTV.setTextColor(Color.parseColor(textColor));
        TranslateAnimation anim = new TranslateAnimation(x, 0, y, 0);
        anim.setDuration(500);
        anim.setFillAfter(true);
        colorNameTV.startAnimation(anim);


    }
}

