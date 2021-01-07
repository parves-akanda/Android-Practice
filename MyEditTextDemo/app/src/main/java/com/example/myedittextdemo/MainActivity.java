package com.example.myedittextdemo;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.TextView;

import org.w3c.dom.Text;

public class MainActivity extends AppCompatActivity implements View.OnClickListener {

    private EditText editText1, editText2;
    private Button addButton, subButton;
    private TextView result;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        editText1 = findViewById(R.id.editTextId1);
        editText2 = findViewById(R.id.editTextId2);

        addButton = findViewById(R.id.addbutton);
        subButton = findViewById(R.id.subbutton);

        result = findViewById(R.id.testViewId);

        addButton.setOnClickListener(this);
        subButton.setOnClickListener(this);

    }

    @Override
    public void onClick(View v) {

        String number1 = editText1.getText().toString();
        String number2 = editText2.getText().toString();

        //Convertng into double
        double num1 = Double.parseDouble(number1);
        double num2 = Double.parseDouble(number2);

        if(v.getId()==R.id.addbutton)
        {
            double sum = num1 + num2;
            result.setText("Result : "+sum);
        }
        else
        {
            double sum = num1 - num2;
            result.setText("Result : "+sum);
        }

    }
}
