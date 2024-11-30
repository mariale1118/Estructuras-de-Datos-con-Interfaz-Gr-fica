import javax.swing.JOptionPane;
//mi cola va de derecha a izquierda, no de izquierda a derecha, siendo el la cabeza de la cola el que está más a la derecha
public class Cola
{
    private NodoC headCola, tailCola; //punteros
    String cola = ""; //cuál es el contenido de la cola
    
    public Cola(){
        headCola = null; //el profe dijo que todo en español o en ingles y le mencioné que había dejado estas únicas en ingles y visto bueno
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
        NodoC nuevoNodo = new NodoC();
        nuevoNodo.informacion = informacion; //la info del nodo va a ser igual al int que le pasaremos 
        nuevoNodo.siguiente = null;
        
        if (colaVacia()) {
            headCola = nuevoNodo;
            tailCola = nuevoNodo;
        } else {
            tailCola.siguiente = nuevoNodo;
            tailCola = nuevoNodo;
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
        NodoC recorrido = headCola;
        String colaInvertida = ""; //para invertir la cadena de texto cuando se imprime
        
        while(recorrido != null) {
         cola += recorrido.informacion + " ";
         recorrido = recorrido.siguiente;
        }
        
        String cadena [] = cola.split(" ");//split permite separar los caracteres para que no invierta toda la cadena
        for (int i = cadena.length -1; i >= 0; i--) {
            colaInvertida += " " + cadena[i];}
        JOptionPane.showMessageDialog(null, colaInvertida);
        cola = "";
    }
}
    
    
    

