/**
 * 
 */
package ejemplo;

/**
 * @author PedroMulaMontesinos
 *
 */
import java.util.TreeMap;

public class EjemploTreeMap {
    public static void main(String[] args) {
        // Crear un TreeMap para almacenar nombres y edades
        TreeMap<String, Integer> mapaEdades = new TreeMap<>();

        // Agregar elementos al TreeMap
        mapaEdades.put("Juan", 25);
        mapaEdades.put("María", 30);
        mapaEdades.put("Carlos", 28);

        // Acceder a un valor mediante su clave
        int edadJuan = mapaEdades.get("Juan");
        System.out.println("La edad de Juan es: " + edadJuan);

        // Iterar sobre los pares clave-valor del TreeMap
        System.out.println("\nIterando sobre el TreeMap:");
        for (String nombre : mapaEdades.keySet()) {
            int edad = mapaEdades.get(nombre);
            System.out.println("Nombre: " + nombre + ", Edad: " + edad);
        }

        // Verificar si una clave existe en el TreeMap
        String nombreBuscado = "Carlos";
        if (mapaEdades.containsKey(nombreBuscado)) {
            System.out.println("\n" + nombreBuscado + " está presente en el TreeMap");
        } else {
            System.out.println("\n" + nombreBuscado + " no está presente en el TreeMap");
        }
    }
}
