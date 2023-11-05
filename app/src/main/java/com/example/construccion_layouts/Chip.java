package com.example.construccion_layouts;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;

public class Chip extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_chip);

        Button about = findViewById(R.id.button4);
        about.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent intent = new Intent(Chip.this, MainActivity.class); // Asumiendo que tienes una actividad llamada AboutActivity
                startActivity(intent);
            }
        });
    }
}
