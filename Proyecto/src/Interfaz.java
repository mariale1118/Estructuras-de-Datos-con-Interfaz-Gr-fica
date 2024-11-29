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

        // Panel para el dibujo del árbol
        panelArbol = new JPanel() {
            @Override
            protected void paintComponent(Graphics g) {
                super.paintComponent(g);
                arbol.dibujarArbol(g, getWidth() / 2, 30, getWidth() / 4);
            }
        };
        panelArbol.setBackground(Color.WHITE);
        add(panelArbol, BorderLayout.CENTER);

        // Acción para agregar nodo
        agregarItem.addActionListener(e -> {
            String valorStr = JOptionPane.showInputDialog(this, "Ingrese el valor del nodo:");
            try {
                int valor = Integer.parseInt(valorStr);
                arbol.insertar(valor);
                panelArbol.repaint(); // Actualizar el dibujo del árbol
            } catch (NumberFormatException ex) {
                JOptionPane.showMessageDialog(this, "Por favor, ingrese un número válido.");
            }
        });

        // Acción para eliminar nodo
        eliminarItem.addActionListener(e -> {
            String valorStr = JOptionPane.showInputDialog(this, "Ingrese el valor del nodo a eliminar:");
            try {
                int valor = Integer.parseInt(valorStr);
                arbol.eliminarNodo(valor);
                panelArbol.repaint(); // Actualizar el dibujo del árbol
            } catch (NumberFormatException ex) {
                JOptionPane.showMessageDialog(this, "Por favor, ingrese un número válido.");
            }
        });

        // Acción para buscar nodo
        buscarItem.addActionListener(e -> {
            String valorStr = JOptionPane.showInputDialog(this, "Ingrese el valor del nodo a buscar:");
            try {
                int valor = Integer.parseInt(valorStr);
                boolean encontrado = arbol.buscar(valor);
                String mensaje = encontrado ? "Nodo encontrado" : "No se encontró el nodo";
                JOptionPane.showMessageDialog(this, mensaje);
            } catch (NumberFormatException ex) {
                JOptionPane.showMessageDialog(this, "Por favor, ingrese un número válido.");
            }
        });
    }

    public static void main(String[] args) {
        SwingUtilities.invokeLater(() -> {
            Interfaz ventana = new Interfaz();
            ventana.setVisible(true);
        });
    }
}