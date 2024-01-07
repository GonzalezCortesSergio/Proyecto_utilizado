package ejemplo;

/**
 * @author Sergio González Cortés
 */
public class Producto {

	//Atributos
	
	private String nombre;
	private int seccion;
	private double precioUnit;
	
	
	//Constructor
	
	public Producto(String nombre, int seccion, double precioUnit) {
		
		this.nombre = nombre;
		this.seccion = seccion;
		this.precioUnit = precioUnit;
	}


	//Getters and Setters
	
	public String getNombre() {
		return nombre;
	}


	public void setNombre(String nombre) {
		this.nombre = nombre;
	}


	public int getSeccion() {
		return seccion;
	}


	public void setSeccion(int seccion) {
		this.seccion = seccion;
	}


	public double getPrecioUnit() {
		return precioUnit;
	}


	public void setPrecioUnit(double precioUnit) {
		this.precioUnit = precioUnit;
	}


	//toString
	
	@Override
	public String toString() {
		return "Producto [nombre=" + nombre + ", seccion=" + seccion + ", precioUnit=" + precioUnit + "]";
	}
	
	

	
	
}
