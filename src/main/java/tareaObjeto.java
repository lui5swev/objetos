import java.util.Scanner;

public class tareaObjeto {
    public static void main(String[] args) {
        Scanner teclado = new Scanner(System.in);
        System.out.println("crear gato");
        System.out.println("ingrese nombre del gato");
        String nombre = teclado.next();
        System.out.println("ingrese color del gato");
        String color = teclado.next();
        Gato gato1 = new Gato(nombre, color);

        gato1.cualidades();
        gato1.maullar();
    }
}
