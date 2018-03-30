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

public class StandardShapeActivity extends AppCompatActivity implements View.OnClickListener {
public Button squreButton;
public Button rectangelButton;
public Button circelButton;
public Button crossButton;
public Button triangelButton;
public Button ovalButton;
public Button diamondButton;
public Button hexagonButton;
    public TextView shapesTV;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        requestWindowFeature(Window.FEATURE_NO_TITLE);
        getWindow().setFlags(WindowManager.LayoutParams.FLAG_FULLSCREEN,
                WindowManager.LayoutParams.FLAG_FULLSCREEN);
        requestWindowFeature(Window.FEATURE_NO_TITLE);
        getWindow().setFlags(WindowManager.LayoutParams.FLAG_FULLSCREEN,
                WindowManager.LayoutParams.FLAG_FULLSCREEN);
        setContentView(R.layout.activity_standard_shape);
        squreButton= (Button) findViewById(R.id.squreButton);
        rectangelButton= (Button) findViewById(R.id.rectangleButton);
        circelButton= (Button) findViewById(R.id.circelButton);
        crossButton= (Button) findViewById(R.id.crossButton);
        triangelButton= (Button) findViewById(R.id.triangleButton);
        ovalButton= (Button) findViewById(R.id.ovalButton);
        diamondButton= (Button) findViewById(R.id.diamondButton);
        hexagonButton= (Button) findViewById(R.id.hexagonButton);
        shapesTV= (TextView) findViewById(R.id.shapesTV);
        squreButton.setOnClickListener(this);
        rectangelButton.setOnClickListener(this);
        circelButton.setOnClickListener(this);
        crossButton.setOnClickListener(this);
        triangelButton.setOnClickListener(this);
        ovalButton.setOnClickListener(this);
        diamondButton.setOnClickListener(this);
        hexagonButton.setOnClickListener(this);

    }

    @Override
    public void onClick(View v) {

        shapesTV.setVisibility(View.VISIBLE);
        final MediaPlayer mp;
        switch (v.getId()) {
            case R.id.squreButton:
                animate(300, 150, "SQUARE","#ff0000","#ffffff");
                mp = MediaPlayer.create(this, R.raw.square);
                mp.start();
                break;
            case R.id.rectangleButton:
                animate(300,175, "RECTANGLE","#0000ff","#ffffff");
                mp = MediaPlayer.create(this, R.raw.ractangle);
                mp.start();
                break;
            case R.id.circelButton:
                animate(300, 300, "CIRCLE","#ffff00","#ffffff");
                mp = MediaPlayer.create(this, R.raw.circle);
                mp.start();
                break;
            case R.id.triangleButton:
                animate(200, 300, "TRIANGLE","#800080","#ffffff");
                mp = MediaPlayer.create(this, R.raw.triangle);
                mp.start();
                break;
            case R.id.crossButton:
                animate(200, 300, "CROSS","#800080","#ffffff");
                mp = MediaPlayer.create(this, R.raw.cross);
                mp.start();
                break;
            case R.id.ovalButton:
                animate(300, 100, "OVAL","#800000","#ffffff");
                mp = MediaPlayer.create(this, R.raw.oval);
                mp.start();
                break;
            case R.id.diamondButton:
                animate(100, 300, "DIAMOND","#00ffff","#ffffff");
                mp = MediaPlayer.create(this, R.raw.diamond);
                mp.start();
                break;
            case R.id.hexagonButton:
                animate(300,200, "HEXAGON","#000080","#ffffff");
                mp = MediaPlayer.create(this, R.raw.hexagon);
                mp.start();
                break;
        }
    }
    private void animate(float x, float y, String colorName,String colorValue,String textColor) {
        shapesTV.setVisibility(View.VISIBLE);
        shapesTV.setText(colorName);
        shapesTV.setBackgroundColor(Color.parseColor(colorValue));
        shapesTV.setTextColor(Color.parseColor(textColor));
        TranslateAnimation anim = new TranslateAnimation(x, 0, y, 0);
        anim.setDuration(500);
        anim.setFillAfter(true);
        shapesTV.startAnimation(anim);


    }
}
