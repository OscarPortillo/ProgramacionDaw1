import java.util.*;
public class Principal {

	public static void main(String[] args) {

		@SuppressWarnings("resource")
		Scanner teclado=new Scanner(System.in);

		String vecPalabras[]={"messi","dembele","pitoshicos"};
		String letra,palabraMisteriosa;
		char arrayPrueba[];

		int intentos,aciertos;
		boolean acertada=false;


		palabraMisteriosa=vecPalabras[(int)(Math.random()*3)];
		arrayPrueba=new char[palabraMisteriosa.length()];
		//rELLENAMOS LA PALABRAPRUEBA CON RAYAS
		for(int ind=0;ind<palabraMisteriosa.length();ind++){
			arrayPrueba[ind] = '_';
		}
		intentos=0;
		aciertos=0;
		while(intentos < 10 && acertada==false ){

			do{
				System.out.println();
				System.out.println("Letra ? ");
				letra=teclado.nextLine();
			}while(letra.length()>1);
			for(int ind=0;ind<palabraMisteriosa.length();ind++){
				if(palabraMisteriosa.charAt(ind)==letra.charAt(0)){//me dar�a error si no cojo la posicion por qu enecesito comparar char con char y letra es string
					arrayPrueba[ind]=letra.charAt(0);
					aciertos++;	
					
				}//if
				System.out.print(arrayPrueba[ind]);
			}//fors
			
			if(aciertos==palabraMisteriosa.length()){
				acertada=true;
			}
		}//while
		System.out.println();
		if(acertada==true){
			System.out.println("EN HORABUENA HAS ACERTADO");
		}else{
			System.out.println("SIGUE PARTICIPANDO");
		}
	}//main

}//class