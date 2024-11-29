import java.awt.*;

public class Arbol {
    

    Nodo raiz;

    public Arbol() {
        raiz = null;
    }
 

    public void insertar(int dato) {
        raiz = insertarRec(raiz, dato);
    }

    //metodo para insertar de manera recursiva
    public Nodo insertarRec(Nodo nodo, int dato) {
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
            nodo.anterior = insertarRec(nodo.anterior, dato);
        } else{
            nodo.siguiente = insertarRec(nodo.siguiente, dato);
        }

        return nodo;
        
    }

    public boolean buscar(int dato) {
        return buscarRec(raiz, dato);
    }


    //metodo recursivo para buscar
    public boolean buscarRec(Nodo nodo, int dato) {
        //caso base
        if (nodo == null) {
            return false;
        }
        //caso base
        if (dato == nodo.dato) {
            return true;
        }
        //tipico movimiento de busqueda
        if (dato < nodo.dato) {
            return buscarRec(nodo.anterior, dato);
        } else {
            return buscarRec(nodo.siguiente, dato);
        }
    }

    public void eliminarNodo(int dato) {
        raiz = eliminarNodoRec(raiz, dato);
    }

    public Nodo eliminarNodoRec(Nodo nodo, int dato) {
        if (nodo == null) {
            return null;
        }
        //caso base
        if (dato == nodo.dato) {
            //caso 1: no tiene hijos
            if (nodo.anterior == null && nodo.siguiente == null) {
                return null;
            }
            //caso 2: tiene un hijo
            if (nodo.anterior == null) {
                return nodo.siguiente;
            }
            if (nodo.siguiente == null) {
                return nodo.anterior;
            }
            //caso 3: tiene dos hijos
            Nodo sucesor = nodo.siguiente;
            while (sucesor.anterior != null) {
                sucesor = sucesor.anterior;
            }
            nodo.dato = sucesor.dato;
            nodo.siguiente = eliminarNodoRec(nodo.siguiente, sucesor.dato);
            return nodo;
        }
        //tipico movimiento arbol para eliminar
        if (dato < nodo.dato) {
            nodo.anterior = eliminarNodoRec(nodo.anterior, dato);
        } else {
            nodo.siguiente = eliminarNodoRec(nodo.siguiente, dato);
        }
        return nodo;
    }

    
    //metodo sencillo de impresion en orden (de izquierda a derecha)
    public void imprimir(Nodo nodo) {
        if (nodo != null) {
            imprimir(nodo.anterior);
            System.out.println(nodo.dato);
            imprimir(nodo.siguiente);
        }
    }

    public void dibujarArbol(Graphics g, int x, int y, int xOffset) {
        dibujarNodo(g, raiz, x, y, xOffset);
    }

    private void dibujarNodo(Graphics g, Nodo nodo, int x, int y, int xOffset) {
        if (nodo != null) {
            g.setColor(Color.RED);
            g.fillOval(x - 15, y - 15, 30, 30);
            g.setColor(Color.WHITE);
            g.drawString(String.valueOf(nodo.dato), x - 5, y + 5);

            if (nodo.anterior != null) {
                g.setColor(Color.BLACK);
                g.drawLine(x, y, x - xOffset, y + 50);
                dibujarNodo(g, nodo.anterior, x - xOffset, y + 50, xOffset / 2);
            }
            if (nodo.siguiente != null) {
                g.setColor(Color.BLACK);
                g.drawLine(x, y, x + xOffset, y + 50);
                dibujarNodo(g, nodo.siguiente, x + xOffset, y + 50, xOffset / 2);
            }
        }
    }


/*   public static void main(String[] args) {

        Arbol arbol = new Arbol();
        arbol.insertar(1);
        arbol.insertar(6);
        arbol.insertar(2);
        arbol.insertar(5);
        arbol.insertar(4);

        arbol.eliminarNodo( 4);

        arbol.imprimir(arbol.raiz);


    }*/
}
