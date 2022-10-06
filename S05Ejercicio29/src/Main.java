import java.util.Scanner;
public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Introduzca un número entero positivo (relativamente grande): ");
        int grande = sc.nextInt();

        System.out.print("Introduzca otro número (relativamente pequeño): ");
        int pequeno = sc.nextInt();

        System.out.print("Los números enteros positivos menores que " + grande );
        System.out.println(" que no son divisibles entre " + pequeno + " son los siguientes:");

        for (int i = 1; i < grande; i++) {
            if ((i % pequeno) != 0) {
                System.out.print(i + " ");
            }
        }
    }
}