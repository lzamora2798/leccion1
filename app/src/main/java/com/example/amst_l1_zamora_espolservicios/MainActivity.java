package com.example.amst_l1_zamora_espolservicios;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;

public class MainActivity extends AppCompatActivity {
    private Button sidweb,academico,bienestar,vinculos;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        sidweb = (Button) findViewById(R.id.sidweb);
        academico = (Button) findViewById(R.id.academico);
        bienestar = (Button) findViewById(R.id.bienestar);
        vinculos = (Button) findViewById(R.id.vinculos);
    }

    public void iniciarSidweb(View view){
        Intent intent = new Intent(this, Sidweb.class);
        startActivity(intent);
    }
    public void iniciarAcademico(View view){
        Intent intent = new Intent(this, Academico.class);
        startActivity(intent);
    }
    public void iniciarBienestar(View view){
        Intent intent = new Intent(this, Bienestar.class);
        startActivity(intent);
    }
    public void iniciarVinculos(View view){
        Intent intent = new Intent(this, Vinculos.class);
        startActivity(intent);
    }
}


/*
Toast toast=Toast.makeText(getApplicationContext(),"Usted no cuenta con un usuario",Toast.LENGTH_SHORT);
                toast.show();
 */