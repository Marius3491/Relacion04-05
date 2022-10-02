import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Por favor, introduzca un número entero: ");
        int n = sc.nextInt();
        System.out.println("La última cifra del número introducido es el " + (n % 10));
    }
}