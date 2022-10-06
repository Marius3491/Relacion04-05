import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Introduzca altura piramide: ");
        int altura = sc.nextInt();

        System.out.print("Introduzca caracter: ");
        String relleno = sc.next();

        int planta = 1;
        int longitud = 1;
        int espacios = altura-1;

        while (planta <= altura) {

            for (int i = 1; i <= espacios; i++) {
                System.out.print(" ");
            }

            for (int i = 1; i <= longitud; i++) {
                System.out.print(relleno);
            }

            System.out.println();

            planta++;
            espacios--;
            longitud += 2;
        }
    }
}