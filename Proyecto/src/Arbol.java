public class Arbol {
    
    //metodo para insertar de manera recursiva
    public void insertar(Nodo raiz, int valor) {
        if (raiz == null) {
            raiz = new Nodo(valor);
        } else {
            if (valor < raiz.dato) {
                if (raiz.anterior == null) {
                    raiz.anterior = new Nodo(valor);
                } else {
                    insertar(raiz.anterior, valor);
                }
            } else {
                if (raiz.siguiente == null) {
                    raiz.siguiente = new Nodo(valor);
                } else {
                    insertar(raiz.siguiente, valor);
                }
            }
        }
    }
    //metodo sencillo de impresion en orden (de izquierda a derecha)
    public void imprimir(Nodo raiz) {
        if (raiz != null) {
            imprimir(raiz.anterior);
            System.out.println(raiz.dato);
            imprimir(raiz.siguiente);
        }
    }

    public static void main(String[] args) {
        Nodo raiz = new Nodo(3);
        Arbol arbol = new Arbol();
        arbol.insertar(raiz, 1);
        arbol.insertar(raiz, 6);
        arbol.insertar(raiz, 2);
        arbol.insertar(raiz, 5);
        arbol.insertar(raiz, 4);

        arbol.imprimir(raiz);


    }
}
