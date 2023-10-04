import java.util.Scanner;
public class Ejercicio2 {
    public static void main(String[] args) {
        Scanner entrada = new Scanner(System.in);
        System.out.println("Introduce la unidad a convertir (F / K): ");
        String unidad = entrada.nextLine();
        System.out.println("Introduce una temperatura en Grados Centígrados: ");
        int temp = entrada.nextInt();
        System.out.println(unidad == "F" ? (9 / 5) * temp + 32 : temp + 273.15);
    }
}
