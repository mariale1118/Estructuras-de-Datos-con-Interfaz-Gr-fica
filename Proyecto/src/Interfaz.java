import javax.swing.*;
import java.awt.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;


public class Interfaz extends JFrame {

    private Arbol arbol; // creo arbol
    private JPanel panelArbol; // creo panel

    public Interfaz() {
        arbol = new Arbol();
        setTitle("Árbol Binario de Búsqueda");
        setSize(600, 400); // tamaño de la ventana
        setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE); // cerrar al salir
        setLocationRelativeTo(null); // centrar

        // menu con las opciones del arbol
        JMenuBar menuBar = new JMenuBar();
        JMenu menuArbol = new JMenu("Árbol"); 
        JMenuItem agregarItem = new JMenuItem("Agregar Nodo");
        JMenuItem eliminarItem = new JMenuItem("Eliminar Nodo");
        JMenuItem buscarItem = new JMenuItem("Buscar Nodo");

        menuArbol.add(agregarItem);
        menuArbol.add(eliminarItem);
        menuArbol.add(buscarItem);
        menuBar.add(menuArbol);
        setJMenuBar(menuBar);

    }
 

    /*public static void main(String[] args) {
        SwingUtilities.invokeLater(() -> {
            Interfaz ventana = new Interfaz();
            ventana.setVisible(true);
        });
    }*/
}