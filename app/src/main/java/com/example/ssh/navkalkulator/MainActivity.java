package com.example.ssh.navkalkulator;

import android.content.Intent;
import android.os.Bundle;
import android.support.v7.app.AppCompatActivity;
import android.view.View;
import android.widget.Button;

public class MainActivity extends AppCompatActivity {

    Button persegi, segitiga;


    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        persegi = (Button) findViewById(R.id.buttonPersegi);
        segitiga = (Button) findViewById(R.id.buttonSegitiga);

        persegi.setOnClickListener(new View.OnClickListener(){
            @Override
            public void onClick(View v){
                Intent intentPersegi = new Intent(MainActivity.this, SecondActivity.class);
                startActivity(intentPersegi);
            }
        });
        segitiga.setOnClickListener(new View.OnClickListener(){
            @Override
            public void onClick(View v){
                Intent intentSegitiga = new Intent(MainActivity.this, SecondSegitigaActivity.class);
                startActivity(intentSegitiga);
            }
        });
    }
}
