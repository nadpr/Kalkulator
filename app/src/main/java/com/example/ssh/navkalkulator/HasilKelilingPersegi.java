package com.example.ssh.navkalkulator;

import android.content.Intent;
import android.os.Bundle;
import android.support.v7.app.AppCompatActivity;
import android.widget.TextView;

public class HasilKelilingPersegi extends AppCompatActivity {

    TextView tampilKelilingPersegi;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_hasil_keliling_persegi);

        tampilKelilingPersegi=(TextView)findViewById(R.id.tampilKelilingPersegi);
        Intent intentHasil = getIntent();
        Double x = intentHasil.getDoubleExtra("h", 0.0);
        tampilKelilingPersegi.setText(x+"");
    }
}
