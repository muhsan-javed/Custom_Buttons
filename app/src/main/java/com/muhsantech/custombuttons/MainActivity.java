package com.muhsantech.custombuttons;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.widget.Toast;

import ru.dimorinny.floatingtextbutton.FloatingTextButton;

public class MainActivity extends AppCompatActivity {

    FloatingTextButton floatingTextButton;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        floatingTextButton = findViewById(R.id.action_button);
        
        floatingTextButton.setOnClickListener(view -> {
            Toast.makeText(this, "Button is Clicked", Toast.LENGTH_SHORT).show();
        });
    }
}