package com.example.ssh.navkalkulator;

import android.content.Intent;
import android.os.Bundle;
import android.support.v7.app.AppCompatActivity;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;

public class SecondActivity extends AppCompatActivity {

    EditText alas, tinggi;
    Button reset, luas, keliling;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_second);

        alas = (EditText) findViewById(R.id.editLebar);
        tinggi = (EditText) findViewById(R.id.editPanjang);
        reset = (Button) findViewById(R.id.buttonReset);
        luas = (Button) findViewById(R.id.buttonLuasPersegi);
        keliling = (Button) findViewById(R.id.buttonKelilingPersegi);
    }
    public void buttonReset(View v){
        alas.setText("");
        tinggi.setText("");
    }
    public void buttonLuasPersegi(View v){
        double a = Double.parseDouble(alas.getText().toString());
        double t = Double.parseDouble(tinggi.getText().toString());
        double h = a*t;
        Intent intentHasilLuasPersegi = new Intent(SecondActivity.this, HasilLuasPersegi.class);
        intentHasilLuasPersegi.putExtra("h",h);
        startActivity(intentHasilLuasPersegi);
    }
    public void buttonKelilingPersegi(View v){
        double a = Double.parseDouble(alas.getText().toString());
        double t = Double.parseDouble(tinggi.getText().toString());
        double h = (a*t)*2;
        Intent intentHasilKelilingPersegi= new Intent(SecondActivity.this, HasilKelilingPersegi.class);
        intentHasilKelilingPersegi.putExtra("h",h);
        startActivity(intentHasilKelilingPersegi);
    }
}
