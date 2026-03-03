import java.util.*;

public class Ejercicios {
    public static void main(String[] args) {
//        Ejercicio 1: Agregando elementos a una lista

/*Estás desarrollando un sistema para gestionar los nombres de los empleados de una empresa de tecnología.
El sistema debe permitir que nuevos empleados sean añadidos a una lista de nombres.
Tu tarea es crear una lista de cadenas (strings) y agregar los nombres de los empleados "Juan", "María", "Carlos" y “Ana” a esa lista.
Luego, imprime la lista para verificar si los nombres fueron añadidos correctamente.

Salida esperada:
Lista de empleados: [Juan, María, Carlos, Ana] */

        // Creamos la lista de empleados
        List<String> empleados = new ArrayList<>();

        // Agregamos los nombres de los empleados
        empleados.add("Juan");
        empleados.add("María");
        empleados.add("Carlos");
        empleados.add("Ana");
        // Mostramos la lista completa
        System.out.println("Lista de empleados: " + empleados);

// Ejercicio 2: Eliminando elementos

/* Estás trabajando en el sistema de gestión de una escuela, asegurándote de que la lista de estudiantes esté siempre correcta.
Durante una revisión en los registros, notaste que un nombre fue añadido incorrectamente: “Pedro”.
Para evitar confusiones en la emisión de certificados y registros, necesitas corregir esta información de inmediato.

Tu tarea es eliminar el nombre “Pedro” de la lista. Considera que la lista inicial contiene los siguientes nombres:
Juana, Lucas, Pedro y Antonio. Salida esperada:

 Lista inicial: [Juana, Lucas, Pedro, Antonio]

Lista después de la eliminación: [Juana, Lucas, Antonio]
 */
        List<String> estudiantes = new ArrayList<>();
        estudiantes.add("Juana");
        estudiantes.add("Lucas");
        estudiantes.add("Pedro");
        estudiantes.add("Antonio");
        System.out.println("Lista inicial: " + estudiantes);

        estudiantes.remove("Pedro");
        System.out.println("Lista después de la eliminación: " + estudiantes);

// Ejercicio 3: Accediendo a elementos

/* Formas parte del equipo de tecnología de una empresa que necesita garantizar que el registro de empleados esté siempre actualizado.
Hoy, recibiste una solicitud para mantener el control de acceso a la empresa. Para ello, tu código debe ser capaz de:

* Verificar cuántos empleados están registrados
* Descubrir el nombre del segundo empleado de la lista

Ejemplo de entrada:

empleados.add("Juan");
empleados.add("María");
empleados.add("Ana");
empleados.add("Pedro");
empleados.add("Antonio");

Salida esperada:
La segunda persona de la lista es: Maria
Total de empleados: 5 */

        // Creamos una lista de tipo String llamada empleadosTech.
        List<String> empleadosTech = new ArrayList<>();

        // Aquí vamos agregamos los nombres de los empleados.
        empleadosTech.add("Juan");
        empleadosTech.add("María");
        empleadosTech.add("Ana");
        empleadosTech.add("Pedro");
        empleadosTech.add("Antonio");

        // Con get(1) accedemos al elemento en la posición 1 de la lista.
        // Recuerda: los índices empiezan en 0, así que get(1) devuelve el segundo elemento ("María").
        System.out.println("La segunda persona de la lista es: "+ empleadosTech.get(1));

        // Con size() obtenemos el tamaño de la lista, es decir, cuántos elementos contiene en total.
        // Aquí devuelve 5.
        System.out.println("Total de empleados: " + empleadosTech.size());

// Ejercicio 4: Elementos únicos en una lista

/* Eres una persona desarrolladora de software responsable de optimizar el sistema de gestión de eventos de una empresa.
Recientemente, la organización reportó un problema: eventos duplicados están apareciendo en la lista de registros,
lo que puede generar inconsistencias en los informes y dificultar los procesos administrativos.

Tu tarea es mostrar la lista de eventos sin valores duplicados.

Ejemplo de entrada:

eventos.add("IA Conference");

eventos.add("AI Summit");

eventos.add("DevFest");

eventos.add("Cloud Expo");

eventos.add("IA Conference");

eventos.add("DevFest");

Salida esperada:

Lista de eventos: [DevFest, AI Summit, Cloud Expo, IA Conference] */

        // Importamos la clase HashSet para usar conjuntos
        Set<String> eventos = new HashSet<>();

        // Agregamos eventos al conjunto (los duplicados se eliminan automáticamente)
        eventos.add("IA Conference");
        eventos.add("AI Summit");
        eventos.add("DevFest");
        eventos.add("Cloud Expo");
        eventos.add("IA Conference"); // duplicado, no se guarda
        eventos.add("DevFest"); // duplicado, no se guarda

        // Mostramos la lista de eventos únicos
        System.out.println("Lista de eventos: "+ eventos);

/* Ejercicio 5: Creando un Map de clientes

Se te ha encargado desarrollar un sistema para gestionar los clientes de una librería. Para garantizar un control preciso de los registros,
cada cliente debe tener un ID único asociado a su nombre.
Para resolver esta tarea debes:

* Almacenar los clientes a través de una clave y un valor: (id, nombre)
* Registrar tres clientes
* Recuperar el nombre del cliente con ID igual a 2.

Salida esperada:
El nombre del cliente con ID 2 es: Marcos */

        Map<Integer, String> clientes = new HashMap<>();

        clientes.put(6, "Samuel");
        clientes.put(9, "Ricardo");
        clientes.put(3, "Emanuel");
        clientes.put(2, "Samario");

        System.out.println("El nombre del cliente con ID 2 es: "+ clientes.get(2));




    }
}
