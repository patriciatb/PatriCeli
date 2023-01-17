package ufv.extraordinaria.dis.ptb;

import ufv.extraordinaria.dis.ptb.Clases.DatosTwitter;

import java.util.ArrayList;

public class DBtwitter {
    private ArrayList<DatosTwitter> data; // Lista de datos

    public DBtwitter(ArrayList<DatosTwitter> datos) {
        this.data = datos;
    } // Constructor de la clase DB

    public DBtwitter() { // constructor
    }

    // Getter & Setter
    public ArrayList<DatosTwitter> getDatos() {
        return data;
    }
    public void setDatos(ArrayList<DatosTwitter> datos) {
        this.data = datos;
    }
}

