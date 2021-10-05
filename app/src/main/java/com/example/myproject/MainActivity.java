package com.example.myproject;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.ImageView;

import com.example.myproject.novita1;
import com.example.myproject.novita2;
import com.example.myproject.novita3;
import com.example.myproject.novita4;


public class MainActivity extends AppCompatActivity {

    ImageView ivpesawat, ivsepeda, ivbus, ivmobil;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        ivpesawat = findViewById(R.id.iv_pesawat);
        ivpesawat.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent intent = new Intent( MainActivity.this, novita1.class);
                startActivity(intent);
            }
        });

        ivsepeda = findViewById(R.id.iv_sepeda);
        ivsepeda.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent intent = new Intent( MainActivity.this, novita2.class);
                startActivity(intent);
            }
        });

        ivbus = findViewById(R.id.iv_bus);
        ivbus.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent intent = new Intent( MainActivity.this, novita3.class);
                startActivity(intent);
            }
        });

        ivmobil = findViewById(R.id.iv_mobil);
        ivmobil.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent intent = new Intent( MainActivity.this, novita4.class);
                startActivity(intent);
            }
        });



    }
}