import java.util.Scanner;
public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Por favor, introduzca un número: ");
        long num_int_uno = sc.nextLong();

        System.out.print("Introduzca otro número: ");
        long num_int_dos = sc.nextLong();

        long numero = num_int_uno;
        long voltea_uno = 0;
        int longitud = 0;

        if (numero == 0) {
            longitud = 1;
        }

        while (numero > 0) {
            voltea_uno = (voltea_uno * 10) + (numero % 10);
            numero /= 10;
            longitud++;
        }

        numero = num_int_dos;
        long voltea_dos = 0;

        while (numero > 0) {
            voltea_dos = (voltea_dos * 10) + (numero % 10);
            numero /= 10;
        }

        long res_par = 0;
        long res_impar = 0;
        int digito;

        for (int i = 0; i < longitud; i++) {

            digito = (int)(voltea_uno % 10);

            if ((digito % 2) == 0) {
                res_par = res_par * 10 + digito;
            } else {
                res_impar = res_impar * 10 + digito;
            }

            digito = (int)(voltea_dos % 10);

            if ((digito % 2) == 0) {
                res_par = res_par * 10 + digito;
            } else {
                res_impar = res_impar * 10 + digito;
            }

            voltea_uno /= 10;
            voltea_dos /= 10;
        }

        System.out.println("El número formado por los dígitos pares es: " + res_par);
        System.out.println("El número formado por los dígitos impares es: " + res_impar);
    }
}