import java.util.*;
public class PortilloHerreraEx1 {

	public static void main(String[] args) {

		String solucion[]={"B","D","A","C","B","C","A","C","B","D"};
		String respuesta []={"A","B","C"};
		String solucionExamen [][]=new String [5][10];

		int k,j,contAlu,contAlu2;
		contAlu=1;
		contAlu2=1;
		char espacio;
		int fallos,aciertos ;
		//double calificacion;
		float calificacion;
		k=0;
		j=0;
		
		for(k=0;k<5;k++){//recorro 5 filas
			for(j=0;j<10;j++){//recorro 10 columnas
				solucionExamen[k][j]=respuesta[(int)(Math.random()*3)];//inserto las respuestas aleatorias
			}	//for interno

		}//for externo
		System.out.print("Soluci�n: ");
		for(int indice=0;indice<solucion.length;indice++){
			System.out.print(solucion[indice]+" ");
		}
		System.out.println();
		System.out.println();
		System.out.printf("%45s","Aciertos ");
		System.out.printf("%10s","Fallos ");
		System.out.printf("%20s","Calificaciones ");
		System.out.println();
		
		for(k=0;k<5;k++){		//recorro 5 filas	
			System.out.print("Alumno "+contAlu+++" : "); 
			aciertos=0;
			fallos=0;
			calificacion=0;
			for(j=0;j<10;j++){//recorro 10 columnas				 
				System.out.print(solucionExamen[k][j]+" ");//muestro las respuestas aleatoriamente
				if(solucionExamen[k][j].equals(solucion[j])){
					aciertos++;
				}else{
					fallos++;
				}
				calificacion=(float) (aciertos-fallos*0.3);
				//System.out.print(aciertos+" "+fallos+" "+calificacion);

			}//for
			System.out.printf("%8d",aciertos );
			System.out.printf("%14d",fallos );
			if(calificacion < 0){

				System.out.print("             "+calificacion+""+0 );//no supe usar el printf con double
				
			}else{
				espacio=' ';
				System.out.print("             "+espacio+calificacion+""+0 );//no supe usar el printf con double
			}
			
			System.out.println();//salto de linea ala siguiente fila
		}//for externo

	}//main

}//class