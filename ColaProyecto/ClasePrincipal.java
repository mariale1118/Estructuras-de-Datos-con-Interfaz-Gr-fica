import javax.swing.JOptionPane;
public class ClasePrincipal
{
    public static void main (String [] args) {
        int opcion = 0, nodoInformacion = 0;
        Cola cola = new Cola();
        
        do {
            try {
                opcion = Integer.parseInt(JOptionPane.showInputDialog(null, 
                 "Menu de opciones/n/n" + "1 Insertar nodo/n" + "2 Extraer nodo/n" +
                 "3 Mostrar contenido cola/n" + "4 salir/n/n"));
                
                 switch(opcion) {
                     case 1 :
                         nodoInformacion = Integer.parseInt(JOptionPane.showInputDialog( null, 
                         "Ingrese el valor a guardar en el nodo"));
                         cola.Insertar(nodoInformacion);
                         break;
                    case 2 :if (!cola.colaVacia()) {
                                JOptionPane.showMessageDialog(null, "Se extrajo el nodo de valor: " + 
                             cola.Extraer());
                            } else {
                                JOptionPane.showMessageDialog(null, "La cola está vacía");}
                        
                         break;
                    case 3 :
                        cola.MostrarContenido();
                         break;
                    case 4: 
                        opcion = 4;
                         break;
                    default:
                        JOptionPane.showMessageDialog(null, "no disponible");
                        break;
                         
                    }
            } catch (NumberFormatException e) {
            }
        } while (opcion  != 4);
    }

}
