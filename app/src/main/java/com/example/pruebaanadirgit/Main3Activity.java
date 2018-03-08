package com.example.pruebaanadirgit;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;

import com.github.mikephil.charting.charts.BarChart;
import com.github.mikephil.charting.data.BarData;
import com.github.mikephil.charting.data.BarDataSet;
import com.github.mikephil.charting.data.BarEntry;

import java.util.ArrayList;

public class Main3Activity extends AppCompatActivity {

    BarChart barChart;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main3);

        barChart=(BarChart)findViewById(R.id.grafico);


        ArrayList<BarEntry> graficas = new ArrayList<>();

        graficas.add(new BarEntry(44f,0));
        graficas.add(new BarEntry(68f,1));
        graficas.add(new BarEntry(74f,2));
        graficas.add(new BarEntry(20f,3));
        graficas.add(new BarEntry(44f,4));
        graficas.add(new BarEntry(4f,5));

        BarDataSet bardataset = new BarDataSet(graficas,"Dates");



        BarData barData = new BarData(bardataset);
        barData.setBarWidth(0.9f);

        barChart.setData(barData);


    }


}
