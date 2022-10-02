import java.util.Scanner;
public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int num;
        do {
            System.out.print("Introduzca un numero entero positivo: ");
             num = sc.nextInt();

            if(num < 0) {
                System.out.println("Debe introducir un numero positivo.");
            }
        } while (num < 0);

        int suma = 0;

        for(int i = num; i < num +100; i++) {
            suma += i;
        }
        System.out.println("La suma de los 100 números siguientes a "+num+ " es " +suma+ ".");
    }
}