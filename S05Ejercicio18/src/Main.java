import java.util.Scanner;
public class Main {
    public static void main(String[] args) {
        int num1;
        int num2;
        Scanner sc = new Scanner(System.in);
        do {
            System.out.print("Introduzca un numero entero: ");
            num1 = sc.nextInt();
            System.out.print("Introduzca otro numero entero distinto al anterior: ");
            num2 = sc.nextInt();

            if(num1 == num2) {
                System.out.print("Los numeros introducidos no son válidos, deben ser distintos");
            }
        } while (num1 == num2);


        if (num1 > num2) {
            int aux = num1;
            num1 = num2;
            num1 = aux;
        }

        for(int i = num1; i <= num2; i += 7) {
            System.out.print(i + " ");
        }

        System.out.println();
    }
}