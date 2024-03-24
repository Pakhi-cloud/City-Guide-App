package com.example.punekars;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.RatingBar;
import android.widget.TextView;

public class reviewpg extends AppCompatActivity {
    TextView  rc, rs;
    EditText rev;
    RatingBar rb;
    Button btn;
    Float rateValue; String temp;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_reviewpg);

        rc=findViewById(R.id.rc);
        rs=findViewById(R.id.rs);
        rev=findViewById(R.id.rev);
        rb=findViewById(R.id.rb);
        btn=findViewById(R.id.btn);
        rb.setOnRatingBarChangeListener(new RatingBar.OnRatingBarChangeListener() {
            @Override
            public void onRatingChanged(RatingBar ratingBar, float v, boolean b) {
                rateValue=ratingBar.getRating();

                if (rateValue<=1 && rateValue>0){
                    rc.setText("Bad " +rateValue +"/5");
                }
                else if(rateValue<=2 && rateValue>1){
                    rc.setText("OK " +rateValue +"/5");
                }
                else if(rateValue<=3 && rateValue>2){
                    rc.setText("Good " +rateValue +"/5");
                }
                else if(rateValue<=4 && rateValue>3){
                    rc.setText("Very Good " +rateValue +"/5");
                }
                else if(rateValue<=5 && rateValue>4){
                    rc.setText("Best " +rateValue +"/5");
                }

            }
        });
        btn.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                temp=rc.getText().toString();
                rs.setText("Your Rating: \n"+temp +"\n" +rev.getText());
                rev.setText("");
                rb.setRating(0);
                rc.setText("");
            }
        });
    }
}