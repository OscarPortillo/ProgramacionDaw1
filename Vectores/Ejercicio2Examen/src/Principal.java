import java.util.*;
public class Principal {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner teclado=new Scanner(System.in);
		String palabra;
		char posicion;
		int letra;
		
		System.out.println("Introduce una palabra");
		palabra = teclado.nextLine();
		
		for (int k=0; k < palabra.length(); k++){
			posicion= palabra.charAt(k);//guardamos en posicion el numero ascii que le corresponde con el indice k
			letra=(char)+posicion;//pasamos el numero ascii al caracter que le corresponde
			System.out.print(letra+""+letra);//mostramos el caracter con posicion k 2 veces "concatenado"
			
		}
	}//main
	
	

}//class