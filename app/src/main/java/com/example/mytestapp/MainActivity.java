package com.example.mytestapp;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;

public class MainActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        Button start_act_btn = findViewById(R.id.start_act_btn);
        start_act_btn.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                startAnotherActivity(view);
            }
        });
    }
    public void startAnotherActivity(View view){
        Intent my_intent = new Intent(getApplicationContext(), MyActivity1.class);
        startActivity(my_intent);

    }
}