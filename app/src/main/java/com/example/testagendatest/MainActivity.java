package com.example.testagendatest;

import androidx.appcompat.app.AppCompatActivity;
import androidx.recyclerview.widget.LinearLayoutManager;
import androidx.recyclerview.widget.RecyclerView;

import android.content.Intent;
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
        element.add(new ListElement( " Fernanda", "limpieza", "Viernes"));
        element.add(new ListElement( " Robinson", "protesis", "Viernes"));
        element.add(new ListElement( " Beatriz", "revision", "Viernes"));
        element.add(new ListElement( " Oscar", "ortodoncia", "Viernes"));
        element.add(new ListElement( " Mirian", "extraccion", "Viernes"));
        element.add(new ListElement( " Kira", "implante", "Viernes"));
        element.add(new ListElement( " Jose ", "Limpieza dental", "Lunes"));
        element.add(new ListElement( " Carmen", "ortodoncia", "Martes"));
        element.add(new ListElement( " Delgado", "extraccion", "Miercoles"));
        element.add(new ListElement( " Alberto", "implante", "Viernes"));
        element.add(new ListElement( " Alberto", "implante", "Viernes"));
        element.add(new ListElement( " Alberto", "implante", "Viernes"));
        element.add(new ListElement( " Alberto", "implante", "Viernes"));
        element.add(new ListElement( " Alberto", "implante", "Viernes"));
        element.add(new ListElement( " Alberto", "implante", "Viernes"));

        ListAdapter listAdapter = new ListAdapter(element, this, new ListAdapter.OnItemClickListener() {
            @Override
            public void onItemClick(ListElement item) {

                moveToDescription(item);
            }
        });

        RecyclerView recyclerView= findViewById(R.id.recyclerView);
        recyclerView.setHasFixedSize(true);
        recyclerView.setLayoutManager(new LinearLayoutManager(this));
        recyclerView.setAdapter(listAdapter);




    }

    public void moveToDescription(ListElement item){


        Intent intent = new Intent(this, DescripcionCard.class);
        intent.putExtra("ListElement", item);
        startActivity(intent); 
    }

}
