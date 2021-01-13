package com.example.mycountryprofiledemo;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.widget.ImageView;
import android.widget.TextView;

public class ProfileActivity extends AppCompatActivity {
    private ImageView imageView;
    private TextView textView;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_profile);

        imageView = findViewById(R.id.imageViewId);
        textView = findViewById(R.id.textViewId);

        Bundle bundle = getIntent().getExtras();
        if(bundle!=null)
        {
            String counrtryName = bundle.getString("name");

            showDetails(counrtryName);
        }
    }

    void showDetails (String countryName)
    {
        if(countryName.equals("Bangladesh"))
        {
            imageView.setImageResource(R.drawable.lalbag);
            textView.setText(R.string.bangladesh_text);
        }

        if(countryName.equals("India"))
        {
            imageView.setImageResource(R.drawable.tajmahal);
            textView.setText(R.string.india_text);
        }

        if(countryName.equals("Pakistan"))
        {
            imageView.setImageResource(R.drawable.pak);
            textView.setText(R.string.pakistan_text);
        }

    }
}
