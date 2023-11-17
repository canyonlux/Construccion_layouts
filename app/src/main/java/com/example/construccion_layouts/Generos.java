package com.example.construccion_layouts;

import androidx.appcompat.app.AppCompatActivity;
import androidx.recyclerview.widget.LinearLayoutManager;
import androidx.recyclerview.widget.RecyclerView;

import android.os.Bundle;
import android.view.Menu;

import java.util.ArrayList;
import java.util.List;

public class Generos extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.generos); // Asegúrate de que generos es el layout correcto

        List<String> itemList = new ArrayList<>();
        itemList.add("Acción");
        itemList.add("Aventura");
        itemList.add("Deporte");
        itemList.add("Estrategia");
        itemList.add("RPG");
        itemList.add("Simulación");
        itemList.add("ROle Play");
        itemList.add("Juegos de mesa");
        itemList.add("Outdoor");
        itemList.add("Terror");
        itemList.add("Wargames");
        // Añadir más elementos si es necesario

        RecyclerView recyclerView = findViewById(R.id.recyclerGeneros); // Asegúrate de que recyclerViewGeneros es el ID correcto en tu layout
       // El LayoutManager indica al RecyclerView como se ordenan sus elementos
        LinearLayoutManager layoutManager = new LinearLayoutManager(this);
        recyclerView.setLayoutManager(layoutManager);
// Crear una instancia del adaptador
        GenerosAdapter adapter = new GenerosAdapter(itemList);
        recyclerView.setAdapter(adapter);
    }
    public boolean onCreateOptionsMenu(Menu menu) {
        // Infla el menú; esto agrega elementos a la barra de acción si está presente.
        getMenuInflater().inflate(R.menu.menu_main, menu);
        return true;
    }
}
