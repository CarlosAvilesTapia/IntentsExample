package com.example.intentsexample2;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.net.Uri;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;

public class SecondActivity extends AppCompatActivity {

    @Override
    // Creación de la segunda activity.
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_second);

        // Llamado al método para activar botones.
        initListeners();
    }

    // Creación de método para instruye los eventos del botón.
    private void initListeners() {

        // Instancia de botón para segunda actividad.
        Button goToUrlButton = findViewById(R.id.goToUrlButton);

        // Asignación de comportamiento al botón creado.
        goToUrlButton.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {

                // Creación de intent implícito indicando como acción el acceso a una URL.
                Intent implicitIntent = new Intent(Intent.ACTION_VIEW,
                        Uri.parse("https://kotlindoc.blogspot.com/2019/10/android-log-con-timber.html"));
                startActivity(implicitIntent);
            }
        });

        // Instancia de botón para segunda actividad.
        Button backButton = findViewById(R.id.backButton);

        // Asignación de comportamiento al botón creado.
        backButton.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {

                // Simulación de pulsar el botón back para no acumular "activities" en la pila.
                onBackPressed();
            }
        });
    }
}
