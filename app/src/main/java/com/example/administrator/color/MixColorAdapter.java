package com.example.administrator.color;

import android.content.Context;
import android.graphics.Color;
import android.media.MediaPlayer;
import android.support.annotation.NonNull;
import android.support.annotation.Nullable;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.view.animation.TranslateAnimation;
import android.widget.ArrayAdapter;
import android.widget.TextView;



import java.util.ArrayList;

/**
 * Created by Niloy Chowdhury on 2017-08-31.
 */

public class MixColorAdapter extends ArrayAdapter<MixColor> {
    private Context context;
    private ArrayList<MixColor> colors;
    public MixColorAdapter(@NonNull Context context, ArrayList<MixColor> colors) {
        super(context, R.layout.mxcolor_row_cell, colors);
        this.context=context;
        this.colors=colors;
    }

    @NonNull
    @Override
    public View getView(int position, @Nullable View convertView, @NonNull ViewGroup parent) {
        LayoutInflater inflater= (LayoutInflater) context.getSystemService(Context.LAYOUT_INFLATER_SERVICE);
        View view=inflater.inflate(R.layout.mxcolor_row_cell, parent,false);
        TextView colorTv= (TextView) view.findViewById(R.id.colorTv);

        colorTv.setText(colors.get(position).getColorName());
        colorTv.setBackgroundColor(Color.parseColor(colors.get(position).getColorValue()));


        return view;
    }

}
