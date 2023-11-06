package com.example.construccion_layouts;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.ArrayAdapter;
import android.widget.Button;
import android.widget.ListView;

public class Chip extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_chip);
// Inicializa el ListView
        ListView listView = findViewById(R.id.listView);

        // Crea un array de elementos que quieras mostrar en tu ListView
        String[] items = new String[]{"Accion", "Aventura", "Deportes", "Disparos","Estrategia", "Lucha", "Musical", "Rol", "Simulacion"};

        // Crea un ArrayAdapter utilizando el layout simple_list_item_1 de Android y tu array de elementos
        ArrayAdapter<String> adapter = new ArrayAdapter<>(this, android.R.layout.simple_list_item_1, items);

        // Establece el adaptador en tu ListView
        listView.setAdapter(adapter);

    }
}
