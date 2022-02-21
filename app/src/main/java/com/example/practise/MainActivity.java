package com.example.practise;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.EditText;
import android.widget.TextView;
import android.widget.Toast;

public class MainActivity extends AppCompatActivity {
    EditText email,pass;
    TextView login;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        email=findViewById(R.id.email);
        pass=findViewById(R.id.pass);
        login=findViewById(R.id.textView);
    }

    public void Login(View view) {
        String emailid=email.getText().toString();
        String password=pass.getText().toString();
        if(emailid.equals("hedeswadesh@gmail.com") && password.equals("Swadesh@123")) {
            Intent intent = new Intent(MainActivity.this, logged.class);
            startActivity(intent);
        }
        else{
            Toast.makeText(this, "Invalid crediantials", Toast.LENGTH_SHORT).show();
        }
    }
}