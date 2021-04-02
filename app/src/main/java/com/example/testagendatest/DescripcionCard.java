package com.example.testagendatest;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.widget.TextView;

public class DescripcionCard extends AppCompatActivity {

    TextView paciente;
    TextView tratamiento;
    TextView dia_tratamiento;


    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_descripcion_card);


        ListElement element = (ListElement) getIntent().getSerializableExtra("ListElement");
        paciente=findViewById(R.id.paciente);
        tratamiento=findViewById(R.id.tratamiento);
        dia_tratamiento=findViewById(R.id.dia_tratamiento);

        paciente.setText(element.getName());
        tratamiento.setText(element.getTratamiento());
        dia_tratamiento.setText(element.getDia());



    }
}
