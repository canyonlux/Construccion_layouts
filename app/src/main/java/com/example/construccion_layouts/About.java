package com.example.construccion_layouts;

import androidx.appcompat.app.AppCompatActivity;
import androidx.recyclerview.widget.LinearLayoutManager;
import androidx.recyclerview.widget.RecyclerView;

import android.os.Bundle;

import java.util.ArrayList;
import java.util.List;

public class About extends AppCompatActivity {

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
        // Añadir más elementos si es necesario

        RecyclerView recyclerView = findViewById(R.id.recyclerGeneros); // Asegúrate de que recyclerViewGeneros es el ID correcto en tu layout
        LinearLayoutManager layoutManager = new LinearLayoutManager(this);
        recyclerView.setLayoutManager(layoutManager);

        GenerosAdapter adapter = new GenerosAdapter(itemList);
        recyclerView.setAdapter(adapter);
    }

}
