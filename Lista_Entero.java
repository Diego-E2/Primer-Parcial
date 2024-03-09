package Lista_Examen;

public class Lista_Entero {
	
	Nodo cabeza; //Referencia al primer nodo de la lista
	
	//Constructor para inicializar la lista como vacia
	

public Lista_Entero() {
	this.cabeza = null; //La lista comienza vacia
}

//Metodo para insertar un nuevo nodo al inicio de la lista
public void insertarNumeroEntero(int dato) {
	Nodo nuevoNodo = new Nodo(dato);//Crea un nuevo nodo con el valor proporcionado
	nuevoNodo.siguiente = cabeza;//Establece el siguiente de nuevo nodo como la cabeza actual
	cabeza = nuevoNodo;//Actualiza la cabeza para que apunte al nuevo nodo
}

//Metodo para imprimir los elementos de la lista
public void imprimirLista() {
	Nodo temp = cabeza;
	System.out.print("Lista: \n");
	while (temp != null) {//Recorre la lista
		System.out.print(temp.dato + " ");//Imprime el valor del nodo actual
		temp = temp.siguiente;//Avanza al siguiente nodo
	}
	System.out.println();
}

//Metodo para imprimir los elementos de la lista
public void imprimirLista2() {
	Nodo temp = cabeza;
	System.out.print("Lista: \n");
	while (temp != null) {//Recorre la lista
		System.out.print(temp.dato + " ");//Imprime el valor del nodo actual
		temp = temp.siguiente;//Avanza al siguiente nodo
	}
	System.out.println();
}


}
