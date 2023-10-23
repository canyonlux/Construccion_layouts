package com.example.construccion_layouts;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.Menu;
import android.view.MenuItem;
import android.view.View;
import android.widget.Button;
import android.widget.Toast;

public class MainActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        Button jugador = findViewById(R.id.button1);
        jugador.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                lanzarNewPlayer();
            }
        });
    }

    private void lanzarNewPlayer() {
        Intent i = new Intent(this, NewPlayer.class);
        startActivity(i);
    }
    @Override
    public boolean onCreateOptionsMenu(Menu menu) {
        getMenuInflater().inflate(R.menu.menu_main, menu);
        return true;
    }

    @Override
    public boolean onOptionsItemSelected(MenuItem item) {
        int id = item.getItemId();

        if (id == R.id.action_search) {
            Toast.makeText(this, "Buscar", Toast.LENGTH_SHORT).show();
            // Acción a realizar cuando se hace clic en "action_search"
            return true;
        }
        return super.onOptionsItemSelected(item);
        }
    }




