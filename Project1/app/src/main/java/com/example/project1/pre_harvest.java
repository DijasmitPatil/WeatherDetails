package com.example.project1;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.LinearLayout;

public class pre_harvest extends AppCompatActivity {
    LinearLayout linearlay1;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_pre_harvest);

        linearlay1 = findViewById(R.id.linearlay1);

        linearlay1.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent intent = new Intent(pre_harvest.this,WeatherActivity.class);
                startActivity(intent);
            }
        });
    }
}