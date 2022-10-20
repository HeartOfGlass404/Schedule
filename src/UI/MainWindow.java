package UI;

import javax.swing.*;
import javax.swing.table.TableColumn;
import java.awt.*;

public class MainWindow extends JFrame {
    private JTable table1;
    private JPanel panel1;

    public MainWindow(){
        this.setContentPane(panel1);
        table1.addColumn(new TableColumn(0,100));
        table1.addColumn(new TableColumn(0,100));
        table1.addColumn(new TableColumn(0,100));
        table1.addColumn(new TableColumn(0,100));

    }

}
