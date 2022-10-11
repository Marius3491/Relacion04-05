import java.util.Scanner;

public class Main {
    public Main() {
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int negativo = 0;
        int positivo = 0;
        System.out.println("Introduce 10 numero enteros: ");

        for(int i = 0; i < 10; ++i) {
            int num = sc.nextInt();
            if (num < 0) {
                ++negativo;
            } else {
                ++positivo;
            }
        }

        System.out.println("Positivos: " + positivo + " , Negativos: " + negativo);
    }
}
