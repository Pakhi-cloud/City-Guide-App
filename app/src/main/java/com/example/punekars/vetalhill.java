package com.example.punekars;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.text.method.LinkMovementMethod;
import android.widget.TextView;

public class vetalhill extends AppCompatActivity {
    TextView tv4;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_vetalhill);

        getSupportActionBar().hide();

        tv4=findViewById(R.id.tv4);
        tv4.setMovementMethod(LinkMovementMethod.getInstance());

    }
}