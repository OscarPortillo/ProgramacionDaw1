import java.util.*;
public class Ejer33 {

	public static void main(String[] args) {
		String vecNombres [] = {"Ana", "Jose", "Rafa", "Luis", "Adela", "Raul", "German",
				"Eric", "Agustin", "Antonio", "Carla", "Jaime", "Diego", "Jesus", "Abel", "David",
				"Pilar", "Carmen", "Teresa", "Lolo", "Perico"};
		String arrayNombres [] = new String [20];
		@SuppressWarnings("unused")
		int indice , indiceAzar;
		indice = 0;
		Random azar=new Random();
		
		for( ; indice< 20; indice++){
			arrayNombres[indice] = vecNombres[azar.nextInt(21)]; 
		}
		int k=1;
		System.out.println(vecNombres.length);
		for(indice=0;indice<20;indice++){
			System.out.print(k++ +" - "+arrayNombres[indice]);
		}
		System.out.println();
		System.out.println("FOR EACH");
		int j;
		j=1;
		for(String nombre:arrayNombres){
			System.out.print(j+++" - "+" "+nombre+" ");
		}
		
		/*for( ; indice < 20 ; indice++){
			indiceAzar = (int)Math.floor(Math.random()*21);
			arrayNombres[indice] = vecNombres[indiceAzar];
		}
		for(indice = 0;indice <20; indice++){
			System.out.print(" "+arrayNombres[indice]);
		}*/

	}//main

}//class