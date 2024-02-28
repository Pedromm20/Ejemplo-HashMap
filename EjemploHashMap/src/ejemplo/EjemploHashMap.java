
 package ejemplo;
 
import java.util.HashMap;

 class EjemploHashMap {
    public static void main(String[] args) {
        // Crear un HashMap para almacenar nombres y edades
        HashMap<String, Integer> mapaEdades = new HashMap<>();

        // Agregar elementos al HashMap
        mapaEdades.put("Juan", 25);
        mapaEdades.put("María", 30);
        mapaEdades.put("Carlos", 28);

        // Acceder a un valor mediante su clave
        int edadMaria = mapaEdades.get("María");
        System.out.println("La edad de María es: " + edadMaria);

        // Iterar sobre los pares clave-valor del HashMap
        System.out.println("\nIterando sobre el HashMap:");
        for (String nombre : mapaEdades.keySet()) {
            int edad = mapaEdades.get(nombre);
            System.out.println("Nombre: " + nombre + ", Edad: " + edad);
        }

        // Verificar si una clave existe en el HashMap
        String nombreBuscado = "Carlos";
        if (mapaEdades.containsKey(nombreBuscado)) {
            System.out.println("\n" + nombreBuscado + " está presente en el HashMap");
        } else {
            System.out.println("\n" + nombreBuscado + " no está presente en el HashMap");
        }
    }
}
