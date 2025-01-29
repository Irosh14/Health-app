package com.irosh.helthapp;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.TextView;
import androidx.appcompat.app.AppCompatActivity;

public class SignupActivity extends AppCompatActivity { // FIX: Capitalized class name

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_signup);  // Ensure activity_signup.xml exists

        // Navigate back to LogActivity when "Sign In" is clicked
        TextView signInText = findViewById(R.id.tvSignIn);
        signInText.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent intent = new Intent(SignupActivity.this, LogActivity.class);
                startActivity(intent);
                finish(); // Prevent returning to SignupActivity on back press
            }
        });
    }
}
