package ejemplo;

/**
 * @author Sergio González Cortés
 */

public class Tienda {

	//Atributo
	
	private Producto [] listaProductos;
	private int numProductos;
	
	//Constructor
	
	public Tienda (Producto[] listaProductos, int numProductos) {
		
		this.listaProductos = listaProductos;
		this.numProductos = numProductos;
	}
	
	
	//Métodos
	
	
	public void agregarProducto (Producto p) {
		
		listaProductos[numProductos++] = p;
	}
	
	/**
	 * 
	 * @param seccion
	 * @return Lista de productos en esa sección
	 */
	public Producto[] buscarPorSeccion (int seccion) {
		
		Producto [] listaSeccion = new Producto [numProductos];
		for (int i = 0; i < numProductos; i++) {
			
			if (listaProductos[i].getSeccion() == seccion) {
				
				listaSeccion[i] = listaProductos[i];
			}
			i++;
		}
		
		return listaSeccion;
	}
	
	public void mostrarProductos() {
		
		for (int i = 0; i < numProductos; i++) {
			
			System.out.println(listaProductos[i]);
			System.out.println();
		}
	}
	
	/**
	 * 
	 * @param listaSeccion
	 */
	public void mostrarProductosPorSeccion (Producto[] listaSeccion) {
		
		for (int i = 0; i < listaSeccion.length; i++) {
			System.out.println(listaSeccion[i]);
			System.out.println();
		}
	}
	
}
