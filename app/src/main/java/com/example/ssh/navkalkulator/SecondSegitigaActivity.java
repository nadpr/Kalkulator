package com.example.ssh.navkalkulator;

import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;

public class SecondSegitigaActivity extends AppCompatActivity {

    EditText alas, tinggi;
    Button reset, luas, keliling;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_second_segitiga);

        alas = (EditText) findViewById(R.id.editAlas);
        tinggi = (EditText) findViewById(R.id.editTinggi);
        reset = (Button) findViewById(R.id.buttonReset);
        luas = (Button) findViewById(R.id.buttonLuasSegitiga);
        keliling = (Button) findViewById(R.id.buttonKelilingSegitiga);
    }

    public void buttonReset(View v){
        alas.setText("");
        tinggi.setText("");
    }
    public void buttonLuasSegitiga(View v){
        double a = Double.parseDouble(alas.getText().toString());
        double t = Double.parseDouble(tinggi.getText().toString());
        double h = a*t*1/2;
        Intent intentHasilLuasSegitiga = new Intent(SecondSegitigaActivity.this, HasilLuasSegitiga.class);
        intentHasilLuasSegitiga.putExtra("h",h);
        startActivity(intentHasilLuasSegitiga);
    }
    public void buttonKelilingSegitiga(View v){
        double a = Double.parseDouble(alas.getText().toString());
        double t = Double.parseDouble(tinggi.getText().toString());
        double h = (2*t)+a;
        Intent intentHasilKelilingSegitiga = new Intent(SecondSegitigaActivity.this, HasilKelilingSegitiga.class);
        intentHasilKelilingSegitiga.putExtra("h",h);
        startActivity(intentHasilKelilingSegitiga);
    }
}
