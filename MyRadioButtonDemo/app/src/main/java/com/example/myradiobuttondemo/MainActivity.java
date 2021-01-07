package com.example.myradiobuttondemo;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.RadioButton;
import android.widget.RadioGroup;
import android.widget.TextView;

public class MainActivity extends AppCompatActivity {

    private RadioGroup radioGroup;
    private RadioButton genderButton;
    private Button showButton;
    private TextView showTextView;


    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        radioGroup = findViewById(R.id.radioGraupId);
        showButton = findViewById(R.id.showButtonId);
        showTextView = findViewById(R.id.showTextId);

        showButton.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
               int selectedid = radioGroup.getCheckedRadioButtonId();
               genderButton = findViewById(selectedid);
               String value =  genderButton.getText().toString();

               showTextView.setText("You have Choce : "+value);
            }
        });
    }
}
