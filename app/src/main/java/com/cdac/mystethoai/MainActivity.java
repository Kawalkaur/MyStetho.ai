package com.cdac.mystethoai;

import androidx.appcompat.app.AppCompatActivity;

import android.annotation.SuppressLint;
import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.Toast;

public class MainActivity extends AppCompatActivity {
    Button ProceedBtn;
    @SuppressLint("MissingInflatedId")
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
       /* ProceedBtn = findViewById(R.id.proceedBtn);
        ProceedBtn.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent intent = new Intent(MainActivity.this, AI_Engine.class);
                startActivity(intent);
            }
        });*/
    }

    public void clickButton(View view) {
        Toast.makeText(this, "Button Click", Toast.LENGTH_SHORT).show();
    }

  /*  public void proceedToUse(View view) {
        Toast.makeText(this, "Button click", Toast.LENGTH_SHORT).show();
//        startActivity(new Intent(MainActivity.this, AI_Engine.class));
    }*/
}