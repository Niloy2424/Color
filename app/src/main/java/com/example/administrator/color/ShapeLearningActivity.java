package com.example.administrator.color;

import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.view.Window;
import android.view.WindowManager;
import android.widget.Button;

public class ShapeLearningActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        requestWindowFeature(Window.FEATURE_NO_TITLE);
        getWindow().setFlags(WindowManager.LayoutParams.FLAG_FULLSCREEN,
                WindowManager.LayoutParams.FLAG_FULLSCREEN);
        setContentView(R.layout.activity_shape_learning);
    }

    public void standardShapeButton(View view) {
        Intent intent=new Intent(ShapeLearningActivity.this,StandardShapeActivity.class);
        startActivity(intent);

    }


    public void mixedShapeButton(View view) {

        Intent intent=new Intent(ShapeLearningActivity.this,MixShapeActivity.class);
        startActivity(intent);

    }
}
