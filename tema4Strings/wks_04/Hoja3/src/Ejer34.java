import java.util.*;
public class Ejer34 {

	public static void main(String[] args) {
		Random azar=new Random();
		int notasAzar;
		int notas[]=new int [10];
		 int suma,media;
		int indice,pos;
		indice=0;
		pos=1;
		suma=0;
		media=0;
		for( ; indice < 10; indice++){
			notas[indice]=notasAzar=azar.nextInt(10);
			suma=suma+notas[indice];
			
		}
		System.out.println(suma);
		media=suma/notas.length;
		for(int nota:notas){
			System.out.println("Nota: "+pos++ +" : "+nota);
		}
		System.out.println();
		System.out.println("Media : "+media);
		
		
	}//main

}//cklass