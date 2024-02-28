/**
 * 
 */
package ejemplo;

/**
 * @author PedroMulaMontesinos
 *
 */
import java.util.*;

public class EjemploHashMapOrdenadoPorEdad {
    public static void main(String[] args) {
        // Creamos un HashMap para almacenar edades y nombres
        HashMap<String, Integer> mapaEdades = new HashMap<>();

        // Agregamos elementos al HashMap (clave: nombre, valor: edad)
        mapaEdades.put("Juan", 25);
        mapaEdades.put("María", 30);
        mapaEdades.put("Carlos", 28);

        // Convertimos el HashMap a una lista de entradas para poder ordenarlas
        List<Map.Entry<String, Integer>> listaEntradas = new ArrayList<>(mapaEdades.entrySet());

        // Ordenamos la lista de entradas basándonos en las edades (valor)
        Collections.sort(listaEntradas, new Comparator<Map.Entry<String, Integer>>() {
            @Override
            public int compare(Map.Entry<String, Integer> entrada1, Map.Entry<String, Integer> entrada2) {
                // Comparamos las edades de las entradas
                return entrada1.getValue().compareTo(entrada2.getValue());
            }
        });

        // Iteramos sobre las entradas ordenadas y las imprimimos
        System.out.println("Personas ordenadas por edad:");
        for (Map.Entry<String, Integer> entrada : listaEntradas) {
            String nombre = entrada.getKey();
            int edad = entrada.getValue();
            System.out.println("Nombre: " + nombre + ", Edad: " + edad);
        }
    }
}
