import java.util.*;
public class JPascualRomanos {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner teclado = new Scanner (System.in);
		int numero;
		String unidades[] = {"", "I", "II", "III", "IV", "V", "VI", "VII", "VIII", "IX"};
		String decenas[] = {"", "X", "XX", "XXX", "XL", "L", "LX", "LXX", "LXXX", "XC"};
		String centenas [] = {"", "C", "CC","CCC","CD", "D","DC","DCC","DCCC","CM"};
		String millares [] = {"", "M", "MM", "MMM", "__\nIV"};
		String numeroString;
		
		do{
			System.out.println("Introduce un numero");
			numero = teclado.nextInt();
			
		}while (numero >= 5000 || numero < 1);//volvemos a pedir el numero si es mayor que 4999 o menor que 1
		numeroString = Integer.toString(numero);//pasamos el numero a string para poder ver la longitud y asi poder ver si trabajar con unidades, decenas, centenares o millares
		
		 
		if(numeroString.length()==1){//trabajamos con unidades
			System.out.println("el numero " + numeroString + " en numeros romanos es: \n" 
					+ unidades[numeroString.charAt(0)-48]);//en cada posicion le restamos 48 para que nos de la posicion correcta en vez de el codigo ascii del numero
			
		}//if
		if(numeroString.length()==2){//trabajamos con decenas y unidades
			System.out.println("el numero " + numeroString + " en numeros romanos es: \n" 
					+ decenas[numeroString.charAt(0)-48] + unidades[numeroString.charAt(1)-48]);
		}//if
		if(numeroString.length()==3){//trabajamos con centenas, decenas y unidades
			System.out.println("el numero " + numeroString 
					+ " en numeros romanos es: \n" + centenas[numeroString.charAt(0)-48] 
					+ decenas[numeroString.charAt(1)-48] + unidades[numeroString.charAt(2)-48]);
		}//if
		if(numeroString.length()==4){//trabajamos con millares,centenas,decenas y unidades
			System.out.println("el numero " + numeroString + " en numeros romanos es: \n" 
					+ millares[numeroString.charAt(0)-48] + centenas[numeroString.charAt(1)-48] 
							+ decenas[numeroString.charAt(2)-48] + unidades[numeroString.charAt(3)-48]);
		}//if

	}//main

}