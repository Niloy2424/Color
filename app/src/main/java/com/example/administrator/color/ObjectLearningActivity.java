package com.example.administrator.color;

import android.graphics.Color;
import android.media.MediaPlayer;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.view.Window;
import android.view.WindowManager;
import android.widget.AdapterView;
import android.widget.Button;
import android.widget.GridView;
import android.widget.LinearLayout;
import android.widget.TextView;

import java.util.ArrayList;

public class ObjectLearningActivity extends AppCompatActivity {
    private GridView imageGride;
    private Button leftButton;
    private Button rightButton;
    private TextView colorchangeTV;
    private LinearLayout rootLn;
    private int clickNumber;
    private ArrayList<ObjectModel> objectModels;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        requestWindowFeature(Window.FEATURE_NO_TITLE);
        getWindow().setFlags(WindowManager.LayoutParams.FLAG_FULLSCREEN,
                WindowManager.LayoutParams.FLAG_FULLSCREEN);
        setContentView(R.layout.activity_object_learning);
        imageGride= (GridView) findViewById(R.id.imageGride);
        leftButton= (Button) findViewById(R.id.leftButton);
        rightButton= (Button) findViewById(R.id.rightButton);
        rootLn= (LinearLayout) findViewById(R.id.rootLn);
        leftButton.setVisibility(View.INVISIBLE);
        colorchangeTV= (TextView) findViewById(R.id.colorchangeTV);
        clickNumber=0;
        objectModels = new ArrayList<>();
        objectModels.add(new ObjectModel("Red",R.raw.red,"#edef060a","Apple", R.raw.apple,R.drawable.apple));
        objectModels.add(new ObjectModel("Red",R.raw.red,"#edef060a","Tomato", R.raw.tomato,R.drawable.tometo));
        objectModels.add(new ObjectModel("Red",R.raw.red,"#edef060a","Rose", R.raw.rose,R.drawable.rose));
        colorchangeTV.setText(objectModels.get(0).getCategory());
      MediaPlayer mp = MediaPlayer.create(this,objectModels.get(0).getCategorySound());
        mp.start();

        ObjectAdapter adapter = new ObjectAdapter(this, objectModels);
        imageGride.setAdapter(adapter);


