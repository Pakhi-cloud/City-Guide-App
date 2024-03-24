package com.example.punekars;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;

public class wildlife extends AppCompatActivity {
    Button b14;
    Button b15;
    Button b16;
    Button b17;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_wildlife);
        b14=findViewById(R.id.b14);
        b15=findViewById(R.id.b15);
        b16=findViewById(R.id.b16);
        b17=findViewById(R.id.b17);
        b14.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {

                openrw();
            }
        });
        b15.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                openbw();
            }
        });
        b16.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                openpw();
            }
        });
        b17.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                openmw();
            }
        });
    }
    public void openrw() {
        Intent intent = new Intent(this, rajivgzoo.class);
        startActivity(intent);
    }
    public void openbw() {
        Intent intent = new Intent(this, bwildlife.class);
        startActivity(intent);
    }
    public void openpw() {
        Intent intent = new Intent(this, peshwazoo.class);
        startActivity(intent);
    }
    public void openmw() {
        Intent intent = new Intent(this, mwildlife.class);
        startActivity(intent);
    }
}