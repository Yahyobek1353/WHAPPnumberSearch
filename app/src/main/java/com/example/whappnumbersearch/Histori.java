package com.example.whappnumbersearch;

import androidx.appcompat.app.AppCompatActivity;

import android.annotation.SuppressLint;
import android.content.Intent;
import android.net.Uri;
import android.os.Bundle;
import android.util.Log;
import android.view.View;
import android.widget.Button;
import android.widget.ImageButton;
import android.widget.Toast;

public class Histori extends AppCompatActivity {
    private Button  help , ws ;
    private ImageButton back;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_histori);
        help = findViewById(R.id.btn_help);
        ws = findViewById(R.id.btn_website);
        back = findViewById(R.id.btn_back);


        back.setOnClickListener(view -> {
            Intent intent = new Intent(Histori.this , MainActivity.class);
            startActivity(intent);
            finish();
        });

        ws.setOnClickListener(view -> {
            String url = "https://metanit.com/java/tutorial/";
            Intent intent = new Intent(Intent.ACTION_VIEW); //Явный интент
            intent.setData(Uri.parse(url));
            startActivity(intent);
        });
        help.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Toast.makeText(Histori.this, "996 000 00 00 00", Toast.LENGTH_SHORT).show();
            }
        });
    }
}