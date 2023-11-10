package com.example.construccion_layouts;

import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;

import androidx.recyclerview.widget.RecyclerView;

public class GenerosAdapter extends RecyclerView.Adapter<GenerosViewHolder> {

    private String[] generos;

    public GenerosAdapter(String[] generos) {
        this.generos = generos;
    }

    @Override
    public GenerosViewHolder onCreateViewHolder(ViewGroup parent, int viewType) {
        // Infla el layout para cada ítem (debes crear un layout para los ítems)
        View view = LayoutInflater.from(parent.getContext()).inflate(R.layout.genero_item_layout, parent, false);
        return new GenerosViewHolder(view);
    }

    @Override
    public void onBindViewHolder(GenerosViewHolder holder, int position) {
        // Establece el texto de cada í
    }
}