package com.example.punekars;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;

public class explorepg extends AppCompatActivity {
    Button b4;
    Button b5;
    Button b6;
    Button b7;
    Button b8;
    Button b9;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_explorepg);
        b4= (Button) findViewById(R.id.b4);
        b5= (Button) findViewById(R.id.b5);
        b6= (Button) findViewById(R.id.b6);
        b7= (Button) findViewById(R.id.b7);
        b8= (Button) findViewById(R.id.b8);
        b9= (Button) findViewById(R.id.b9);
        b4.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                openshop();
            }
        });
        b5.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                openwl();
            }
        });
        b6.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                openfud();
            }
        });
        b7.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                openhist();
            }
        });
        b8.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                opennatre();
            }
        });
        b9.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                opentemp();
            }
        });

    }
    public void openshop() {
        Intent i = new Intent(this,shopping.class);
        startActivity(i);
    }
    public void openwl() {
        Intent i = new Intent(this,wildlife.class);
        startActivity(i);
    }
    public void openfud() {
        Intent i = new Intent(this,food.class);
        startActivity(i);
    }
    public void openhist() {
        Intent i = new Intent(this,history.class);
        startActivity(i);
    }
    public void opennatre() {
        Intent i = new Intent(this,nature.class);
        startActivity(i);
    }
    public void opentemp() {
        Intent i = new Intent(this,temple.class);
        startActivity(i);
    }
}