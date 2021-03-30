package com.example.testagendatest;

import androidx.appcompat.app.AppCompatActivity;
import androidx.recyclerview.widget.LinearLayoutManager;
import androidx.recyclerview.widget.RecyclerView;

import android.os.Bundle;

import java.util.ArrayList;
import java.util.List;

public class MainActivity extends AppCompatActivity {


    List<ListElement> element;



    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);


        init();

    }







    public void init(){

        element= new ArrayList<>();
        element.add(new ListElement( " Jose ", "Limpieza dental", "Lunes"));
        element.add(new ListElement( " Carmen", "ortodoncia", "Martes"));
        element.add(new ListElement( " Delgado", "extraccion", "Miercoles"));
        element.add(new ListElement( " Alberto", "implante", "Viernes"));
        element.add(new ListElement( " Alberto", "implante", "Viernes"));
        element.add(new ListElement( " Alberto", "implante", "Viernes"));
        element.add(new ListElement( " Alberto", "implante", "Viernes"));
        element.add(new ListElement( " Alberto", "implante", "Viernes"));
        element.add(new ListElement( " Alberto", "implante", "Viernes"));
        element.add(new ListElement( " Jose ", "Limpieza dental", "Lunes"));
        element.add(new ListElement( " Carmen", "ortodoncia", "Martes"));
        element.add(new ListElement( " Delgado", "extraccion", "Miercoles"));
        element.add(new ListElement( " Alberto", "implante", "Viernes"));
        element.add(new ListElement( " Alberto", "implante", "Viernes"));
        element.add(new ListElement( " Alberto", "implante", "Viernes"));
        element.add(new ListElement( " Alberto", "implante", "Viernes"));
        element.add(new ListElement( " Alberto", "implante", "Viernes"));
        element.add(new ListElement( " Alberto", "implante", "Viernes"));

        ListAdapter listAdapter = new ListAdapter(element,this);

        RecyclerView recyclerView= findViewById(R.id.recyclerView);
        recyclerView.setHasFixedSize(true);
        recyclerView.setLayoutManager(new LinearLayoutManager(this));
        recyclerView.setAdapter(listAdapter);




    }

}
