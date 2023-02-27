package com.example.tp2eme;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.view.WindowManager;
import android.widget.Button;
import android.widget.EditText;

import com.google.android.material.textfield.TextInputEditText;

public class Login extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        getWindow().setFlags(WindowManager.LayoutParams.FLAG_FULLSCREEN,WindowManager.LayoutParams.FLAG_FULLSCREEN);
        setContentView(R.layout.activity_login);
        Button btnGoToB = findViewById(R.id.btn_go);
        btnGoToB.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                // Récupération des valeurs saisies dans les champs de texte
                String username = ((TextInputEditText) findViewById(R.id.username)).getText().toString();
                String password = ((TextInputEditText) findViewById(R.id.password)).getText().toString();

                // Création de l'Intent pour passer les informations à la deuxième activité
                Intent intent = new Intent(Login.this, Information.class);
                intent.putExtra("USERNAME", username);
                intent.putExtra("PASSWORD", password);

                // Lancement de la deuxième activité
                startActivity(intent);

            }
        });
    }
    }


