package com.example.project1;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;

public class MainActivity extends AppCompatActivity {
    Button btn_preharv,btn_harv,btn_postharv,btn_invest_in_farms;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        btn_preharv = findViewById(R.id.btn_preharv);
        btn_harv = findViewById(R.id.btn_harv);
        btn_postharv = findViewById(R.id.btn_postharv);
        btn_invest_in_farms = findViewById(R.id.btn_invest_in_farms);

        btn_preharv.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent intent = new Intent(MainActivity.this, pre_harvest.class);
                startActivity(intent);
            }
        });

        btn_harv.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent intent = new Intent(MainActivity.this, harvest.class);
                startActivity(intent);
            }
        });

        btn_postharv.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent intent = new Intent(MainActivity.this, post_harvest.class);
                startActivity(intent);
            }
        });

        btn_invest_in_farms.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent intent = new Intent(MainActivity.this, InvestInFarms.class);
                startActivity(intent);
            }
        });
    }
}