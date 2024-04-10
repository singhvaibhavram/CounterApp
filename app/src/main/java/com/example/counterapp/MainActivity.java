package com.example.counterapp;

import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.ImageView;
import android.widget.TextView;

import androidx.activity.EdgeToEdge;
import androidx.appcompat.app.AppCompatActivity;
import androidx.core.graphics.Insets;
import androidx.core.view.ViewCompat;
import androidx.core.view.WindowInsetsCompat;

public class MainActivity extends AppCompatActivity {
    TextView counter_text;
    Button counter_button;

    ImageView counter_logo;
    int counter = 0;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        EdgeToEdge.enable(this);
        setContentView(R.layout.activity_main);

        counter_button = findViewById(R.id.counterButton);
        counter_text = findViewById(R.id.counterText);
        counter_logo = findViewById(R.id.imageView2);

        counter_button.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                counter_text.setText(increaseCount());
            }
        });

    }
    public int increaseCount(){
       return  ++counter;

    }
}