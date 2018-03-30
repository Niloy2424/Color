package com.example.administrator.color;

import android.content.Context;
import android.graphics.Color;
import android.media.MediaPlayer;
import android.support.annotation.NonNull;
import android.support.annotation.Nullable;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ArrayAdapter;
import android.widget.ImageView;
import android.widget.TextView;

import java.util.ArrayList;

/**
 * Created by Administrator on 12/25/2017.
 */

public class ObjectAdapter extends ArrayAdapter<ObjectModel> {
    private Context context;
    private ArrayList<ObjectModel> objects;
    public ObjectAdapter(@NonNull Context context, ArrayList<ObjectModel> objects) {
        super(context, R.layout.object_row_cell, objects);
        this.context=context;
        this.objects=objects;
    }

    @NonNull
    @Override
    public View getView(int position, @Nullable View convertView, @NonNull ViewGroup parent) {
        LayoutInflater inflater= (LayoutInflater) context.getSystemService(Context.LAYOUT_INFLATER_SERVICE);
        View view=inflater.inflate(R.layout.object_row_cell, parent,false);
        ImageView objectImg= (ImageView) view.findViewById(R.id.objectImg);
        TextView objectTv = (TextView) view.findViewById(R.id.objectTv);

        objectImg.setImageDrawable(context.getResources().getDrawable(objects.get(position).getObjectImg()));
        objectTv.setText(objects.get(position).getObjectName());
        /*MediaPlayer mp = MediaPlayer.create(context,objects.get(position).getObjectSound());
        mp.start();*/



        return view;
    }
}
