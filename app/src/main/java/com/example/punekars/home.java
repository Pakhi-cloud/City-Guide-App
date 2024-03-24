package com.example.punekars;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.text.method.LinkMovementMethod;
import android.view.View;
import android.widget.Button;
import android.widget.TextView;

public class home extends AppCompatActivity {
    TextView tv8;
    Button b2;
    Button b3;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_home);
        b2 = (Button) findViewById(R.id.b2);
        b3 = (Button) findViewById(R.id.b3);

        tv8=findViewById(R.id.tv8);
        tv8.setMovementMethod(LinkMovementMethod.getInstance());

        b2.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {

                openexplore();
            }
        });
        b3.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                openreview();
            }
        });
    }
    public void openexplore() {
        Intent intent = new Intent(home.this, explorepg.class);
        startActivity(intent);
    }
    public void openreview() {
        Intent intent = new Intent(home.this, reviewpg.class);
        startActivity(intent);
    }
}