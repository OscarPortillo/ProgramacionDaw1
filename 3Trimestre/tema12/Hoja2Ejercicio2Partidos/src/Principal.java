
import java.util.*;
public class Principal {

	public static void main(String[] args) {
		String nombrePartido[]={"Partido1","Partido2","Partido3","Partido4"};
		Integer votosPartido[]={10000,25000,30000,12000};

		String nombresOrdenado[] = new String[nombrePartido.length];
		TreeMap<String,Integer> mapPartidos=new TreeMap<String,Integer>();
		
		Integer repartoEscanios []=new Integer[5];
		String nombreMax;
		Integer numMax;

		int cociente;
		int mayor=0;
		for(int i=0;i<nombrePartido.length;i++){
			mapPartidos.put(nombrePartido[i], votosPartido[i]);			
		}
		TreeMap<String,ArrayList<Integer>> mapPartidoCocientes=new TreeMap<String,ArrayList<Integer>>();

		for(String nombrePart:mapPartidos.keySet()){//guardas en nombrePart la clave
			Integer numVotos=mapPartidos.get(nombrePart);//obtiene el valor de la clave asociada
			for(int divisor=1;divisor<=5;divisor++){//recorro los esca�os desde 1 hasta esca�os hay
				cociente=numVotos/divisor;//el numero de votos por partido dividido por el esca�o
				if (!mapPartidoCocientes.containsKey(nombrePart)){//si partmapPartidoCocientes no tiene esta clave					
					mapPartidoCocientes.put(nombrePart, new ArrayList<Integer>());//le agrego el nombre del partido como clave y un array list de enteros como valor
				}//if
				mapPartidoCocientes.get(nombrePart).add(cociente);//obtengo el nombre del partido y le a�ado como clave el cociente
				//System.out.println(nombrePart+" Esca�os: "+divisor+" divisiones: "+partmapPartidoCocientes.get(nombrePart).toString());
				//System.out.println();
			}//for interno
		}//for externo	

		for(String partFinal:mapPartidoCocientes.keySet()){
			ArrayList<Integer> listaCocientes=mapPartidoCocientes.get(partFinal);
			System.out.println(partFinal+" "+listaCocientes);
		}

		System.out.println("\nLos 5 esca�os mayores");
		
		for (int i=0;i<mapPartidoCocientes.size();i++){
			numMax=0;
			nombreMax="";
			for(String nombrePart:mapPartidoCocientes.keySet()){
				if(mapPartidoCocientes.get(nombrePart).get(0)>numMax){
					numMax=mapPartidoCocientes.get(nombrePart).get(0);
					nombreMax=nombrePart;
				}else{
					mapPartidoCocientes.get(nombrePart).remove(0);
				}//if 
				
			}
			nombresOrdenado[i]=nombreMax;
			
		}
	}//main

}//class