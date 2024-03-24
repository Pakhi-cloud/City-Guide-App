package com.example.punekars;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;

public class nature extends AppCompatActivity {
    Button b26;
    Button b27;
    Button b28;
    Button b29;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_nature);
        b26=findViewById(R.id.b26);
        b27=findViewById(R.id.b27);
        b28=findViewById(R.id.b28);
        b29=findViewById(R.id.b29);
        b26.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                openpg();
            }
        });
        b27.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                openkd();
            }
        });
        b28.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                openvh();
            }
        });
        b29.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                openpl();
            }
        });
    }
    public void openpg() {
        Intent intent = new Intent(this, punegarden.class);
        startActivity(intent);
    }
    public void openkd() {
        Intent intent = new Intent(this, khadakwasla.class);
        startActivity(intent);
    }
    public void openvh() {
        Intent intent = new Intent(this, vetalhill.class);
        startActivity(intent);
    }
    public void openpl() {
        Intent intent = new Intent(this, pawnalake.class);
        startActivity(intent);
    }
}