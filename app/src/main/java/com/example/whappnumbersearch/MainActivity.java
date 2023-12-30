package com.example.whappnumbersearch;

import androidx.appcompat.app.AppCompatActivity;

import android.annotation.SuppressLint;
import android.content.Intent;
import android.net.Uri;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.ImageButton;
import android.widget.Toast;

public class MainActivity extends AppCompatActivity {
    private Button btn_msg;
    private ImageButton menu;
    private EditText editText;
    @SuppressLint("MissingInflatedId")
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        menu = findViewById(R.id.menu);
        btn_msg = findViewById(R.id.what_btn);


        editText = findViewById(R.id.et_msg);
        findViewById(R.id.what_btn).setOnClickListener(view -> {
            String url = "https://api.whatsapp.com/send?phone=" + editText.getText();
            // Intent intent = new Intent(MainActivity.this, SecondActivity.class); Неявный интент
            Intent intent = new Intent(Intent.ACTION_VIEW); //Явный интент
            intent.setData(Uri.parse(url));
            startActivity(intent);

        });

        menu.setOnClickListener(view -> {
          Intent i = new Intent(this , Histori.class);
          startActivity(i);
                finish();
        });




    }


}