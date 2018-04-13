import java.util.ArrayList;

public class Alumnos {
	private ArrayList<Alumnos> alu=new ArrayList<Alumnos>();
	private String nombre;
	private String apellido;
	private Integer nota1;
	private Integer nota2;
	private Integer nota3;
	public Alumnos(String nombre, String apellido, Integer nota1, Integer nota2, Integer nota3) {
		this.nombre = nombre;
		this.apellido = apellido;
		this.nota1 = nota1;
		this.nota2 = nota2;
		this.nota3 = nota3;		
	}
	public void crearAlu(Alumnos alumno) {
		alu.add(alumno);
	}
	public String verAlu() {
		return "Alumnos [nombre=" + nombre + ", apellido=" + apellido + ", nota1=" + nota1 + ", nota2=" + nota2
				+ ", nota3=" + nota3 + "]";
	}
	
}//class