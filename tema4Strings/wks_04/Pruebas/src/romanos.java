import java.util.*;
public class romanos {

	public static void main(String[] args) {
		@SuppressWarnings({ "unused", "resource" })
		Scanner teclado = new Scanner (System.in);
		String unidades[]={"","I","II","III","IV","V","VI","VII","VIII","IX"};
		String decenas[]={"","X","XX","XXX","XL","L","LX","LXX","LXXX","XC"};
		
		
		//int numero=(int)(Math.random()*10+1);
		@SuppressWarnings("unused")
		int num,posicion;
		@SuppressWarnings("unused")
		char numeros;
		num= (int)(Math.random()*20);
		
		String numero;
		
		numero =Integer.toString(num);
		//System.out.println(numero.length());
		if (numero.length() == 1){
			//numeros=numero.charAt(0);
			//posicion=(char)+numeros-48;
			System.out.println("numero   "+num);
			System.out.println(unidades[numero.charAt(0)-48]);
		}
		if (numero.length() == 2){
			 System.out.println(" numero"+num);
			 System.out.println(decenas[numero.charAt(0)-48]+unidades[numero.charAt(1)-48]);
		}
	}

}