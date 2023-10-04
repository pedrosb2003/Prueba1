import java.util.Scanner;

public class Ejercicio1 {
    public static void main(String[] args) {
        Scanner entrada = new Scanner(System.in);
        System.out.println("Introduce el valor de a: ");
        int a = entrada.nextInt();
        System.out.println("Introduce el valor de b: ");
        int b = entrada.nextInt();
        System.out.println("Introduce el valor de c: ");
        int c = entrada.nextInt();

        System.out.println("Operacion 1: " + (a * b + c * ((3 - a) / (2 * b))));
        System.out.println("Operacion 2: " + ((2 + a * b) / 4) * c + 2);
    }
}
