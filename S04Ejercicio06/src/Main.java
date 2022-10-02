import java.util.Scanner;
public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Introduzca la altura de la caida del objeto: ");
        double h = sc.nextDouble();
        double g = 9.81;
        double s = Math.sqrt(2*h/g);
        System.out.println("El objeto tarda "+s+" segundos en caer");
    }
}