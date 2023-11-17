package com.example.construccion_layouts;

import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.TextView;
import androidx.recyclerview.widget.RecyclerView;
import java.util.List;

public class GenerosAdapter extends RecyclerView.Adapter<GenerosAdapter.ViewHolder> {

    private List<String> datosGeneros;

    public static class ViewHolder extends RecyclerView.ViewHolder {
        private final TextView textView;

        public ViewHolder(View view) {
            super(view);
            textView = (TextView) view.findViewById(R.id.textView);
        }

        public TextView getTextView() {
            return textView;
        }
    }

    public GenerosAdapter(List<String> datosGeneros) {
        this.datosGeneros = datosGeneros;
    }

    @Override
    public ViewHolder onCreateViewHolder(ViewGroup parent, int viewType) {
        View view = LayoutInflater.from(parent.getContext()).inflate(R.layout.text_item_generos, parent, false);
        return new ViewHolder(view);
    }

    @Override
    public void onBindViewHolder(ViewHolder holder, int position) {
        holder.getTextView().setText(datosGeneros.get(position));
    }

    @Override
    public int getItemCount() {
        return datosGeneros.size();
    }
}
