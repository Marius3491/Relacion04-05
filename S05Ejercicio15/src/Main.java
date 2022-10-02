import java.util.Scanner;
public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.print("Introduzca la base: ");
        int base = sc.nextInt();

        System.out.print("Introduzca el exponente máximo: ");
        int exp_f = sc.nextInt();

        int potencia;
        int exponente;

        for (int i = 1; i <= exp_f; i++) {

            potencia = 1;
            exponente = i;

            for (int j = 0; j < exponente; j++) {
                potencia *= base;
            }

            System.out.println(base + "^" + i + " = " + potencia);
        }
    }
}