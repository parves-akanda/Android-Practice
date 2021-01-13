package com.example.myintentdemo2;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.widget.TextView;

public class Main2Activity extends AppCompatActivity {

    private TextView textView;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main2);

        textView = findViewById(R.id.textViewId);

        Bundle bundle = getIntent().getExtras();

        if(bundle!=null)
        {
            String value =  bundle.getString("sms");
            textView.setText(value);
        }
    }
}
