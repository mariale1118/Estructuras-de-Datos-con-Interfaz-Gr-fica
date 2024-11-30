# Estructuras-de-Datos-con-Interfaz-Gr-fica
Proyecto 2
Sebastian de Jesus Chaves Durán
María Alejandra Vargas Avilés

Este proyecto consiste en la implementación de un árbol binario de búsqueda y una cola, ambos con métodos fundamentales como insertar, eliminar, buscar, y visualizar los datos. El árbol y la cola se muestran mediante una interfaz gráfica que permite al usuario interactuar con ellos de forma sencilla. A continuación, se detalla el funcionamiento y la manera de utilizar el programa.

Estructura del Proyecto

El proyecto está compuesto por varias clases que implementan las estructuras de datos y la interfaz gráfica de usuario. Las principales clases del proyecto son las siguientes:

Clase Nodo: Esta clase define un nodo que es utilizado tanto en el árbol binario como en la cola. En el árbol binario, cada nodo tiene un valor de tipo int y dos punteros, uno hacia el nodo anterior y otro hacia el siguiente nodo. En la cola, cada nodo tiene un valor y un puntero hacia el siguiente nodo en la cola.

Clase Árbol: La clase Arbol representa un árbol binario de búsqueda. Un árbol binario de búsqueda es una estructura de datos que mantiene los valores organizados de manera que los nodos de la subrama izquierda tienen valores menores y los nodos de la subrama derecha tienen valores mayores que el nodo raíz. Esta clase proporciona métodos para insertar nodos, eliminar nodos y buscar nodos en el árbol. Los métodos son recursivos y permiten realizar estas operaciones de manera eficiente.

Clase Cola: La clase Cola implementa una cola utilizando nodos. La cola sigue el principio FIFO (First In, First Out), lo que significa que el primer elemento en ser insertado será el primero en ser extraído. La clase permite insertar nuevos elementos, extraer elementos de la cola y mostrar el contenido actual de la cola. El nodo primero a la derecha es el primero a la derecha, el más a la izquierda es la cola

Clase Interfaz: La clase Interfaz es la que proporciona la interfaz gráfica al usuario. Utiliza JFrame para mostrar una ventana interactiva que permite a los usuarios trabajar con el árbol binario y la cola. A través de menús y cuadros de diálogo, los usuarios pueden agregar, eliminar y buscar nodos en el árbol, así como insertar, extraer y mostrar el contenido de la cola.
Cómo Utilizar el Programa

El programa tiene una interfaz gráfica con varias opciones en un menú para interactuar tanto con el árbol binario como con la cola. A continuación, te explico cómo puedes utilizar cada una de las funcionalidades disponibles:

Árbol Binario:

Agregar un Nodo: Puedes agregar un nodo al árbol seleccionando la opción "Agregar Nodo" en el menú "Árbol". Se te pedirá que ingreses un valor numérico. Ese valor se insertará en el árbol de acuerdo con las reglas de los árboles binarios de búsqueda, es decir, el árbol se organiza automáticamente para mantener el orden correcto de los nodos.


Eliminar un Nodo: Si deseas eliminar un nodo del árbol, selecciona la opción "Eliminar Nodo". Se te pedirá que ingreses el valor del nodo que deseas eliminar. Si el nodo existe en el árbol, se eliminará y el árbol se reorganizará para mantener su estructura.
Buscar un Nodo: La opción "Buscar Nodo" te permitirá buscar un nodo específico en el árbol. Debes ingresar el valor del nodo que deseas buscar. Si el nodo está presente, el sistema te lo notificará, de lo contrario, te dirá que no se ha encontrado.

El árbol binario de búsqueda se dibuja de manera visual en el panel central de la ventana. Los nodos se dibujan como círculos rojos con su valor dentro, y las conexiones entre los nodos se dibujan como líneas negras. Esto te permitirá ver de manera gráfica cómo se organiza el árbol a medida que insertas o eliminas nodos.

Cola: 

Insertar un Nodo: Para insertar un nodo en la cola, selecciona la opción correspondiente en el menú "Cola". Se te pedirá que ingreses un valor para el nodo. El valor ingresado se añadirá al final de la cola.

Extraer un Nodo: Puedes extraer el primer nodo de la cola seleccionando la opción "Extraer Nodo". El nodo será eliminado de la cola y su valor será mostrado en un cuadro de mensaje. Si la cola está vacía, recibirás un mensaje notificándote de ello.

Mostrar Contenido: Seleccionando la opción "Mostrar Contenido", podrás ver los elementos actuales de la cola. Los elementos serán mostrados en el orden en que fueron insertados, desde el primero hasta el último.
Visualización del Árbol


Este proyecto requiere de un entorno de desarrollo que soporte Java y es necesario tener instalada la versión 1.8 o superior de Java.
