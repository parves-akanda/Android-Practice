package com.example.mycheckboxdemo;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.CheckBox;
import android.widget.TextView;

public class MainActivity extends AppCompatActivity implements View.OnClickListener {

    private Button showButton;
    private TextView showTextView;
    private CheckBox milkCheckBox, sugerCheckBox, waterCheckBox, honeyCheckBox;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        milkCheckBox = findViewById(R.id.milkBoxId);
        sugerCheckBox = findViewById(R.id.sugerBoxId);
        waterCheckBox = findViewById(R.id.waterBoxId);
        honeyCheckBox = findViewById(R.id.honeyBoxId);

        showButton = findViewById(R.id.buttonId);
        showTextView = findViewById(R.id.textViewId);


        showButton.setOnClickListener(this);

    }

    @Override
    public void onClick(View v) {

        StringBuilder stringBuilder = new StringBuilder();

        if(milkCheckBox.isChecked()){
            String output = milkCheckBox.getText().toString();
            stringBuilder.append(output + "is added to your order list\n");
        }

        if(sugerCheckBox.isChecked()){
            String output = sugerCheckBox.getText().toString();
            stringBuilder.append(output + "is added to your order list\n");
        }

        if(waterCheckBox.isChecked()){
            String output = waterCheckBox.getText().toString();
            stringBuilder.append(output + "is added to your order list\n");
        }

        if(honeyCheckBox.isChecked()){
            String output = honeyCheckBox.getText().toString();
            stringBuilder.append(output + "is added to your order list\n");
        }

        showTextView.setText(stringBuilder);

    }
}
