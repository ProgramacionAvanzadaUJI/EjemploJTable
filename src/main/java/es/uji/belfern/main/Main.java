package es.uji.belfern.main;

import es.uji.belfern.datos.Persona;
import es.uji.www.GeneradorDatosINE;
import es.uji.belfern.tabla.ModeloTabla;
import es.uji.belfern.tabla.Tabla;

import javax.swing.*;
import java.awt.*;
import java.util.ArrayList;
import java.util.List;
import java.util.Random;

public class Main {
    public static void main(String[] args) {
        SwingUtilities.invokeLater(() -> new Main().ejemploJTable());
    }

    private void ejemploJTable() {
        JFrame ventana = new JFrame("Ejemplo JTable");
        ModeloTabla modeloTabla = new ModeloTabla(generaListaPersonas());
        Tabla tabla = new Tabla(modeloTabla);
        ventana.getContentPane().add(new JScrollPane(tabla));
        JButton boton = new JButton("Nuevos");
        boton.addActionListener(e -> tabla.setModel(new ModeloTabla(generaListaPersonas())));
        ventana.getContentPane().add(boton, BorderLayout.SOUTH);
        ventana.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        ventana.pack();
        ventana.setVisible(true);
    }

    private List<Persona> generaListaPersonas() {
        GeneradorDatosINE generador = new GeneradorDatosINE();
        List<Persona> personas = new ArrayList<>();
        Random random = new Random();

        for (int i = 0; i < 25 + random.nextInt(26); i++) {
            personas.add(new Persona(generador.getNombre(), generador.getApellido()));
        }

        return personas;
    }
}
