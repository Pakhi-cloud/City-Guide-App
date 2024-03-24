package com.example.punekars;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;

public class temple extends AppCompatActivity {
    Button b30;
    Button b31;
    Button b32;
    Button b33;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_temple);
        b30=findViewById(R.id.b30);
        b31=findViewById(R.id.b31);
        b32=findViewById(R.id.b32);
        b33=findViewById(R.id.b33);
        b30.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                opends();
            }
        });
        b31.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                opensbm();
            }
        });
        b32.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                openbt();
            }
        });
        b33.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                openkjt();
            }
        });
    }
    public void opends() {
        Intent intent = new Intent(this, dagduseth.class);
        startActivity(intent);
    }
    public void opensbm() {
        Intent intent = new Intent(this, balajit.class);
        startActivity(intent);
    }
    public void openbt() {
        Intent intent = new Intent(this, bhuleshwart.class);
        startActivity(intent);
    }
    public void openkjt() {
        Intent intent = new Intent(this, katrajt.class);
        startActivity(intent);
    }
}