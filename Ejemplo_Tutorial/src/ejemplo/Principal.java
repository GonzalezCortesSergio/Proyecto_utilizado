package ejemplo;

import java.util.Scanner;

/**
 * @author Sergio González Cortés
 */

public class Principal {

	public static void main (String args[]) {
		
		//Variables
		
		String aux, nombre;
		double precioUnit;
		int opc, seccion, tam = 15;
		
		//Instancia clase Scanner
		Scanner s = new Scanner (System.in);
		
		//Instancia array Producto
		Producto [] listaProductos = new Producto [tam];
		
		//Instancia clase Tienda
		
		Tienda t = new Tienda (listaProductos, 0);
		
		//Inicio programa
		
		System.out.println("Bienvenido a la tienda");
		
		do {
			System.out.println("""
					Opción 1:	Agregar producto
					Opción 2:	Ver todo los productos
					Opción 3:	Ver por sección
					Opción 0:	Salir
					""");
			aux = s.nextLine();
			opc = Integer.parseInt(aux);
			
			switch (opc) {
			
			//Agregar producto
			
				case 1:
					
					System.out.println("Nombre del producto");
					nombre = s.nextLine();
					System.out.println("Sección");
					System.out.println("""
							Opción 1:	Alimentos
							Opción 2:	Higiene personal
							Opción 3:	Limpieza
							""");
					aux = s.nextLine();
					seccion = Integer.parseInt(aux);
					System.out.println("Precio unitario");
					aux = s.nextLine();
					precioUnit = Double.parseDouble(aux);
					
					t.agregarProducto(new Producto (nombre, seccion, precioUnit));
					
					break;
					
			//Mostrar producto
				case 2:
					
					t.mostrarProductos();
					
					break;
					
			//Mostrar productos por sección
				case 3:
					
					System.out.println("Diga la sección que quiere ver");
					aux = s.nextLine();
					seccion = Integer.parseInt(aux);
					
					t.mostrarProductosPorSeccion(t.buscarPorSeccion(seccion));
					
					break;
					
				case 0:	
					
					System.out.println("Saliendo...");
					
					break;
					
				default:
					
					System.out.println("Opción equivocada");
					
					break;
			
				}
		
		
			}while (opc != 0);
		
		System.out.println("Gracias por utilizar el programa");

	}
}
