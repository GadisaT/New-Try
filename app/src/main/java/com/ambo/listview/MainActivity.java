package com.ambo.listview;

import androidx.appcompat.app.AppCompatActivity;

import android.annotation.SuppressLint;
import android.os.Bundle;
import android.view.View;
import android.widget.AdapterView;
import android.widget.ArrayAdapter;
import android.widget.ListView;

public class MainActivity extends AppCompatActivity {
    ListView lv;
    Integer [] playerImage = {R.drawable.gado,R.drawable.alex,R.drawable.rabira,R.drawable.gadisa,R.drawable.ic_launcher_background,R.drawable.ic_launcher_background,R.drawable.ic_launcher_background,R.drawable.gado};

    String[] playerNameList = {"Gadisa Tesfu","Alex Abata","Rabiraa Gonfa","Mesay Nebelbal","Lamesa Welfana","Abraham Suyum","Tahera Bulti","Moibon Kenaket"};
    String [] playerCountry = {"Oromia","Debub","Tigray","Harar","DireDawa","Salale","Somalia","Finfinne"};
    CustomAddapter customAddapter;

    @Override
    protected void onCreate(Bundle savedInstanceState) {

        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        lv = findViewById(R.id.listviews);
//        ArrayAdapter<String> arrayAdapter = new ArrayAdapter<String>(this,R.layout.mylayout,R.id.textplayername,playerNameList);
//        lv.setAdapter(arrayAdapter);
//
//        lv.setOnItemClickListener(new AdapterView.OnItemClickListener() {
//            @Override
//            public void onItemClick(AdapterView<?> adapterView, View view, int i, long l) {
//
//            }
//        });
        customAddapter = new CustomAddapter(MainActivity.this,playerNameList,playerCountry,playerImage);
        lv.setAdapter(customAddapter);


    }
}