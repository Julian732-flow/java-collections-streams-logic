import java.util.*;

//TIP To <b>Run</b> code, press <shortcut actionId="Run"/> or
// click the <icon src="AllIcons.Actions.Execute"/> icon in the gutter.
public class Colecciones {
    public static void main(String[] args) {
        // List: Ordenación, duplicidad permitida
        // Implementaciones: ArrayList y LinkedList
        // Operaciones comunes: add,remove, contains, get, size

        List<String> empleados = new ArrayList<>();
        // Imagina que el ArrayList es como una lista de socios inscritos en el gimnasio.
        // Aquí vamos agregando los nombres de quienes se registran.

        empleados.add("Pedro"); // Pedro se inscribe en el gym.
        empleados.add("Juan"); // Juan también se inscribe.
        empleados.add("Maria"); // Maria se suma a la lista de socios.

        // Mostramos el primer inscrito en la lista.
        // En el gym sería como preguntar: "¿Quién fue el primer socio registrado?"
        System.out.println("Lista inicial: " + empleados.get(0));

        // Ahora Pedro decide darse de baja del gimnasio.
        // Con remove lo eliminamos de la lista de socios.
        empleados.remove("Pedro");

        // Mostramos la lista después de la eliminación.
        // En el gym sería como revisar la lista actualizada de socios activos.
        System.out.println("Lista después de la eliminación: "+ empleados);
//--------------------------------------------------------------------------------------------
        // Set: No se preocupa por el orden, no permite duplicidad
        // * Implementaciones: HashSet no garantiza el orden.
        // LinkedHashSet: mantiene los elementos en el orden en que los agregaste.
        // TreeSet: mantiene los elementos ordenados de forma natural
        // (alfabética para Strings, numérica para números).

        Set<String> productos = new HashSet<>();

        // Imaginamos que el HashSet es como un depósito del gimnasio donde guardamos objetos.
        // La regla es que no puede haber duplicados: si alguien intenta guardar lo mismo
        // dos veces, el sistema lo ignora y solo queda una copia.

        productos.add("Agua"); // Guardamos una botella de agua en el depósito.
        productos.add("gaseosa"); // Guardamos una gaseosa.
        productos.add("bolígrafo"); // Guardamos un bolígrafo.
        productos.add("televisión"); // Guardamos una televisión.
        productos.add("Agua"); // Intentamos guardar otra botella de agua,
        // pero como ya había una, el HashSet no la agrega de nuevo.

        // Mostramos el contenido del depósito.
        // Veremos que "Agua" aparece solo una vez, aunque intentamos guardarla dos veces.
        System.out.println(productos);

//------------------------------------------------------------------------------------------------

        // Map: es un tipo de coleccion que se basa en Clave-valor, sin valores duplicados
        // Implementaciones: HashMap, LinkedHashMap, TreeMap
        // Operaciones comunes: put, get, remove, containsKey, keySet

        Map<Integer, String> mapaEmpleados = new HashMap<>();
        // Imagina que el HashMap es como un gimnasio con casilleros numerados.
        // Cada casillero (la clave Integer) guarda la pertenencia de un socio (el valor String).

        mapaEmpleados.put(1, "Maria"); // Casillero 1 → guardamos la mochila de Maria.
        mapaEmpleados.put(2, "Juan"); // Casillero 2 → guardamos la mochila de Juan.
        mapaEmpleados.put(3, "Maria"); // Casillero 3 → otra mochila de Maria (puede tener más de un casillero).

        // Si alguien nuevo usa el mismo casillero, reemplaza lo que había antes.
        // Aquí Flavia usa el casillero 1, entonces la mochila de Maria se saca y queda la de Flavia.
        mapaEmpleados.put(1, "Flavia");

        System.out.println("Mapa inicial: " + mapaEmpleados);// Vemos todos los casilleros ocupados en el gimnasio.

        // Aquí buscamos por número de casillero, no por posición.
        // Como el casillero 0 nunca existió, el resultado es null (casillero vacío).
        System.out.println(empleados.get(0));

        mapaEmpleados.put(7, "Alberto"); // Agregamos un nuevo socio: Alberto ocupa el casillero 7.
        System.out.println(empleados); // Mostramos cómo quedó la distribución de casilleros.



        }
    }
