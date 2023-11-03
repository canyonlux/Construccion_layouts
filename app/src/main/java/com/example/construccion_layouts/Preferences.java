package com.example.construccion_layouts;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.view.View;
import android.widget.RadioButton;
import android.widget.RadioGroup;
import android.widget.RatingBar;
import android.widget.SeekBar;
import android.widget.Toast;

import com.google.android.material.floatingactionbutton.FloatingActionButton;

public class Preferences extends AppCompatActivity {

    private RadioGroup radioGroupGames;
    private SeekBar seekBarVote;
    private RatingBar ratingBarVote;
    private FloatingActionButton fabSubmit;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_preferences);

        radioGroupGames = findViewById(R.id.radioGroup);
        seekBarVote = findViewById(R.id.seekBar);
        ratingBarVote = findViewById(R.id.ratingBar);
        fabSubmit = findViewById(R.id.floatingActionButton);

        fabSubmit.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                int selectedGameId = radioGroupGames.getCheckedRadioButtonId();
                if (selectedGameId == -1) {
                    // No RadioButton has been checked.
                    Toast.makeText(getApplicationContext(), "No has pulsado ninguna opción", Toast.LENGTH_LONG).show();
                } else {
                    RadioButton selectedRadioButton = findViewById(selectedGameId);
                    String selectedGame = selectedRadioButton.getText().toString();
                    int seekBarProgress = seekBarVote.getProgress();
                    float rating = ratingBarVote.getRating();
                    Toast.makeText(getApplicationContext(), "Juego seleccionado: " + selectedGame + ", SeekBar Progreso: " + seekBarProgress + ", Rating: " + rating, Toast.LENGTH_LONG).show();
                }
            }
        });
    }
}