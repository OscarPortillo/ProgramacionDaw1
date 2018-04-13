
public class Principal {

	public static void main(String[] args) {
		/**
		 * Implementar el tipo abstracto de datos pila de enteros (se podrán
		 * almacenar un número indeterminado de números enteros y a la hora de
		 * extraer información el último elemento que se haya añadido será el
		 * primero en salir) con las operaciones de:  Apilar en la cima 
		 * Desapilar de la cima  Número de elementos apilados  Visualización
		 * de elementos de la pila. Tener en cuenta que al mostrar un elemento
		 * de una pila lo borramos.
		 */
		Pila unaPila = new Pila();
		Integer opc,num;
		do {
			menu();
			opc = Leer.pedirEntero("Elige opción");
			switch (opc) {
			case 1:
				
				num=Leer.pedirEntero("Introduzca el numero que quiere apilar");
				unaPila.apilar(num);
				break;
			case 2:
				Leer.mostrarEnPantalla(unaPila.desapilar());
				break;
			case 3:
				unaPila.tamañoPila();
				break;
			case 4:
				unaPila.visualizarYBorrar();
				break;
			}
		} while (opc != 0);
	}// main

	public static void menu() {
		Leer.mostrarEnPantalla("1 - Apilar en la cima.");
		Leer.mostrarEnPantalla("2 - Desapilar de la cima.");
		Leer.mostrarEnPantalla("3 - Numero de elementos apilados.");
		Leer.mostrarEnPantalla("4 - Visualizar los elementos de la pila. (Se borrarán los datos)");
		Leer.mostrarEnPantalla("0 - Salir");
	}
}// class
