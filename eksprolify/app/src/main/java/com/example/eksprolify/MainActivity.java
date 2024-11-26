package com.example.eksprolify;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.widget.Button;
import androidx.appcompat.app.AppCompatActivity;

public class MainActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main); // Link to your XML layout file

        // Initialize buttons
        Button signupButton = findViewById(R.id.button_signup);
        Button signinButton = findViewById(R.id.button_signin);

        // Handle Sign Up button click
        signupButton.setOnClickListener(v -> {
            Intent intent = new Intent(MainActivity.this, signinActivity.class);
            startActivity(intent);
        });

        // Handle Sign In button click
        signinButton.setOnClickListener(v -> {
            Intent intent = new Intent(MainActivity.this, signinActivity.class);
            startActivity(intent);
        });
    }
}
