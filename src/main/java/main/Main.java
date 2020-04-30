package main;

import datos.Persona;
import es.uji.www.GeneradorDatosINE;
import tabla.ModeloTabla;
import tabla.Tabla;

import javax.swing.*;
import java.util.ArrayList;
import java.util.List;

public class Main {
    public static void main(String[] args) {
        new Main().ejemploJTable();
    }

    private void ejemploJTable() {
        JFrame ventana = new JFrame("Ejemplo JTable");
        ventana.getContentPane().add(new JScrollPane(new Tabla(new ModeloTabla(generaListaPersonas()))));
        ventana.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        ventana.pack();
        ventana.setVisible(true);
    }

    private List<Persona> generaListaPersonas() {
        GeneradorDatosINE generador = new GeneradorDatosINE();
        List<Persona> personas = new ArrayList<>();

        for (int i = 0; i < 100; i++) {
            personas.add(new Persona(generador.getNombre(), generador.getApellido()));
        }

        return personas;
    }
}
