package com.example.construccion_layouts;

import androidx.appcompat.app.AppCompatActivity;
import androidx.recyclerview.widget.LinearLayoutManager;
import androidx.recyclerview.widget.RecyclerView;

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
        RecyclerView recyclerViewGeneros = findViewById(R.id.recyclerViewGeneros); // Asume que tienes un RecyclerView con este ID en tu layout
        recyclerViewGeneros.setLayoutManager(new LinearLayoutManager(this));

        String[] generos = {"Acción", "Aventura", "Puzzle", "Deportes", "Estrategia"}; // Tus géneros de juegos
        GenerosAdapter adapter = new GenerosAdapter(generos);
        recyclerViewGeneros.setAdapter(adapter);

    }
}
