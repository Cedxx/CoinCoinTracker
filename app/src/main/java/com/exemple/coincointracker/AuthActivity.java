package com.exemple.coincointracker;

import android.content.SharedPreferences;
import android.os.Bundle;

import androidx.appcompat.app.AppCompatActivity;

public class AuthActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_auth);
    }

    public String getUserToken() {
        SharedPreferences prefs = getSharedPreferences("UserToken", MODE_PRIVATE);

        // Fetches the token, does a lot of things, then...
        return "IncredibleToken";
    }
}
