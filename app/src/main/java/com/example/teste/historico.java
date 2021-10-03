package com.example.teste;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.ListView;

public class historico extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_historico);


        Button btnlimpa = (Button) findViewById(R.id.btnLimpa);
        Button btnvolta = (Button) findViewById(R.id.btnVoltar);
        ListView Historico = (ListView) findViewById(R.id.historico);


        btnvolta.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {

                Intent intent = new Intent (historico.this, MainActivity.class);
                startActivity(intent);

            }
        });

    }
}