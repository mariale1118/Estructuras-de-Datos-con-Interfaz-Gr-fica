

public class Cola
{
    private Nodo headCola, tailCola;
    String cola = "";
    
    public Cola(){
        headCola = null;
        tailCola = null;
        
    }
    
    
    //verificar si la cola está vacía
    public boolean ColaVacia(){
        if (headCola==null){
            return true;
        } else { 
            return false;
        }
    }
    
    //insertar a la cola
    public void Insertar (int informacion){
        Nodo nuevoNodo = new Nodo();
        nuevoNodo.informacion = informacion;
        nuevoNodo.siguiente = null;
    }
}
    

