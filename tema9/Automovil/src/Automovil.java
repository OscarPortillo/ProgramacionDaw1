
public class Automovil {
	private String marca;
	private String modelo;
	private int cilindrada;
	private int precio;
	public Automovil(String marca, String modelo, int cilindrada, int precio) {
		this.marca = marca;
		this.modelo = modelo;
		this.cilindrada = cilindrada;
		this.precio = precio;
	}
	public String getMarca() {
		return marca;
	}
	public void setMarca(String marca) {
		this.marca = marca;
	}
	public String getModelo() {
		return modelo;
	}
	public void setModelo(String modelo) {
		this.modelo = modelo;
	}
	public int getCilindrada() {
		return cilindrada;
	}
	public void setCilindrada(int cilindrada) {
		this.cilindrada = cilindrada;
	}
	public int getPrecio() {
		return precio;
	}
	public void setPrecio(int precio) {
		this.precio = precio;
	}
	public void verCoche(){
		System.out.println("------------------------------------");
		Leer.mostrarEnPantalla("Marca: "+marca);
		Leer.mostrarEnPantalla("Modelo: "+modelo);
		Leer.mostrarEnPantalla("Cilindrada: "+cilindrada);
		Leer.mostrarEnPantalla("Precio: "+precio);
		System.out.println();
	}
	
}