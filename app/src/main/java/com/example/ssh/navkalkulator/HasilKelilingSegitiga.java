package com.example.ssh.navkalkulator;

import android.content.Intent;
import android.os.Bundle;
import android.support.v7.app.AppCompatActivity;
import android.widget.TextView;

public class HasilKelilingSegitiga extends AppCompatActivity {

    TextView tampilKelilingSegitiga;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_hasil_keliling_segitiga);

        tampilKelilingSegitiga=(TextView)findViewById(R.id.tampilKelilingSegitiga);
        Intent intentHasil = getIntent();
        Double x = intentHasil.getDoubleExtra("h", 0.0);
        tampilKelilingSegitiga.setText(x+"");
    }
}
