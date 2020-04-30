package tabla;

import javax.swing.*;
import javax.swing.table.AbstractTableModel;
import javax.swing.table.TableModel;
import java.awt.*;

public class Tabla extends JTable {
    public Tabla(AbstractTableModel modelo) {
        super(modelo);
    }

}
