import javax.swing.JOptionPane;

public class Cola
{
    private Nodo1 headCola, tailCola; //punteros
    String cola = ""; //cuál es el contenido de la cola
    
    public Cola(){
        headCola = null;
        tailCola = null;
        //valores iniciales
    }
    
    
    //verificar si la cola está vacía
    public boolean colaVacia(){
        if (headCola==null){
            return true;
        } else { 
            return false;
        }
    }
    
    //insertar a la cola
    public void Insertar (int informacion){
        Nodo1 nuevoNodo1 = new Nodo1();
        nuevoNodo1.informacion = informacion; //la info del Nodo1 va a ser igual al int que le pasaremos 
        nuevoNodo1.siguiente = null;
        
        if (colaVacia()) {
            headCola = nuevoNodo1;
            tailCola = nuevoNodo1;
        } else {
            tailCola.siguiente = nuevoNodo1;
            tailCola = nuevoNodo1;
        }
        }
        
    //método para extraer de la cola 
    public int Extraer() {
        if (!colaVacia()) {
            int informacion = headCola.informacion;
            
            if(headCola == tailCola) { //quiere decir que es el último elemento en la cola
            headCola = null; //no están apuntado a nada 
            tailCola = null; 
            } else {
                headCola = headCola.siguiente;
            }
            return informacion; //que devuelva el valor extraído 
        }else {
            return Integer.MAX_VALUE;  //puede ser 0 pero por buenas prácticas integer.MAS_VALUE
        }
                
    }
    
    //método para mostrar el contenido de la cola/ su recorrido
    public void MostrarContenido() {
        Nodo1 recorrido = headCola; // empieza desde la cabeza de la cola
        cola = ""; // reinicia el contenido para evitar acumulaciones de ejecuciones anteriores
        
        // recorre la cola y construye la cadena con los valores
        while (recorrido != null) {
            cola += recorrido.informacion + " ";
            recorrido = recorrido.siguiente;
        }
        
        // muestra la cola
        JOptionPane.showMessageDialog(null, cola.trim());
    }
}
    
    
    

