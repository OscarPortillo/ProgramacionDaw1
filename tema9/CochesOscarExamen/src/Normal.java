
public class Normal extends Coche{
	private String aparcamiento;
	public Normal(String matricula, String marca, String modelo, 
			Fecha fechaFabricacion, boolean disponible,String aparcamiento) {
		super(matricula, marca, modelo, fechaFabricacion, disponible);
		this.aparcamiento=aparcamiento;
	}
	public  String verCoche(){
		return "Normal "+ super.verCoche()+" Aparcamiento = "+aparcamiento;
	}
}