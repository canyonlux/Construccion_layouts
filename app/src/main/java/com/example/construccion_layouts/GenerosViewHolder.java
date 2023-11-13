package com.example.construccion_layouts;

import android.view.View;
import android.widget.TextView;
import android.widget.Toast;

import androidx.recyclerview.widget.RecyclerView;

public class GenerosViewHolder extends RecyclerView.ViewHolder implements View.OnClickListener {

    protected TextView textoElemento;

    public GenerosViewHolder(View itemView) {
        super(itemView);
        textoElemento = itemView.findViewById(R.id.textView); // Asume que tienes un TextView con este ID en tu layout de ítem
        itemView.setOnClickListener(this);
    }


    @Override
    public void onClick(View v) {
        Toast.makeText(v.getContext(), "Has pulsado sobre " + textoElemento.getText(), Toast.LENGTH_SHORT).show();
    }

}
