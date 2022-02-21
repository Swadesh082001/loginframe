package com.example.practise;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.TextView;

public class logged extends AppCompatActivity {
    TextView log;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_logged);
        log=findViewById(R.id.logged);

        Intent intent=getIntent();
        log.setText("Login succesfully");
    }

    public void logout(View view) {
        startActivity(new Intent(logged.this,MainActivity.class));
    }
}