package net.smallacademy.tabs.Activities;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;

import net.smallacademy.tabs.R;

public class LoginActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_login);
        getSupportActionBar().setDisplayHomeAsUpEnabled(true);
    }
}
