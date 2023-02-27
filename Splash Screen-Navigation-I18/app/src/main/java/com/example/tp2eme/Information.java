package com.example.tp2eme;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.TextView;

public class Information extends AppCompatActivity {
    private TextView name;
    private TextView paswd;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_information);

        // Récupération des informations passées par l'Intent
        Intent intent = getIntent();
        String username = intent.getStringExtra("USERNAME");
        String password = intent.getStringExtra("PASSWORD");

        // Affichage des informations dans les champs de texte correspondants
        ((TextView) findViewById(R.id.user_name_info)).setText(username);
        ((TextView) findViewById(R.id.user_paswd_info)).setText(password);

    }
   public void home(View view) {

      // Création de l'intent pour retourner à la première activité
        Intent intent = new Intent(this, Login.class);
        startActivity(intent);
        // Fermeture de l'activité courante
        finish();
    }
}