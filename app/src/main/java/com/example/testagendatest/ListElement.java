package com.example.testagendatest;

import java.io.Serializable;

public class ListElement implements Serializable {


public String name;
public String tratamiento;
public String Dia;


    public ListElement( String name, String tratamiento, String dia) {
        this.name = name;
        this.tratamiento = tratamiento;
        Dia = dia;
    }





    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getTratamiento() {
        return tratamiento;
    }

    public void setTratamiento(String tratamiento) {
        this.tratamiento = tratamiento;
    }

    public String getDia() {
        return Dia;
    }

    public void setDia(String dia) {
        Dia = dia;
    }




}