        imageGride.setOnItemClickListener(new AdapterView.OnItemClickListener() {
            @Override
            public void onItemClick(AdapterView<?> parent, View view, int position, long id) {
                MediaPlayer mp = MediaPlayer.create(getApplicationContext(),objectModels.get(position).getObjectSound());
                mp.start();
            }
        });

    }


    public void rootLn(View view) {

        MediaPlayer mp = MediaPlayer.create(this,objectModels.get(0).getCategorySound());
        mp.start();

    }

    public void rightButton(View view) {
        clickNumber++;
        if (clickNumber==7)
        {
            clickNumber=0;
            objectModels = new ArrayList<>();
            objectModels.add(new ObjectModel("Red",R.raw.red,"#edef060a","Apple", R.raw.apple,R.drawable.apple));
            objectModels.add(new ObjectModel("Red",R.raw.red,"#edef060a","Tomato", R.raw.tomato,R.drawable.tometo));
            objectModels.add(new ObjectModel("Red",R.raw.red,"#edef060a","Rose", R.raw.rose,R.drawable.rose));
            leftButton.setBackground(this.getResources().getDrawable(R.drawable.ic_chevron_left_black_24dp));
            rightButton.setBackground(this.getResources().getDrawable(R.drawable.ic_chevron_right_black_24dp));
            colorchangeTV.setText(objectModels.get(0).getCategory());
            colorchangeTV.setTextColor(Color.parseColor("#ffffff"));
            rootLn.setBackgroundColor(Color.parseColor("#edef060a"));
            MediaPlayer mp = MediaPlayer.create(this,objectModels.get(0).getCategorySound());
            mp.start();
        }
        else {
            changeObject();
        }

        ObjectAdapter adapter = new ObjectAdapter(this, objectModels);
        imageGride.setAdapter(adapter);
    }


    public void changeObject()
    {
        if (clickNumber==1)
        {
            leftButton.setVisibility(View.VISIBLE);
            objectModels = new ArrayList<>();
            objectModels.add(new ObjectModel("BLUE",R.raw.blue,"#0000ff","Belun", R.raw.belun,R.drawable.balloon));
            objectModels.add(new ObjectModel("BLUE",R.raw.blue,"#0000ff","Blueberry", R.raw.blueberry,R.drawable.blueberry));
            objectModels.add(new ObjectModel("BLUE",R.raw.blue,"#0000ff","Peacoke", R.raw.peakoke,R.drawable.peac));
            rootLn.setBackgroundColor(Color.parseColor("#0000ff"));
           /* leftButton.setBackgroundColor(Color.parseColor("#0000ff"));
            rightButton.setBackgroundColor(Color.parseColor("#0000ff"));*/
            leftButton.setBackground(this.getResources().getDrawable(R.drawable.ic_chevron_left_black_24dp));
            rightButton.setBackground(this.getResources().getDrawable(R.drawable.ic_chevron_right_black_24dp));
            colorchangeTV.setText(objectModels.get(0).getCategory());
            MediaPlayer mp = MediaPlayer.create(this,objectModels.get(0).getCategorySound());
            mp.start();
        }
        if (clickNumber==2)
        {
            leftButton.setVisibility(View.VISIBLE);
            objectModels = new ArrayList<>();
            objectModels.add(new ObjectModel("GREEN",R.raw.green,"#008000","Cucumber", R.raw.cucumber,R.drawable.cucumber));
            objectModels.add(new ObjectModel("GREEN",R.raw.green,"#008000","Tree", R.raw.tree,R.drawable.tree));
            objectModels.add(new ObjectModel("GREEN",R.raw.green,"#008000","Leaf", R.raw.leaf,R.drawable.leaf));
            rootLn.setBackgroundColor(Color.parseColor("#008000"));
          /*  leftButton.setBackgroundColor(Color.parseColor("#008000"));
            rightButton.setBackgroundColor(Color.parseColor("#008000"));*/
            leftButton.setBackground(this.getResources().getDrawable(R.drawable.ic_chevron_left_black_24dp));
            rightButton.setBackground(this.getResources().getDrawable(R.drawable.ic_chevron_right_black_24dp));
            colorchangeTV.setText(objectModels.get(0).getCategory());
            MediaPlayer mp = MediaPlayer.create(this,objectModels.get(0).getCategorySound());
            mp.start();
        }
        if (clickNumber==3)
        {
            leftButton.setVisibility(View.VISIBLE);
            objectModels = new ArrayList<>();
            objectModels.add(new ObjectModel("YELLOW",R.raw.yellow,"#ffff00","Banana", R.raw.banana,R.drawable.banana));
            objectModels.add(new ObjectModel("YELLOW",R.raw.yellow,"#ffff00","Corn", R.raw.corn,R.drawable.corn));
            objectModels.add(new ObjectModel("YELLOW",R.raw.yellow,"#ffff00","Sun", R.raw.sun,R.drawable.morningsun));
            rootLn.setBackgroundColor(Color.parseColor("#ffff00"));
          /*  leftButton.setBackgroundColor(Color.parseColor("#008000"));
            rightButton.setBackgroundColor(Color.parseColor("#008000"));*/
            leftButton.setBackground(this.getResources().getDrawable(R.drawable.ic_chevron_left_black_24dp));
            rightButton.setBackground(this.getResources().getDrawable(R.drawable.ic_chevron_right_black_24dp));
            colorchangeTV.setText(objectModels.get(0).getCategory());
            MediaPlayer mp = MediaPlayer.create(this,objectModels.get(0).getCategorySound());
            mp.start();
        }
        if (clickNumber==4)
        {
            leftButton.setVisibility(View.VISIBLE);
            objectModels = new ArrayList<>();
            objectModels.add(new ObjectModel("WHITE",R.raw.white,"#ffffff","Milk", R.raw.milk,R.drawable.milk));
            objectModels.add(new ObjectModel("WHITE",R.raw.white,"#ffffff","Cloud", R.raw.cloud,R.drawable.cloud));
            objectModels.add(new ObjectModel("WHITE",R.raw.white,"#ffffff","Cat", R.raw.cat,R.drawable.cat));
            rootLn.setBackgroundColor(Color.parseColor("#ffffff"));
            leftButton.setBackground(this.getResources().getDrawable(R.drawable.left));
            rightButton.setBackground(this.getResources().getDrawable(R.drawable.right));
            colorchangeTV.setText(objectModels.get(0).getCategory());
            colorchangeTV.setTextColor(Color.parseColor("#edef060a"));
            MediaPlayer mp = MediaPlayer.create(this,objectModels.get(0).getCategorySound());
            mp.start();
        }
        if (clickNumber==5)
        {
            leftButton.setVisibility(View.VISIBLE);
            objectModels = new ArrayList<>();
            objectModels.add(new ObjectModel("BLACK",R.raw.black,"#000000","Wheel", R.raw.wheel,R.drawable.carwhee));
            objectModels.add(new ObjectModel("BLACK",R.raw.black,"#000000","Crow", R.raw.crow,R.drawable.crow));
            objectModels.add(new ObjectModel("BLACK",R.raw.black,"#000000","Black cat", R.raw.blackcat,R.drawable.blackcat));
            rootLn.setBackgroundColor(Color.parseColor("#000000"));
          /*  leftButton.setBackgroundColor(Color.parseColor("#008000"));
            rightButton.setBackgroundColor(Color.parseColor("#008000"));*/
            leftButton.setBackground(this.getResources().getDrawable(R.drawable.ic_chevron_left_black_24dp));
            rightButton.setBackground(this.getResources().getDrawable(R.drawable.ic_chevron_right_black_24dp));
            colorchangeTV.setText(objectModels.get(0).getCategory());
            MediaPlayer mp = MediaPlayer.create(this,objectModels.get(0).getCategorySound());
            mp.start();
        }
        if (clickNumber==6)
        {
            leftButton.setVisibility(View.VISIBLE);
            objectModels = new ArrayList<>();
            objectModels.add(new ObjectModel("OLIVE",R.raw.olive,"#808000","OLive oil", R.raw.oliveoil,R.drawable.oliveoil));
            objectModels.add(new ObjectModel("OLIVE",R.raw.olive,"#808000","Yarn", R.raw.yarn,R.drawable.yarn));
            objectModels.add(new ObjectModel("OLIVE",R.raw.olive,"#808000","Olive apple", R.raw.oliveapple,R.drawable.oliveapple));
            rootLn.setBackgroundColor(Color.parseColor("#808000"));
          /*  leftButton.setBackgroundColor(Color.parseColor("#008000"));
            rightButton.setBackgroundColor(Color.parseColor("#008000"));*/
            colorchangeTV.setText(objectModels.get(0).getCategory());
            MediaPlayer mp = MediaPlayer.create(this,objectModels.get(0).getCategorySound());
            mp.start();
        }
    }

    public void leftButton(View view) {
        clickNumber--;
if (clickNumber<=0) {
clickNumber=0;
    objectModels = new ArrayList<>();
    objectModels.add(new ObjectModel("Red",R.raw.red,"#edef060a","Apple", R.raw.apple,R.drawable.apple));
    objectModels.add(new ObjectModel("Red",R.raw.red,"#edef060a","Tomato", R.raw.tomato,R.drawable.tometo));
    objectModels.add(new ObjectModel("Red",R.raw.red,"#edef060a","Rose", R.raw.rose,R.drawable.rose));
    colorchangeTV.setText(objectModels.get(0).getCategory());
    colorchangeTV.setTextColor(Color.parseColor("#ffffff"));
    rootLn.setBackgroundColor(Color.parseColor("#edef060a"));
    leftButton.setBackground(this.getResources().getDrawable(R.drawable.ic_chevron_left_black_24dp));
    rightButton.setBackground(this.getResources().getDrawable(R.drawable.ic_chevron_right_black_24dp));
    MediaPlayer mp = MediaPlayer.create(this,objectModels.get(0).getCategorySound());
    mp.start();

}
        else
{
    changeObject();
}


        ObjectAdapter adapter = new ObjectAdapter(this, objectModels);
        imageGride.setAdapter(adapter);

    }
}

