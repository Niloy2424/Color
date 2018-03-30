package com.example.administrator.color;

import android.content.ClipData;
import android.media.MediaPlayer;
import android.os.Build;
import android.os.Handler;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.DragEvent;
import android.view.MotionEvent;
import android.view.View;
import android.view.Window;
import android.view.WindowManager;
import android.view.animation.TranslateAnimation;
import android.widget.ImageView;
import android.widget.LinearLayout;

import java.util.Random;

public class PracticeColorActivity extends AppCompatActivity {
    private ImageView upBtn,greenButton,redButton, blueButton,yellowButton,limeButton,whiteButton,
            maroonStrokeButton,silverStrokeButton, purpleStrokeButton,aquaStrokeButton, blackStrokeButton,navyStrokeButton, imoji;
    private int i=1;
    private MediaPlayer mp;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        requestWindowFeature(Window.FEATURE_NO_TITLE);
        getWindow().setFlags(WindowManager.LayoutParams.FLAG_FULLSCREEN,
                WindowManager.LayoutParams.FLAG_FULLSCREEN);
        setContentView(R.layout.activity_practice_color);

        upBtn = (ImageView) findViewById(R.id.upBtn);
        greenButton = (ImageView) findViewById(R.id.greenButton);
        redButton = (ImageView) findViewById(R.id.redButton);
        blueButton = (ImageView) findViewById(R.id.blueButton);
        yellowButton = (ImageView) findViewById(R.id.yellowButton);
        limeButton = (ImageView) findViewById(R.id.limeButton);
        whiteButton = (ImageView) findViewById(R.id.whiteButton);
        maroonStrokeButton = (ImageView) findViewById(R.id.maroonStrokeButton);
        silverStrokeButton = (ImageView) findViewById(R.id.silverStrokeButton);
        navyStrokeButton = (ImageView) findViewById(R.id.navyStrokeButton);
        purpleStrokeButton = (ImageView) findViewById(R.id.purpleStrokeButton);
        aquaStrokeButton = (ImageView) findViewById(R.id.aquaStrokeButton);
        blackStrokeButton = (ImageView) findViewById(R.id.blackStrokeButton);
        imoji = (ImageView) findViewById(R.id.imoji);
        initiateButton();
        upBtn.setOnTouchListener(new ChoiceTouchListener());
        greenButton.setOnDragListener(new ChoiceDragListener());
        redButton.setOnDragListener(new ChoiceDragListener());
        blueButton.setOnDragListener(new ChoiceDragListener());
        yellowButton.setOnDragListener(new ChoiceDragListener());
        limeButton.setOnDragListener(new ChoiceDragListener());
        whiteButton.setOnDragListener(new ChoiceDragListener());
        navyStrokeButton.setOnDragListener(new ChoiceDragListener());
        maroonStrokeButton.setOnDragListener(new ChoiceDragListener());
        silverStrokeButton.setOnDragListener(new ChoiceDragListener());
        purpleStrokeButton.setOnDragListener(new ChoiceDragListener());
        aquaStrokeButton.setOnDragListener(new ChoiceDragListener());
        blackStrokeButton.setOnDragListener(new ChoiceDragListener());

    }
    private final class ChoiceTouchListener implements View.OnTouchListener{

        @Override
        public boolean onTouch(View v, MotionEvent event) {
            //if((event.getAction() == MotionEvent.ACTION_DOWN) && ((ImageView)v).getDrawable()!=null) {
            if(event.getAction() == MotionEvent.ACTION_DOWN)  {
                ClipData data = ClipData.newHtmlText("my","my","");
                View.DragShadowBuilder shadowBuilder = new View.DragShadowBuilder(v);

                if (Build.VERSION.SDK_INT >= Build.VERSION_CODES.N) {
                    v.startDragAndDrop(data, shadowBuilder,v,0);
                } else {
                    v.startDrag(data, shadowBuilder,v,0);
                }
                return true;
            }
            else

                return false;
        }
    }
    private class ChoiceDragListener implements View.OnDragListener{

        @Override
        public boolean onDrag(View v, DragEvent event) {
            switch (event.getAction()){
                case DragEvent.ACTION_DROP:
                    // ImageView view =(ImageView) event.getLocalState();
                    if((v==greenButton)&& i==0) {
                        ((ImageView) v).setImageDrawable(getResources().getDrawable(R.drawable.greenbuttonback));
                        playCongresAudio();
                       // colorTv.setText("BLUE");
                        imoji.setImageDrawable(getResources().getDrawable(R.drawable.joy));


                    }
                    else if ((v==redButton)&& i==1) {
                        ((ImageView) v).setImageDrawable(getResources().getDrawable(R.drawable.redbutton_back));
                        playCongresAudio();
                        imoji.setImageDrawable(getResources().getDrawable(R.drawable.joy));
                     //   colorTv.setText("RED");
                    }  else if ((v==blueButton)&& i==2) {
                        ((ImageView) v).setImageDrawable(getResources().getDrawable(R.drawable.bluebuttonback));
                        playCongresAudio();
                        imoji.setImageDrawable(getResources().getDrawable(R.drawable.joy));

                    } else if ((v==yellowButton)&& i==3) {
                        ((ImageView) v).setImageDrawable(getResources().getDrawable(R.drawable.yellowbuttonback));
                        playCongresAudio();
                        imoji.setImageDrawable(getResources().getDrawable(R.drawable.joy));

                    } else if ((v==limeButton)&& i==4) {
                        ((ImageView) v).setImageDrawable(getResources().getDrawable(R.drawable.limebuttonback));
                        playCongresAudio();
                        imoji.setImageDrawable(getResources().getDrawable(R.drawable.joy));

                    } else if ((v==whiteButton)&& i==5) {
                        ((ImageView) v).setImageDrawable(getResources().getDrawable(R.drawable.whitebuttonback));
                        playCongresAudio();
                        imoji.setImageDrawable(getResources().getDrawable(R.drawable.joy));

                    } else if ((v==maroonStrokeButton)&& i==6) {
                        ((ImageView) v).setImageDrawable(getResources().getDrawable(R.drawable.maroonbuttonback));
                        playCongresAudio();
                        imoji.setImageDrawable(getResources().getDrawable(R.drawable.joy));

                    } else if ((v==silverStrokeButton)&& i==7) {
                        ((ImageView) v).setImageDrawable(getResources().getDrawable(R.drawable.silverbuttonback));
                        playCongresAudio();
                        imoji.setImageDrawable(getResources().getDrawable(R.drawable.joy));

                    }else if ((v==navyStrokeButton)&& i==8) {
                        ((ImageView) v).setImageDrawable(getResources().getDrawable(R.drawable.navybuttonback));
                        playCongresAudio();
                        imoji.setImageDrawable(getResources().getDrawable(R.drawable.joy));


                    }else if ((v==purpleStrokeButton)&& i==9) {
                        ((ImageView) v).setImageDrawable(getResources().getDrawable(R.drawable.purplebuttonback));
                        playCongresAudio();
                        imoji.setImageDrawable(getResources().getDrawable(R.drawable.joy));

                    } else if ((v==aquaStrokeButton)&& i==10) {
                        ((ImageView) v).setImageDrawable(getResources().getDrawable(R.drawable.aquabuttonback));
                        playCongresAudio();
                        imoji.setImageDrawable(getResources().getDrawable(R.drawable.joy));

                    } else if ((v==blackStrokeButton)&& i==11) {
                        ((ImageView) v).setImageDrawable(getResources().getDrawable(R.drawable.blackbuttonback));
                        playCongresAudio();
                        imoji.setImageDrawable(getResources().getDrawable(R.drawable.joy));

                    }
                    else {
                     ///   colorTv.setText("TRY AGAIN");
                        playTryAgainAudio();
                        imoji.setImageDrawable(getResources().getDrawable(R.drawable.sad));
                    }
                    playAgain();

                    break;
            }
            return true;
        }
    }
    private void playAgain(){


        Handler handler = new Handler();
        handler.postDelayed(new Runnable() {
            public void run() {
                Random r = new Random();
                int i1 = r.nextInt(12);
                switch (i1){
                    case 0:
                        upBtn.setImageDrawable(getResources().getDrawable(R.drawable.greenbuttonback));
                        animate(-1000, 0);
                        i=0;
                        break;
                    case 1:
                        upBtn.setImageDrawable(getResources().getDrawable(R.drawable.redbutton_back));
                        animate(0, -1000);
                        i=1;
                        break;
                    case 2:
                        upBtn.setImageDrawable(getResources().getDrawable(R.drawable.bluebuttonback));
                        animate(0, 500);
                        i=2;
                        break;
                    case 3:
                        upBtn.setImageDrawable(getResources().getDrawable(R.drawable.yellowbuttonback));
                        animate(-500, 0);
                        i=3;
                        break;
                    case 4:
                        upBtn.setImageDrawable(getResources().getDrawable(R.drawable.limebuttonback));
                        animate(-500, 500);
                        i=4;
                        break;
                    case 5:
                        upBtn.setImageDrawable(getResources().getDrawable(R.drawable.whitebuttonback));
                        animate(-0, -500);
                        i=5;
                        break;
                    case 6:
                        upBtn.setImageDrawable(getResources().getDrawable(R.drawable.maroonbuttonback));
                        animate(-500, -100);
                        i=6;
                        break;
                    case 7:
                        upBtn.setImageDrawable(getResources().getDrawable(R.drawable.silverbuttonback));
                        animate(-400, 200);
                        i=7;
                        break;
                    case 8:
                        upBtn.setImageDrawable(getResources().getDrawable(R.drawable.navybuttonback));
                        animate(-300, 500);
                        i=8;
                        break;
                    case 9:
                        upBtn.setImageDrawable(getResources().getDrawable(R.drawable.purplebuttonback));
                        animate(-500, 500);
                        i=9;
                        break;
                    case 10:
                        upBtn.setImageDrawable(getResources().getDrawable(R.drawable.aquabuttonback));
                        animate(0, 500);
                        i=10;
                        break;
                    case 11:
                        upBtn.setImageDrawable(getResources().getDrawable(R.drawable.blackbuttonback));
                        animate(500, 500);
                        i=11;
                        break;


                }
                initiateButton();
            }
        }, 1000);

    }
    private void animate(float x,float y){
        LinearLayout root = (LinearLayout) findViewById( R.id.ineart );
        TranslateAnimation anim = new TranslateAnimation( x, 0 ,y, 0 );
        anim.setDuration(1500);
        anim.setFillAfter( true );
        root.startAnimation(anim);
    }
    private void initiateButton(){
        greenButton.setImageDrawable(getResources().getDrawable(R.drawable.greenstroke));
        redButton.setImageDrawable(getResources().getDrawable(R.drawable.redstroke));
        blueButton.setImageDrawable(getResources().getDrawable(R.drawable.bluestock));
        yellowButton.setImageDrawable(getResources().getDrawable(R.drawable.yellowstroke));
        limeButton.setImageDrawable(getResources().getDrawable(R.drawable.limestroke));
        whiteButton.setImageDrawable(getResources().getDrawable(R.drawable.whitestroke));
        maroonStrokeButton.setImageDrawable(getResources().getDrawable(R.drawable.maroonstroke));
        silverStrokeButton.setImageDrawable(getResources().getDrawable(R.drawable.silverstroke));
        navyStrokeButton.setImageDrawable(getResources().getDrawable(R.drawable.neavystroke));
        purpleStrokeButton.setImageDrawable(getResources().getDrawable(R.drawable.purplestroke));
        aquaStrokeButton.setImageDrawable(getResources().getDrawable(R.drawable.aquastroke));
        blackStrokeButton.setImageDrawable(getResources().getDrawable(R.drawable.blackstroke));
        imoji.setImageDrawable(getResources().getDrawable(R.drawable.ques));
    }
    private void playCongresAudio()
    {
        mp = MediaPlayer.create(this, R.raw.congratulation);
        mp.start();
    }
    private void playTryAgainAudio()
    {
        mp = MediaPlayer.create(this, R.raw.tryagain);
        mp.start();
    }
}
