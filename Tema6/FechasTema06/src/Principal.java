import java.util.*;
public class Principal {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Calendar fecha=new GregorianCalendar();
		 
		Integer dia;
		Integer mes;
		Integer a�o;
		dia=fecha.get(Calendar.DAY_OF_MONTH);
		mes=fecha.get(Calendar.MONTH)+1;
		if(mes>12){
			mes=12;
		}
		a�o=fecha.get(Calendar.YEAR);
		System.out.println(dia+" "+mes+" "+a�o);
		Fecha hoy=new Fecha(dia,mes,a�o);
		
		System.out.println(hoy.esBisiesto()+" .... bisiesto");
		System.out.println(hoy.esCorrecta()+" .... fecha ");
		 hoy.getCadenaMes(); 
		 hoy.getDiaMes();
		 
		 hoy.getCadenaFecha1();
		 hoy.getCadenaFecha2();
	}//main

}//class
