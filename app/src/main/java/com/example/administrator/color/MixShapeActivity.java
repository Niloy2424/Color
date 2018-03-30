package com.example.administrator.color;

import android.animation.Animator;
import android.animation.AnimatorListenerAdapter;
import android.graphics.Color;
import android.media.MediaPlayer;
import android.os.Handler;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.view.Window;
import android.view.WindowManager;
import android.view.animation.TranslateAnimation;
import android.widget.AdapterView;
import android.widget.GridView;
import android.widget.TextView;

import java.util.ArrayList;

public class MixShapeActivity extends AppCompatActivity {
    public ArrayList<MixShape>shapes;
    private GridView shapeGrids;
    private TextView colorTv1;
    MixShapeAdapter adapter;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        requestWindowFeature(Window.FEATURE_NO_TITLE);
        getWindow().setFlags(WindowManager.LayoutParams.FLAG_FULLSCREEN,
                WindowManager.LayoutParams.FLAG_FULLSCREEN);
        setContentView(R.layout.activity_mix_shape);
        shapeGrids = (GridView) findViewById(R.id.shapeGrids);
        colorTv1 = (TextView) findViewById(R.id.colorTv1);
        shapes = new ArrayList<>();

        MixShape mx1 = new MixShape("pie",R.drawable.pie,R.raw.pie); shapes.add(mx1);
        MixShape mx2 = new MixShape("crescent",R.drawable.crescent,R.raw.crescent); shapes.add(mx2);
        MixShape mx3 = new MixShape("arrow",R.drawable.arrow,R.raw.arrow); shapes.add(mx3);
        MixShape mx4 = new MixShape("cube",R.drawable.cube,R.raw.cube); shapes.add(mx4);
        MixShape mx5 = new MixShape("cylinder",R.drawable.cylinder,R.raw.cylinder); shapes.add(mx5);
        MixShape mx6 = new MixShape("dodecagon",R.drawable.dodecagonudoy,R.raw.dodecagon); shapes.add(mx6);
        MixShape mx7 = new MixShape("heptagon",R.drawable.heptagon,R.raw.heptagon); shapes.add(mx7);
        MixShape mx8 = new MixShape("parallelogram",R.drawable.parallelogram,R.raw.parallelogram); shapes.add(mx8);
        MixShape mx9 = new MixShape("semicircle",R.drawable.semicircle,R.raw.semicircle); shapes.add(mx9);
        MixShape mx10 = new MixShape("star",R.drawable.star,R.raw.star); shapes.add(mx10);
        MixShape mx11 = new MixShape("trapezium",R.drawable.trapezium,R.raw.trapezium); shapes.add(mx11);
        MixShape mx12 = new MixShape("octagon",R.drawable.octagon,R.raw.octagon); shapes.add(mx12);

        playAgain();
    }



    private void playAgain(){

        adapter=new MixShapeAdapter(this,shapes);
        shapeGrids.setAdapter(adapter);
        TranslateAnimation anim = new TranslateAnimation( -100, 0 ,0, 0 );
        anim.setDuration(1500);
        anim.setFillAfter( true );
        shapeGrids.startAnimation(anim);
        shapeGrids.setOnItemClickListener(new AdapterView.OnItemClickListener() {
            @Override
            public void onItemClick(AdapterView<?> parent, View view, int position, long id) {
                MediaPlayer mp = MediaPlayer.create(getApplicationContext(),shapes.get(position).getShapeSound());
                mp.start();
                shapeGrids.animate()
                        .translationY(shapeGrids.getHeight())
                        .alpha(0.0f)
                        .setDuration(1000)
                        .setListener(new AnimatorListenerAdapter() {
                            @Override
                            public void onAnimationEnd(Animator animation) {
                                super.onAnimationEnd(animation);
                                shapeGrids.setVisibility(View.GONE);


                            }
                        });
                animate(100, 100, position);


            }
        });
    }
    private void animate(float x,float y, int position){
        colorTv1.setVisibility(View.VISIBLE);
        colorTv1.setText(shapes.get(position).getShapeName());
       // colorTv1.setBackgroundColor(Color.parseColor(shapes.get(position).getColorValue()));
        colorTv1.setBackgroundResource(shapes.get(position).getShapeValue());
        TranslateAnimation anim = new TranslateAnimation( x, 0 ,y, 0 );
        anim.setDuration(1500);
        anim.setFillAfter( true );
        colorTv1.startAnimation(anim);
        //
        Runnable r = new Runnable() {
            @Override
            public void run(){
                finish();
                overridePendingTransition(0, 0);
                startActivity(getIntent());
                overridePendingTransition(0, 0);
                // startActivity(new Intent(getApplicationContext(), MixedColorActivity.class));


            }
        };

        Handler h = new Handler();
        h.postDelayed(r, 3000);

    }
}
