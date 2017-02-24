package com.example.ssh.navkalkulator;

import android.content.Intent;
import android.os.Bundle;
import android.support.v7.app.AppCompatActivity;
import android.widget.TextView;

public class HasilLuasPersegi extends AppCompatActivity {

    TextView tampilLuasPersegi;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_hasil_persegi);

        tampilLuasPersegi=(TextView)findViewById(R.id.tampilLuasPersegi);
        Intent intentHasil = getIntent();
        Double x = intentHasil.getDoubleExtra("h", 0.0);
        tampilLuasPersegi.setText(x+"");
    }
}
