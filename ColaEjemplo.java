import java.util.LinkedList;
import java.util.Queue;

public class ColaEjemplo {
    public static void main(String[] args) {

        Queue<String> cola = new LinkedList<>();

        // Agregar elementos
        cola.add("Juan");
        cola.add("María");
        cola.add("Pedro");

        System.out.println("Cola: " + cola);

        // Eliminar el primer elemento
        System.out.println("Elemento eliminado: " + cola.poll());

        System.out.println("Cola después de eliminar: " + cola);

        // Mostrar el primer elemento
        System.out.println("Primer elemento: " + cola.peek());
    }
}

