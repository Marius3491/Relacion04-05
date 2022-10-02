import java.util.Scanner;
public class Main {
    public static void main(String[] args) {
    Scanner sc = new Scanner(System.in);
        System.out.print("Introduzca valor de a: ");
        double a = sc.nextDouble();
        System.out.print("Introduzca valor de b: ");
        double b = sc.nextDouble();
        if(a == 0) {
            System.out.println("Sin solucion ");
        } else {
            System.out.println("x ="+ (-b/a));
        }
    }
}