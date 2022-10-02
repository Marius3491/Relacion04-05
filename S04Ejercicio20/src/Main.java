import java.util.Scanner;
public class Main {
    public static void main(String[] args) {
        boolean capicua = false;
        Scanner sc = new Scanner(System.in);
        System.out.print("Por favor introduzca numero para saber si es capicua [5 cifras como maximo] ");
        int n = sc.nextInt();
        if (n < 10) {
            capicua = true;
        }

        // 2
        if ((n >= 10) && (n < 100)) {
            if ((n / 10) == (n % 10)) {
                capicua = true;
            }
        }

        // 3
        if ((n >= 100) && (n < 1000)) {
            if ((n / 100) == (n % 10)) {
                capicua = true;
            }
        }

        // 4
        if ((n >= 1000) && (n < 10000)) {
            if (((n / 1000) == (n % 10)) && ((( n / 100 ) % 10)== (( n / 10) % 10))) {
                capicua = true;
            }
        }

        // 5
        if (n >= 10000) {
            if (((n / 10000) == (n % 10) ) && ((((n / 1000) % 10)) == ((n / 10) % 10))) {
                capicua = true;
            }
        }

        if (capicua) {
            System.out.println("El número "+n+" introducido es capicúa. ");
        } else {
            System.out.println("El número "+n+" introducido no es capicúa. ");
        }
    }
}