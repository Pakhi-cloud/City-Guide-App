package com.example.punekars;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;

public class shopping extends AppCompatActivity {
    Button b10;
    Button b11;
    Button b12;
    Button b13;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_shopping);
        b10=findViewById(R.id.b10);
        b11=findViewById(R.id.b11);
        b12=findViewById(R.id.b12);
        b13=findViewById(R.id.b13);
        b10.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {

                openpm();
            }
        });
        b11.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                openfc();
            }
        });
        b12.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                openjb();
            }
        });
        b13.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                opentb();
            }
        });
    }



    public void openpm() {
        Intent intent = new Intent(this, phoenix.class);
        startActivity(intent);
    }
    public void openfc() {
        Intent intent = new Intent(this, fcroad.class);
        startActivity(intent);
    }
    public void openjb() {
        Intent intent = new Intent(this, junabazar.class);
        startActivity(intent);
    }
    public void opentb() {
        Intent intent = new Intent(this, tulsib.class);
        startActivity(intent);
    }
}