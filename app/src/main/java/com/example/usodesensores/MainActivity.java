package com.example.usodesensores;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;

public class MainActivity extends AppCompatActivity {

    Button btn_sensoraproxi;
    Button btn_acelerometro;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        btn_sensoraproxi=(Button)findViewById(R.id.btn_sensoraproxi);
        btn_acelerometro=(Button)findViewById(R.id.btn_acelerometro);
        btn_sensoraproxi.setOnClickListener(new View.OnClickListener(){

            @Override
            public void  onClick(View view) {

                Intent btn_sensoraproxi= new Intent(MainActivity.this,Sensordeproximidad.class);
                startActivity(btn_sensoraproxi);
            }
        });
        btn_acelerometro.setOnClickListener(new View.OnClickListener()
        {



            @Override
            public void  onClick(View view) {

                Intent btn_acelerometro= new Intent(MainActivity.this,Acelerometro.class);
                startActivity(btn_acelerometro);
            }
        });
    }

}
