package com.example.punekars;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;

public class food extends AppCompatActivity {

    Button b18;
    Button b19;
    Button b20;
    Button b21;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_food);
        b18=findViewById(R.id.b18);
        b19=findViewById(R.id.b19);
        b20=findViewById(R.id.b20);
        b21=findViewById(R.id.b21);
        b18.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                openbm();
            }
        });
        b19.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                opengb();
            }
        });
        b20.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                opensw();
            }
        });
        b21.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                openvs();
            }
        });
    }
    public void openbm() {
        Intent intent = new Intent(this, bedekarm.class);
        startActivity(intent);
    }
    public void opengb() {
        Intent intent = new Intent(this, germanb.class);
        startActivity(intent);
    }
    public void opensw() {
        Intent intent = new Intent(this, shabree.class);
        startActivity(intent);
    }
    public void openvs() {
        Intent intent = new Intent(this, vaishali.class);
        startActivity(intent);
    }
}