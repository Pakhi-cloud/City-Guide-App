package com.example.punekars;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;

public class history extends AppCompatActivity {
    Button b22;
    Button b23;
    Button b24;
    Button b25;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_history);
        b22=findViewById(R.id.b22);
        b23=findViewById(R.id.b23);
        b24=findViewById(R.id.b24);
        b25=findViewById(R.id.b25);
        b22.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                opensf();
            }
        });
        b23.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                opensnw();
            }
        });
        b24.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                openakp();
            }
        });
        b25.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                openlm();
            }
        });
    }
    public void opensf() {
        Intent intent = new Intent(this, sinhagadf.class);
        startActivity(intent);
    }
    public void opensnw() {
        Intent intent = new Intent(this, shaniwarw.class);
        startActivity(intent);
    }
    public void openakp() {
        Intent intent = new Intent(this, agakhanp.class);
        startActivity(intent);
    }
    public void openlm() {
        Intent intent = new Intent(this, lalmahal.class);
        startActivity(intent);
    }
}