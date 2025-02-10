package com.irosh.helthapp;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.TextView;
import androidx.appcompat.app.AppCompatActivity;

public class LogActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.log);  // Ensure log.xml exists

        // Navigate to SignupActivity when "Signup Now" text is clicked
        TextView signupText = findViewById(R.id.signuptext);
        signupText.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent intent = new Intent(LogActivity.this, SignupActivity.class);
                startActivity(intent);
            }
        });

        // Navigate to HomeActivity when the login button is clicked
        Button loginButton = findViewById(R.id.loginButton);
        loginButton.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent intent = new Intent(LogActivity.this, home.class);
                startActivity(intent);
                finish();  // Optional: Close login activity
            }
        });
    }
}
