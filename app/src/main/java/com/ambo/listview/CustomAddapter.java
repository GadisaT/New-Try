package com.ambo.listview;

import android.app.Activity;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ArrayAdapter;
import android.widget.ImageView;
import android.widget.TextView;

public class CustomAddapter extends ArrayAdapter {
    Activity context;
    String[] playerName;
    String[] playerCountry;
    Integer[] playerImage;

    public CustomAddapter(Activity context,String[] playerName,String[] playerCountry,Integer[] playerImage){
        super(context,R.layout.mylayout2,playerName);
        this.context=context;
        this.playerName=playerName;
        this.playerCountry=playerCountry;
        this.playerImage=playerImage;
    }
    public View getView(int pos, View view, ViewGroup vg){
        LayoutInflater inflater=context.getLayoutInflater();
        View rowView=inflater.inflate(R.layout.mylayout2, null,true);

        TextView tvPlayerName = (TextView) rowView.findViewById(R.id.name);
        ImageView  ivPlayerImage  = (ImageView) rowView.findViewById(R.id.imageView1);
        TextView tvPlayerCountry = (TextView) rowView.findViewById(R.id.country);

        ivPlayerImage.setImageResource(playerImage[pos]);
        tvPlayerName.setText(playerName[pos]);
        tvPlayerCountry.setText(playerCountry[pos]);

           return rowView;

    }
}
