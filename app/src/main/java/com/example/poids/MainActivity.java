package com.example.poids;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.Toast;

public class MainActivity extends AppCompatActivity {
    private Button bCalculer;
    private EditText taille;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        bCalculer = (Button) findViewById(R.id.boutonCalculer);
        taille = (EditText) findViewById(R.id.taille);
        bCalculer.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                if (!taille.getText().toString().isEmpty()) {
                    if (Float.parseFloat(taille.getText().toString()) <= 0)
                    {
                        Toast.makeText(getApplicationContext(), "La taille doit etre positive et superieur a 0", Toast.LENGTH_LONG).show();
                    } else {
                        float poids = (3 * Float.parseFloat(taille.getText().toString()) - 250) / 4;
                        Toast.makeText(getApplicationContext(), "Votre poids ideal est " + poids + "Kg", Toast.LENGTH_LONG).show();
                    }

                } else {
                    Toast.makeText(getApplicationContext(), "Veuillez saisir votre taille.", Toast.LENGTH_LONG).show();

                }
            }
        });

    }
}