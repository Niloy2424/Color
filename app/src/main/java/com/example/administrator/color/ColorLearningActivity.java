package com.example.administrator.color;

import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.view.Window;
import android.view.WindowManager;

public class ColorLearningActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        requestWindowFeature(Window.FEATURE_NO_TITLE);
        getWindow().setFlags(WindowManager.LayoutParams.FLAG_FULLSCREEN,
                WindowManager.LayoutParams.FLAG_FULLSCREEN);
        setContentView(R.layout.activity_color_learning);
    }

    public void mixedColorButton(View view) {
        Intent intent=new Intent(ColorLearningActivity.this,MixedColorActivity.class);
        startActivity(intent);


    }

    public void standardColorButton(View view) {

        Intent intent=new Intent(ColorLearningActivity.this,StandardColorActivity.class);
        startActivity(intent);

    }
}
