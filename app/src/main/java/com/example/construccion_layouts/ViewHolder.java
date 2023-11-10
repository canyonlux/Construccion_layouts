package com.example.construccion_layouts;

import android.view.View;
import android.widget.TextView;
import android.widget.Toast;

import androidx.recyclerview.widget.RecyclerView;

public class GenerosViewHolder extends RecyclerView.ViewHolder implements View.OnClickListener {

    public TextView textViewGenero;

    public GenerosViewHolder(View itemView) {
        super(itemView);
        textViewGenero = itemView.findViewById(R.id.textViewGenero); // Asume que tienes un TextView con este ID en tu layout de ítem
        itemView.setOnClickListener(this);
    }

    @Override
    public void onClick(View view) {
        // Muestra un Toast con el nombre del género
        Toast.makeText(view.getContext(), textViewGenero.getText(), Toast.LENGTH_SHORT).show();
    }
}
