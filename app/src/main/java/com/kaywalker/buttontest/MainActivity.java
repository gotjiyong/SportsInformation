package com.kaywalker.buttontest;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.webkit.WebView;
import android.widget.Button;

public class MainActivity extends AppCompatActivity {

    private Button btn_swim, btn,btn_badminturn,btn_soccer,btn_hwal;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        btn_swim = findViewById(R.id.btn_swim);

        btn_swim.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {

                Intent intent = new Intent(MainActivity.this,SubActivity.class);
                startActivity(intent);

            }
        });

        btn_soccer = findViewById(R.id.btn_soccer);

        btn_soccer.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent intent = new Intent(getApplicationContext(),SubActivity2.class);
                startActivity(intent);
            }
        });

        btn_hwal = findViewById(R.id.btn_hwal);

        btn_hwal.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent intent = new Intent(getApplicationContext(),SubActivity3.class);
                startActivity(intent);
            }
        });

        btn_badminturn = findViewById(R.id.btn_badminturn);

        btn_badminturn.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent intent = new Intent(getApplicationContext(),SubActivity4.class);
                startActivity(intent);
            }
        });
    }
}