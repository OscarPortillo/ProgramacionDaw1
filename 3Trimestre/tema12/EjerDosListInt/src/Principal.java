import java.util.*;
public class Principal {

	public static void main(String[] args) {
		Random azar=new Random();
		int num,num2;
		num=azar.nextInt(15)+1;
		ArrayList<Integer> arrayL=new ArrayList<Integer>();
		LinkedList<Integer> lList=new LinkedList<Integer>();
		
		System.out.println("Se van a generar "+num+" datos");
		System.out.println("Insertando");
		for(int i=0;i<num;i++){
			num2=azar.nextInt(15)+1;
			System.out.print(num2+" * ");
			arrayL.add(num2);
			lList.add(num2);
		}
		System.out.println("\n\nValores de ArrayList");
		for(Integer a:arrayL){
			System.out.print(a+" ");
		}
		System.out.println("\n\nValores de LinkedList");
		for(Integer lL:lList){
			System.out.print(lL+" ");
		}
		System.out.println("\n\nValores de ArrayList: "+arrayL.toString());
		System.out.println("Valores de LinkedList: "+lList.toString());
		}//main
}