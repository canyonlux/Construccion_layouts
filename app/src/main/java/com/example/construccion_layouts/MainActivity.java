package com.example.construccion_layouts;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;

public class MainActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        // Encuentra el botón jugador y establece el OnClickListener
        Button jugador = findViewById(R.id.button1);
        jugador.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                lanzarNewPlayer();
            }
        });

        // Encuentra el botón preferences y establece el OnClickListener
        Button preferences = findViewById(R.id.button3);
        preferences.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                lanzarPreferences();
            }
        });
    }

    private void lanzarNewPlayer() {
        // Método que se ejecuta al pulsar el botón jugador
        Intent i = new Intent(this, NewPlayer.class);
        startActivity(i);
    }

    private void lanzarPreferences() {
        // Método que se ejecuta al pulsar el botón preferences
        Intent i = new Intent(this, Preferences.class); // Asegúrate de que el nombre de la clase es correcto
        startActivity(i);
    }
}












