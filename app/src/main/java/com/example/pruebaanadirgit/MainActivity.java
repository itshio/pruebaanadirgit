package com.example.pruebaanadirgit;

import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.TextView;

public class MainActivity extends AppCompatActivity {

    TextView suma;
    int parametro;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        suma=(TextView)findViewById(R.id.textosumado);


    }

    public void sumar (View view) {

        if(parametro<100){
            parametro=parametro+1;

            suma.setText(parametro+"");}



    }

    public void click_grafica ( View view){

        Intent fomr_stats = new Intent(getApplicationContext(),Main3Activity.class);
        startActivity(fomr_stats);
    }


}
