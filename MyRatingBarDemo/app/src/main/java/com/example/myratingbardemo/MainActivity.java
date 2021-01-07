package com.example.myratingbardemo;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.view.View;
import android.widget.RatingBar;
import android.widget.TextView;

public class MainActivity extends AppCompatActivity implements RatingBar.OnRatingBarChangeListener {

    private RatingBar ratingBar;
    private TextView textView;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        ratingBar = findViewById(R.id.ratingBarId);
        textView  = findViewById(R.id.textViewId);

        ratingBar.setOnRatingBarChangeListener(this);

    }


    @Override
    public void onRatingChanged(RatingBar ratingBar, float rating, boolean fromUser) {
        textView.setText("Value : "+rating);
    }
}
