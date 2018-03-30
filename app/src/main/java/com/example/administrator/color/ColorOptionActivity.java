package com.example.administrator.color;

import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.view.Window;
import android.view.WindowManager;

public class ColorOptionActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        requestWindowFeature(Window.FEATURE_NO_TITLE);
        getWindow().setFlags(WindowManager.LayoutParams.FLAG_FULLSCREEN,
                WindowManager.LayoutParams.FLAG_FULLSCREEN);
        setContentView(R.layout.activity_colors_list);
    }

    public void objectButton(View view) {

        Intent intent=new Intent(this,ObjectLearningActivity.class);
        startActivity(intent);
    }

    public void colorButton(View view) {

        Intent intent=new Intent(ColorOptionActivity.this,ColorLearningActivity.class);
        startActivity(intent);

    }

    public void practiceButton(View view) {
        Intent intent=new Intent(ColorOptionActivity.this,PracticeColorActivity.class);
        startActivity(intent);
    }
}
