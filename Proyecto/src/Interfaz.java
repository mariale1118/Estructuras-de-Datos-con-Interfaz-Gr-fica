import javax.swing.*;
import java.awt.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

public class Interfaz extends JFrame {

    private Arbol arbol; // Creo árbol
    private Cola cola;   // Creo cola
    private JPanel panelArbol; // Creo panel

    public Interfaz() {
        arbol = new Arbol();
        cola = new Cola();
        setTitle("Árbol Binario de Búsqueda y Cola");
        setSize(600, 400); // tamaño de la ventana
        setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE); // cerrar al salir
        setLocationRelativeTo(null); // centrar la ventana

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

        // menu con las opciones de la cola
        JMenu menuCola = new JMenu("Cola");
        JMenuItem menuColaItem = new JMenuItem("Abrir Menú de Cola");

        menuCola.add(menuColaItem);
        menuBar.add(menuCola);

        // panel del dibujo del arbol
        panelArbol = new JPanel() {
            @Override
            protected void paintComponent(Graphics g) {
                super.paintComponent(g);
                arbol.dibujarArbol(g, getWidth() / 2, 30, getWidth() / 4);
            }
        };
        panelArbol.setBackground(Color.WHITE);
        add(panelArbol, BorderLayout.CENTER);

        // anade funcionalidad para agregar nodo
        agregarItem.addActionListener(e -> {
            String valorStr = JOptionPane.showInputDialog(this, "Ingrese el valor del nodo:");
            try {
                int valor = Integer.parseInt(valorStr);
                arbol.insertar(valor);
                panelArbol.repaint(); // actualiza el dibujo del arbol
            } catch (NumberFormatException ex) {
                JOptionPane.showMessageDialog(this, "Por favor, ingrese un número válido.");
            }
        });

        // funcionalidad para eliminar nodo
        eliminarItem.addActionListener(e -> {
            String valorStr = JOptionPane.showInputDialog(this, "Ingrese el valor del nodo a eliminar:");
            try {
                int valor = Integer.parseInt(valorStr);
                arbol.eliminarNodo(valor);
                panelArbol.repaint(); 
            } catch (NumberFormatException ex) {
                JOptionPane.showMessageDialog(this, "Por favor, ingrese un número válido.");
            }
        });

        // funcionalidad para buscar nodo
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

        // menu de cola
        menuColaItem.addActionListener(e -> {
            int opcion = 0;
            
            do {
                try {
                    String opcionStr = JOptionPane.showInputDialog(this,
                            "Menú de Cola:\n" +
                                    "1. Insertar Nodo\n" +
                                    "2. Extraer Nodo\n" +
                                    "3. Mostrar Contenido\n" +
                                    "4. Salir");
                    opcion = Integer.parseInt(opcionStr);

                    switch (opcion) {
                        case 1:
                            int nodoInformacion = Integer.parseInt(JOptionPane.showInputDialog(this,
                                    "Ingrese el valor a guardar en la cola:"));
                            cola.Insertar(nodoInformacion);
                            JOptionPane.showMessageDialog(this, "Nodo insertado con éxito.");
                            break;
                        case 2:
                            if (!cola.colaVacia()) {
                                JOptionPane.showMessageDialog(this, "Se extrajo el nodo con valor: " + cola.Extraer());
                            } else {
                                JOptionPane.showMessageDialog(this, "La cola está vacía.");
                            }
                            break;
                        case 3:
                            if (!cola.colaVacia()) {
                                cola.MostrarContenido();
                            } else {
                                JOptionPane.showMessageDialog(this, "La cola está vacía.");
                            }
                            break;
                        case 4:
                            JOptionPane.showMessageDialog(this, "Saliendo del menú de cola.");
                            break;
                        default:
                            JOptionPane.showMessageDialog(this, "Opción no disponible.");
                            break;
                    }
                } catch (NumberFormatException ex) {
                    JOptionPane.showMessageDialog(this, "Por favor, ingrese un número válido.");
                }
            } while (opcion != 4);
        });
    }

    public static void main(String[] args) {
        SwingUtilities.invokeLater(() -> {
            Interfaz ventana = new Interfaz();
            ventana.setVisible(true);
        });
    }
}
