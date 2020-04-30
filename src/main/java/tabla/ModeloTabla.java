package tabla;

import datos.Persona;

import javax.swing.table.AbstractTableModel;
import java.util.Arrays;
import java.util.List;

public class ModeloTabla extends AbstractTableModel {
    final List<String> cabeceras = Arrays.asList("Nombre", "Apellidos");
    List<Persona> datos;

    public ModeloTabla(final List<Persona> datos) {
        this.datos = datos;
    }

    public void setDatos(final List<Persona> datos) {
        this.datos = datos;
    }

    public int getRowCount() {
        return datos.size();
    }

    public int getColumnCount() {
        return cabeceras.size();
    }

    public String getValueAt(int fila, int columna) {
        if (columna == 0) return datos.get(fila).nombre;
        if (columna == 1) return datos.get(fila).apellidos;
        else return "";
    }

    @Override
    public String getColumnName(int column) {
        return cabeceras.get(column);
    }
}
