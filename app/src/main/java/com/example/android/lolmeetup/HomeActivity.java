package com.example.android.lolmeetup;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.os.Handler;
import android.view.View;
import android.widget.Button;
import android.widget.CheckBox;

public class HomeActivity extends AppCompatActivity {


    private CheckBox profile1, profile2, profile3, profile4, profile5, profile6, profile7;
    private Button choose;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_home);

        profile1 = findViewById(R.id.profile1);
        profile1.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent intent = new Intent(HomeActivity.this, profile.class);
                startActivity(intent);
            }
        });

        choose = findViewById(R.id.choose);
        choose.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent intent = new Intent(HomeActivity.this, profile.class);
                startActivity(intent);
            }
        });


    }
}
