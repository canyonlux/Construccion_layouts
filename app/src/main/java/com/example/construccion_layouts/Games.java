package com.example.construccion_layouts;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.view.Menu;
import android.view.View;
import android.widget.CheckBox;
import android.widget.Toast;
import com.google.android.material.floatingactionbutton.FloatingActionButton;

 public class Games extends AppCompatActivity {

    // Define tus CheckBoxes aquí
    private CheckBox checkBoxAngryBirds;
    private CheckBox checkBoxDragonFly;
    private CheckBox checkBoxHillClimbingRacing;
    private CheckBox checkBoxRadiantDefense;
    private CheckBox checkBoxPocketSoccer;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_games); // Asegúrate de que el nombre del layout es correcto

        // Inicializa tus CheckBoxes aquí
        checkBoxAngryBirds = findViewById(R.id.checkBox);
        checkBoxDragonFly = findViewById(R.id.checkBox2);
        checkBoxHillClimbingRacing = findViewById(R.id.checkBox3);
        checkBoxRadiantDefense = findViewById(R.id.checkBox4);
        checkBoxPocketSoccer = findViewById(R.id.checkBox5);

        // Encuentra el FloatingActionButton y asigna un OnClickListener
        FloatingActionButton fab = findViewById(R.id.floatingActionButton2);
        fab.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                // Llama al método que maneja la selección
                showSelectedGames();
            }
        });
    }
     public boolean onCreateOptionsMenu(Menu menu) {
         // Infla el menú; esto agrega elementos a la barra de acción si está presente.
         getMenuInflater().inflate(R.menu.menu_main, menu);
         return true;
     }
    private void showSelectedGames() { // Método que maneja la selección
        StringBuilder selectedGames = new StringBuilder("Juegos seleccionados:\n"); // StringBuilder para almacenar el texto

        // Revisa cada CheckBox y añade el texto al StringBuilder si está marcado
        if (checkBoxAngryBirds.isChecked()) selectedGames.append(checkBoxAngryBirds.getText()).append("\n");
        if (checkBoxDragonFly.isChecked()) selectedGames.append(checkBoxDragonFly.getText()).append("\n");
        if (checkBoxHillClimbingRacing.isChecked()) selectedGames.append(checkBoxHillClimbingRacing.getText()).append("\n");
        if (checkBoxRadiantDefense.isChecked()) selectedGames.append(checkBoxRadiantDefense.getText()).append("\n");
        if (checkBoxPocketSoccer.isChecked()) selectedGames.append(checkBoxPocketSoccer.getText()).append("\n");

        // Muestra el Toast
        Toast.makeText(Games.this, selectedGames.toString(), Toast.LENGTH_LONG).show();
    }
}

