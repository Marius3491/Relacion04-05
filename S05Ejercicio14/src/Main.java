import java.util.Scanner;
public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.print("Introduce base: ");
        double base = sc.nextInt();
        System.out.println("Introduce exponente: ");
        double exponente = sc.nextInt();
        double potencia = 1;

        if (exponente == 0) {
            potencia = 1;
        }

        if (exponente > 0) {
            for (int i = 0; i < exponente; i++) {
                potencia *= base;
            }
        }

        if (exponente < 0) {
            for (int i = 0; i < -exponente; i++) {
                potencia *= base;
            }

            potencia = 1/potencia;
        }

        System.out.println(base + "^" + exponente + " = " + potencia);
    }
}