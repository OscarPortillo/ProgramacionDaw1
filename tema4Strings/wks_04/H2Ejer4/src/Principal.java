import java.util.*;
public class Principal {

	public static void main(String[] args) {
		@SuppressWarnings("resource")
		Scanner teclado=new Scanner(System.in);
		
		String nom1,nom2,ape1,ape2;
		@SuppressWarnings("unused")
		String n1,a1,n2,a2;
		System.out.println("Introduce un nombre");
		nom1=teclado.nextLine();
		System.out.println("Introduce un apellido");
		ape1=teclado.nextLine();
		System.out.println("Introduce un nombre");
		nom2=teclado.nextLine();
		System.out.println("Introduce un apellido");
		ape2=teclado.nextLine();
		
		System.out.println();
		System.out.println(nom1+" "+ape1);
		System.out.println(nom2+" "+ape2);
		
		n1=nom1;		 
		n2=nom2;
		
		 System.out.println();
		System.out.println(n2+" "+ape1);
		System.out.println(n1+" "+ape2);
	}

}
