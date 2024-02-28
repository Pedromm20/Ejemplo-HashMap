/**
 * 
 */
package ejemplo;

/**
 * @author PedroMulaMontesinos
 *
 */
import java.util.Map;
import java.util.TreeMap;

public class EjemploTreeMapOrdenadoPorEdad {
	public static void main(String[] args) {
		// Creamos un TreeMap para almacenar edades y nombres
		TreeMap<Integer, String> mapaEdades = new TreeMap<>();

		// Agregamos elementos al TreeMap (clave: edad, valor: nombre)
		mapaEdades.put(25, "Juan");
		mapaEdades.put(30, "María");
		mapaEdades.put(28, "Carlos");

		// Iteramos sobre los elementos del TreeMap (ya están ordenados por edad)
		System.out.println("Personas ordenadas por edad:");
		for (Map.Entry<Integer, String> entry : mapaEdades.entrySet()) {
			int edad = entry.getKey();
			String nombre = entry.getValue();
			System.out.println("Nombre: " + nombre + ", Edad: " + edad);
		}
	}
}
