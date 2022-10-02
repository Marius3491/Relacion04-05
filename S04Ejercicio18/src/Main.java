import java.util.Scanner;
public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n, primera = 0;
        System.out.print("Por favor, introduzca un número entero positivo (5 cifras como máximo): ");
        n = sc.nextInt();
        if ( n < 10 ) {
            primera = n;
        }

        if (( n >= 10 ) && ( n < 100 )) {
            primera = n / 10;
        }

        if (( n >= 100 ) && ( n < 1000 )) {
            primera = n / 100;
        }

        if (( n >= 1000 ) && ( n < 10000 )) {
            primera = n / 1000;
        }

        if ( n >= 10000 ) {
            primera = n / 10000;
        }

        System.out.println("La primera cifra del número introducido es el " + primera + ".");
    }
}