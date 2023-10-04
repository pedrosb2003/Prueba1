import java.util.Scanner;

public class Ejercicio1 {
    public static void main(String[] args) {
        Scanner entrada = new Scanner(System.in);
        System.out.println("Introduce el valor de a: ");
        float a = entrada.nextFloat();
        System.out.println("Introduce el valor de b: ");
        float b = entrada.nextFloat();
        System.out.println("Introduce el valor de c: ");
        float c = entrada.nextFloat();

        System.out.println("Operación 1: " + (a * b + c * ((3 - a) / (2 * b))));
        System.out.println("Operación 2: " + ((2 + a * b) / 4) * Math.pow(c + 2));
        System.out.println("Operación 3: " + (-b + (((b * 2) - 4 * a * c));
    }
}
