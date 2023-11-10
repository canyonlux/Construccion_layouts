package com.example.construccion_layouts;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.Menu;
import android.view.View;
import android.widget.AdapterView;
import android.widget.ArrayAdapter;
import android.widget.Button;
import android.widget.EditText;
import android.widget.Spinner;

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


        // Encuentra el botón games y establece el OnClickListener
        Button games = findViewById(R.id.button);
        games.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                lanzarGames();
            }
        });

        // Encuentra el botón jugador y establece el OnClickListener
        Button about = findViewById(R.id.button4);
        about.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                lanzarChipActivity();
            }
        });

    }

    @Override
    public boolean onCreateOptionsMenu(Menu menu) {
        // Infla el menú; esto agrega elementos a la barra de acción si está presente.
        getMenuInflater().inflate(R.menu.menu_main, menu);
        return true;
    }

    private void lanzarNewPlayer() {
        // Método que se ejecuta al pulsar el botón jugador
        Intent i = new Intent(this, NewPlayer.class);
        startActivity(i);
    }

    private void lanzarPreferences() {
        // Método que se ejecuta al pulsar el botón preferences
        Intent i = new Intent(this, Preferences.class);
        startActivity(i);
    }
    private void lanzarGames() {
        // Método que se ejecuta al pulsar el botón de juegos
        Intent i = new Intent(this, Games.class);
        startActivity(i);
    }

    private void lanzarChipActivity() {
        // Método que se ejecuta al pulsar el botón about
        Intent i = new Intent(MainActivity.this, Chip.class);
        startActivity(i);
    }
}












