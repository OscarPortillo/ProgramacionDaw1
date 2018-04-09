import java.util.Random;

public class TestLista {

	public static void main(String[] args) {
		Lista lista = new Lista(); // crea el contenedor de Lista

		// inserta enteros en lista
		Random azar=new Random();
		int n;
		int num;
		for(int i=0;i<6;i++){
			num=azar.nextInt(2)+1;
			n=azar.nextInt(10)+1;
			if(num==1){
				System.out.println("Insertando al frente");
				lista.insertarAlFrente( n );
				lista.imprimir();
			}else if(num==2){
				System.out.println("Insertando al final");
				lista.insertarAlFinal( n );
				lista.imprimir();
			}
		}
		
		/*lista.insertarAlFrente( 0 );
		lista.imprimir();
		lista.insertarAlFinal( 1 );
		lista.imprimir();
		lista.insertarAlFinal( 5 );
		lista.imprimir();*/
		//System.out.println(lista);
		// elimina objetos de lista; imprime despu�s de cada eliminaci�n
		try
		{
			
			for(int i=0;i<6;i++){
				num=azar.nextInt(2)+1;
				if(num==1){
					System.out.println("Borrando el primero");
					Object objetoEliminado = lista.borrarPrimero();
					System.out.printf( "%s eliminado\n", objetoEliminado );
					lista.imprimir();
				}else if(num==2){
					System.out.println("Borrando el ultimo");
					Object objetoEliminado = lista.borrarUltimo();
					System.out.printf( "%s eliminado\n", objetoEliminado );
					lista.imprimir();
				}
			}
			/*Object objetoEliminado = lista.borrarPrimero();
			System.out.printf( "%s eliminado\n", objetoEliminado );
			lista.imprimir();

			objetoEliminado = lista.borrarPrimero();
			System.out.printf( "%s eliminado\n", objetoEliminado );
			lista.imprimir();

			objetoEliminado = lista.borrarUltimo();
			System.out.printf( "%s eliminado\n", objetoEliminado );
			lista.imprimir();

			objetoEliminado = lista.borrarUltimo();
			System.out.printf( "%s eliminado\n", objetoEliminado );
			lista.imprimir();*/
		} // fin de try
		catch ( ListaVaciaException excepcionListaVacia )
		{
			excepcionListaVacia.printStackTrace();
		} // fin de catch

	}

}