package com.example.teste;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.TextView;
import android.widget.Toast;

public class MainActivity extends AppCompatActivity {

    Double memoriaValor = 0.0;


    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        EditText num1         = (EditText) findViewById(R.id.numero_1);
        EditText num2         = (EditText) findViewById(R.id.numero_2);
        Button btnSoma        = (Button) findViewById(R.id.btnSoma);
        Button btnSubtrai     = (Button) findViewById(R.id.btnSubtrai);
        Button btnMultiplica  = (Button) findViewById(R.id.btnMultiplica);
        Button btnDivide      = (Button) findViewById(R.id.btnDivide);
        EditText Resultado    = (EditText) findViewById(R.id.result_num);
        Button btnMC          = (Button) findViewById(R.id.btnMC);
        Button btnMR          = (Button) findViewById(R.id.btnMR);
        Button btnMSoma       = (Button) findViewById(R.id.btnMSoma);
        Button btnMSubtrai    = (Button) findViewById(R.id.btnMSubtrai);
        Button Finalizar      = (Button) findViewById(R.id.Finalizar);
        TextView memoria      = (TextView) findViewById(R.id.memoria);
        TextView Resultado_1  = (TextView) findViewById(R.id.Resultado_memoria);
        Button btnHistorico    = (Button) findViewById(R.id.btnHistorico);


        Finalizar.setOnClickListener((new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                System.exit(0);
            }
        }));

        btnSoma.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Double num_1 = Double.parseDouble(num1.getText().toString());
                Double num_2 = Double.parseDouble(num2.getText().toString());
                Double soma = num_1+ num_2;

                String vl = String.valueOf(soma);

                Resultado.setText(vl);
            }
        });

        btnSubtrai.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Double num_1 = Double.parseDouble(num1.getText().toString());
                Double num_2 = Double.parseDouble(num2.getText().toString());
                Double Subtrai = num_1 - num_2;

                Resultado.setText(Subtrai.toString());
            }
        });

        btnMultiplica.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Double num_1 = Double.parseDouble(num1.getText().toString());
                Double num_2 = Double.parseDouble(num2.getText().toString());
                Double Multiplica = num_1 * num_2;

                Resultado.setText(Multiplica.toString());
            }
        });

        btnDivide.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Double num_1 = Double.parseDouble(num1.getText().toString());
                Double num_2 = Double.parseDouble(num2.getText().toString());
                if(num_2 != 0){
                    Double Divide =  num_1 / num_2;
                    Resultado.setText(Divide.toString());
                }
                else{
                    Toast.makeText(getApplicationContext(), "Errou....", Toast.LENGTH_SHORT).show();
                }
            }
        });

        btnMC.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                memoriaValor = 0.0;
                Resultado_1.setText("");
            }
        });

        btnMR.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                num1.setText(Resultado_1.getText());
            }
        });

        btnMSoma.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
               memoriaValor += Double.parseDouble(Resultado.getText().toString());
               Resultado_1.setText(memoriaValor.toString());


            }
        });

        btnMSubtrai.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {

                memoriaValor -= Double.parseDouble(Resultado.getText().toString());
                Resultado_1.setText(memoriaValor.toString());

            }
        });

        btnHistorico.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {

                Intent intent = new Intent (MainActivity.this, historico.class);
                startActivity(intent);

            }
        });












    

    }
}