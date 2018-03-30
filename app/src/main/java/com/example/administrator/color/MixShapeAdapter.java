package com.example.administrator.color;

import android.content.Context;
import android.graphics.Color;
import android.support.annotation.NonNull;
import android.support.annotation.Nullable;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ArrayAdapter;
import android.widget.TextView;

import java.util.ArrayList;

/**
 * Created by Administrator on 1/2/2018.
 */


    public class MixShapeAdapter extends ArrayAdapter<MixShape> {
        private Context context;
        private ArrayList<MixShape> shapes;

        public MixShapeAdapter(@NonNull Context context, ArrayList<MixShape> shapes) {
            super(context, R.layout.mxcolor_row_cell, shapes);
            this.context = context;
            this.shapes = shapes;
        }

        @NonNull
        @Override
        public View getView(int position, @Nullable View convertView, @NonNull ViewGroup parent) {
            LayoutInflater inflater = (LayoutInflater) context.getSystemService(Context.LAYOUT_INFLATER_SERVICE);
            View view = inflater.inflate(R.layout.mxcolor_row_cell, parent, false);
            TextView colorTv = (TextView) view.findViewById(R.id.colorTv);

            colorTv.setText(shapes.get(position).getShapeName());
            //colorTv.setBackgroundColor(Color.parseColor(shapes.get(position).getColorValue()));
            colorTv.setBackgroundResource(shapes.get(position).getShapeValue());


            return view;
        }
    }

