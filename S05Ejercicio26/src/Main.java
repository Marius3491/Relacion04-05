import java.util.Scanner;
public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Introduzca un número entero: ");
        long num_int = sc.nextInt();

        System.out.print("Introduzca un dígito: ");
        int digito =  sc.nextInt();

        System.out.print("El digito " + digito+" aparece dentro de " + num_int);
        System.out.print(" en las posiciones: ");

        long numero = num_int;


        numero = numero * 10 + 1;

        long volteado = 0;
        int longitud = 0;
        int posicion = 1;

        if (numero == 0) {
            longitud = 1;
        }

        while (numero > 0) {
            volteado = (volteado * 10) + (numero % 10);
            numero /= 10;
            longitud++;
        }

        while (volteado != 1) {
            if ((volteado % 10) == digito) {
                System.out.print(posicion + " ");
            }
            volteado /= 10;
            posicion++;
        }

        System.out.println();
    }
}