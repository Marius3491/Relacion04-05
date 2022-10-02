import java.util.Scanner;
public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Introduce numero para saber si un numero es par y/o divisible entre 5");
        int num = sc.nextInt();
        if ((num % 5) == 0) {
            System.out.println("Es divisible entre 5");
        } else {
            System.out.println("No es divisible entre 5");
        }
        if ((num % 2) == 0) {
            System.out.println("Es un numero par");
        } else {
            System.out.println("No es un numero par");
        }
    }
}