
public class GestionPaises {

	public static void main(String[] args) {
		
		ListaDePaises lista = null;
		Integer opcion;
		@SuppressWarnings("unused")
		Integer maxPaises;

		String nombre;
		menu();
		opcion = Leer.pedirEntero("Elija opcion:");
		//maxPaises=Leer.pedirEntero("Cuantos paises desea A�adir");
		while (opcion != 0) {
			switch (opcion) {
			case 1:

				lista=crearLista();
				break;
			case 2:
				nombre=Leer.pedirCadena("Introduce el nombre del pais");
				lista.anyadir(nombre);
				break;
			case 3:

				break;
			case 4:
				lista.
				break;
			case 5:

				break;
			}

			menu();
			opcion = Leer.pedirEntero("Elija opcion:");
		}

	}//main

	public static void menu(){//menu
		Leer.mostrarEnPantalla("1- Crear lista");
		Leer.mostrarEnPantalla("2- A�adir un nombre");
		Leer.mostrarEnPantalla("3- Borrar un nombre");
		Leer.mostrarEnPantalla("4 Listar todos los nombres");
		Leer.mostrarEnPantalla("5- Borrar todos los nombres");
		Leer.mostrarEnPantalla("0 Finalizar el programa");
	}//menu

	public static ListaDePaises crearLista(){//ListaDePaises[]
		ListaDePaises miLista = null;
		Integer num;
		num=Leer.pedirEntero("Cuantos paises desea crear");
		miLista=new ListaDePaises(num);

		return miLista;
	}//ListaDePaises[]

}// class





