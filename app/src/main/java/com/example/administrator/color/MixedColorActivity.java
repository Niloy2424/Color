package com.example.administrator.color;

import android.animation.Animator;
import android.animation.AnimatorListenerAdapter;
import android.content.Intent;
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



import java.sql.Time;
import java.util.ArrayList;


public class MixedColorActivity extends AppCompatActivity {
private ArrayList<MixColor> colors;
    private GridView colorGrids;
    private TextView colorTv1;
    MixColorAdapter adapter;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        requestWindowFeature(Window.FEATURE_NO_TITLE);
        getWindow().setFlags(WindowManager.LayoutParams.FLAG_FULLSCREEN,
                WindowManager.LayoutParams.FLAG_FULLSCREEN);
        setContentView(R.layout.activity_mixed_colors);

        colorGrids = (GridView) findViewById(R.id.colorGrids);
        colorTv1 = (TextView) findViewById(R.id.colorTv1);
        colors = new ArrayList<>();
        MixColor mx1 = new MixColor("Gold","#ffd700",R.raw.gold); colors.add(mx1);
        MixColor mx2 = new MixColor("Olive","#808000",R.raw.olive);colors.add(mx2);
        MixColor mx3 = new MixColor("Peru","#cd853f",R.raw.peru);colors.add(mx3);
        MixColor mx4 = new MixColor("Salmon","#fa8072", R.raw.salmon);colors.add(mx4);
        MixColor mx5 = new MixColor("Magenta","#ff00ff",R.raw.magenta);colors.add(mx5);
        MixColor mx6 = new MixColor("Begin","#f5f5dc", R.raw.begin);colors.add(mx6);
        MixColor mx7 = new MixColor("Lavender","#e6e6fa",R.raw.lavender);colors.add(mx7);
        MixColor mx8 = new MixColor("Thistle","#d8bfd8", R.raw.thistile);colors.add(mx8);
        MixColor mx9 = new MixColor("SkyBlue","#87ceeb",R.raw.skyblue);colors.add(mx9);
        MixColor mx10 = new MixColor("Tan","#d2b48c", R.raw.tan);colors.add(mx10);
        MixColor mx11 = new MixColor("Khaki","#f0e68c", R.raw.khaki);colors.add(mx11);
        MixColor mx12 = new MixColor("Teal","#008080", R.raw.teal);colors.add(mx12);
        MixColor mx13 = new MixColor("Violet","#ee82ee", R.raw.vilot);colors.add(mx13);
        MixColor mx14 = new MixColor("Ivory","#fffff0", R.raw.ivory);colors.add(mx14);
        MixColor mx15 = new MixColor("Orchind","#da70d6", R.raw.orchid);colors.add(mx15);
        MixColor mx16 = new MixColor("Crimson","#dc143c", R.raw.crimson);colors.add(mx16);
        MixColor mx17 = new MixColor("Seinna","#a0522d",R.raw.seinna);colors.add(mx17);
        MixColor mx18 = new MixColor("Coral","#ff7f50",R.raw.coral);colors.add(mx18);
        MixColor mx19 = new MixColor("Orange","#ffa500",R.raw.orange);colors.add(mx19);
        MixColor mx20 = new MixColor("Azore","#f0ffff",R.raw.azore);colors.add(mx20);
        MixColor mx21 = new MixColor("Bisque","#FFE4C4",R.raw.bisque);colors.add(mx21);
        MixColor mx22 = new MixColor("Pink","#FFC0CB",R.raw.pink);colors.add(mx22);
        MixColor mx23 = new MixColor("Tomato","#FF6347",R.raw.tomato);colors.add(mx23);
        MixColor mx24 = new MixColor("Wheat","#F5DEB3",R.raw.wheat);colors.add(mx24);


        playAgain();



    }
    private void playAgain(){

        adapter = new MixColorAdapter(this, colors);
        colorGrids.setAdapter(adapter);
        TranslateAnimation anim = new TranslateAnimation( -100, 0 ,0, 0 );
        anim.setDuration(1500);
        anim.setFillAfter( true );
        colorGrids.startAnimation(anim);
        colorGrids.setOnItemClickListener(new AdapterView.OnItemClickListener() {
            @Override
            public void onItemClick(AdapterView<?> parent, View view, int position, long id) {
                MediaPlayer mp = MediaPlayer.create(getApplicationContext(),colors.get(position).getColorSound());
                mp.start();
                colorGrids.animate()
                        .translationY(colorGrids.getHeight())
                        .alpha(0.0f)
                        .setDuration(1000)
                        .setListener(new AnimatorListenerAdapter() {
                            @Override
                            public void onAnimationEnd(Animator animation) {
                                super.onAnimationEnd(animation);
                                colorGrids.setVisibility(View.GONE);


                            }
                        });
                animate(100, 100, position);


            }
        });
    }
    private void animate(float x,float y, int position){
        colorTv1.setVisibility(View.VISIBLE);
        colorTv1.setText(colors.get(position).getColorName());
        colorTv1.setBackgroundColor(Color.parseColor(colors.get(position).getColorValue()));
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
