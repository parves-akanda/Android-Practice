package com.example.mybuttondemo;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.TextView;
import android.widget.Toast;

public class MainActivity extends AppCompatActivity implements View.OnClickListener {

    private Button loginButton, logoutButton;
    private TextView massage;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        loginButton = findViewById(R.id.loginbuttonId);
        logoutButton = findViewById(R.id.logoutbuttonId);
        massage =  findViewById(R.id.textViewId);

        loginButton.setOnClickListener(this);
        logoutButton.setOnClickListener(this);


    }

    @Override
    public void onClick(View v) {

        if(v.getId()==R.id.loginbuttonId)
        {
            massage.setText("Login Successfully");
        }

        if(v.getId()==R.id.logoutbuttonId)
        {
            Toast.makeText(MainActivity.this, "Logout Successfully",Toast.LENGTH_SHORT).show();
        }

    }
}
