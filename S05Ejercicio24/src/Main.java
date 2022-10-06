import java.util.Scanner;
public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Introduzca altura piramide: ");
        int altura_i = sc.nextInt();

        int altura = 1;
        int i;
        int espacios = altura_i - 1;

        while (altura <= altura_i) {

            for (i = 1; i <= espacios; i++) {
                System.out.print(" ");
            }

            for (i = 1; i < altura ; i++) {
                System.out.print(i);
            }

            for (i = altura; i > 0; i--) {
                System.out.print(i);
            }
            System.out.println();

            altura++;
            espacios--;
        }
    }
}