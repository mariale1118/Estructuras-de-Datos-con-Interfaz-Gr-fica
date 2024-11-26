public class Arbol {
    
    //metodo para insertar de manera recursiva
    public Nodo insertar(Nodo nodo, int dato) {
        //caso base
        if (nodo == null) {
            nodo = new Nodo(dato);
        }
        //evita duplicados
        if (dato == nodo.dato) {
            return nodo;
        }
        //tipico movimiento de insercion
        if (dato < nodo.dato) {
            nodo.anterior = insertar(nodo.anterior, dato);
        } else{
            nodo.siguiente = insertar(nodo.siguiente, dato);
        }

        return nodo;
        
    }
    //metodo recursivo para buscar
    public Nodo buscar(Nodo nodo, int dato) {
        if (nodo == null) {
            return null;
        }
        //caso base encontro el dato
        if (dato == nodo.dato) {
            return nodo;
        }
        //tipico movimiento de busqueda
        if (dato < nodo.dato) {
            return buscar(nodo.anterior, dato);
        } else {
            return buscar(nodo.siguiente, dato);
        }
    }


    public Nodo eliminarNodo(Nodo nodo, int dato) {

    }

    
    //metodo sencillo de impresion en orden (de izquierda a derecha)
    public void imprimir(Nodo nodo) {
        if (nodo != null) {
            imprimir(nodo.anterior);
            System.out.println(nodo.dato);
            imprimir(nodo.siguiente);
        }
    }

    public static void main(String[] args) {
        Nodo nodo = new Nodo(3);
        Arbol arbol = new Arbol();
        arbol.insertar(nodo, 1);
        arbol.insertar(nodo, 6);
        arbol.insertar(nodo, 2);
        arbol.insertar(nodo, 5);
        arbol.insertar(nodo, 4);

        arbol.imprimir(nodo);


    }
}
