import java.util.Stack;

public class PilaEjemplo {
    public static void main(String[] args) {

        Stack<String> pila = new Stack<>();

        // Agregar elementos
        pila.push("Juan");
        pila.push("María");
        pila.push("Pedro");

        System.out.println("Pila: " + pila);

        // Eliminar el último elemento
        System.out.println("Elemento eliminado: " + pila.pop());

        System.out.println("Pila después de eliminar: " + pila);

        // Mostrar el elemento de arriba
        System.out.println("Elemento superior: " + pila.peek());
    }
}
