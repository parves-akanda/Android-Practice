package com.example.mycountryprofiledemo;

import androidx.appcompat.app.AlertDialog;
import androidx.appcompat.app.AppCompatActivity;

import android.app.Dialog;
import android.content.DialogInterface;
import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;

public class MainActivity extends AppCompatActivity implements View.OnClickListener {

    private Button bangladeshButton;
    private Button indiaButton;
    private Button pakisButton;

    private Intent intent;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        bangladeshButton = findViewById(R.id.bangladeshButton);
        indiaButton = findViewById(R.id.indiaButton);
        pakisButton = findViewById(R.id.pakistanButton);

        bangladeshButton.setOnClickListener(this);
        indiaButton.setOnClickListener(this);
        pakisButton.setOnClickListener(this);

    }

    @Override
    public void onClick(View v) {
        if(v.getId()==R.id.indiaButton)
        {
            intent = new Intent(MainActivity.this, ProfileActivity.class);
            intent.putExtra("name", "India");
            startActivity(intent);
        }
        if(v.getId()==R.id.bangladeshButton)
        {
            intent = new Intent(MainActivity.this, ProfileActivity.class);
            intent.putExtra("name", "Bangladesh");
            startActivity(intent);
        }
        if(v.getId()==R.id.pakistanButton)
        {
            intent = new Intent(MainActivity.this, ProfileActivity.class);
            intent.putExtra("name", "Pakistan");
            startActivity(intent);
        }
    }

    @Override
    public void onBackPressed() {
        AlertDialog.Builder alertDialogBuilder;
        alertDialogBuilder = new AlertDialog.Builder(MainActivity.this);
        alertDialogBuilder.setIcon(R.drawable.login);
        alertDialogBuilder.setTitle(R.string.title_text);
        alertDialogBuilder.setMessage(R.string.massage_text);
        alertDialogBuilder.setCancelable(false);

        alertDialogBuilder.setPositiveButton("Yes", new DialogInterface.OnClickListener() {
            @Override
            public void onClick(DialogInterface dialog, int which) {
                finish();
            }
        });

        alertDialogBuilder.setNegativeButton("No", new DialogInterface.OnClickListener() {
            @Override
            public void onClick(DialogInterface dialog, int which) {
                dialog.cancel();
            }
        });

        alertDialogBuilder.setNeutralButton("Cancel", new DialogInterface.OnClickListener() {
            @Override
            public void onClick(DialogInterface dialog, int which) {
                dialog.cancel();
            }
        });

        AlertDialog alertDialog = alertDialogBuilder.create();
        alertDialog.show();
    }



}
