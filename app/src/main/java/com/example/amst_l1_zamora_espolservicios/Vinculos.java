package com.example.amst_l1_zamora_espolservicios;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.widget.Toast;

public class Vinculos extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_vinculos);
        Toast toast=Toast.makeText(getApplicationContext(),"Atencion 8:00am - 16:00pm",Toast.LENGTH_SHORT);
        toast.show();
    }
}
