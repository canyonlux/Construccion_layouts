package com.example.construccion_layouts;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.view.Menu;
import android.view.View;
import android.widget.AdapterView;
import android.widget.ArrayAdapter;
import android.widget.EditText;
import android.widget.Spinner;

public class NewPlayer extends AppCompatActivity {
    private EditText editText;
    private Spinner spinner;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.newplayer);

        // Inicialización del EditText y Spinner
        editText = findViewById(R.id.editTextText2);
        spinner = findViewById(R.id.spinner);
        // Array de películas para el Spinner
        String[] peliculas = {"", "Titanic", "Pretty Woman", "Star Wars", "El Padrino", "La vida es bella" };

        // Adaptador para el Spinner
        ArrayAdapter<String> adaptador = new ArrayAdapter<>(this, android.R.layout.simple_spinner_item, peliculas);
        adaptador.setDropDownViewResource(android.R.layout.simple_spinner_dropdown_item);
        spinner.setAdapter(adaptador);

        // Listener para el EditText
        editText.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                // Simula un clic en el Spinner para mostrar las opciones
                spinner.performClick();
            }
        });

        // Listener para el Spinner
        spinner.setOnItemSelectedListener(new AdapterView.OnItemSelectedListener() {
            @Override
            public void onItemSelected(AdapterView<?> parent, View view, int position, long id) {
                // Actualiza el EditText con la selección del Spinner
                editText.setText(peliculas[position]);
            }

            @Override
            public void onNothingSelected(AdapterView<?> parent) {
                // Opción si no se selecciona nada
            }
        });


    }
    public boolean onCreateOptionsMenu(Menu menu) {
        // Infla el menú; esto agrega elementos a la barra de acción si está presente.
        getMenuInflater().inflate(R.menu.menu_main, menu);
        return true;
    }
}