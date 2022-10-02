import java.util.Scanner;
public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.println("Por favor, introduzca los valores.");

        System.out.print("a = ");
        double a = sc.nextDouble();

        System.out.print("b = ");
        double b = sc.nextDouble();

        System.out.print("c = ");
        double c = sc.nextDouble();

        double discriminante = b * b - (4 * a * c);

            if (discriminante < 0) {
                System.out.println("La ecuación no tiene soluciones reales");
            } else {
                System.out.println("x1 = " + (-b + Math.sqrt(discriminante)) / (2 * a));
                System.out.println("x2 = " + (-b - Math.sqrt(discriminante)) / (2 * a));
            }
        }
    }