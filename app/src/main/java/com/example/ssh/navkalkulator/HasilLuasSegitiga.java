package com.example.ssh.navkalkulator;

import android.content.Intent;
import android.os.Bundle;
import android.support.v7.app.AppCompatActivity;
import android.widget.TextView;

public class HasilLuasSegitiga extends AppCompatActivity {

    TextView tampilLuasSegitiga;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_hasil_segitiga);

        tampilLuasSegitiga=(TextView)findViewById(R.id.tampilLuasSegitiga);
        Intent intentHasil = getIntent();
        Double x = intentHasil.getDoubleExtra("h", 0.0);
        tampilLuasSegitiga.setText(x+"");
    }
}
