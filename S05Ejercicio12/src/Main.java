import java.util.Scanner;
public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Introduce cuantos numeros quiere se muestre en la sucecsion de fibonacci: ");
        int num = sc.nextInt();
        int cero = 0;
        int uno = 1;
        int aux;
        if (num == 1) {
            System.out.print(cero + "\n");
        } else if (num == 2) {
            System.out.print(cero + "\n");
            System.out.println(uno);
        } else {
            System.out.print(cero + "\n");
            System.out.println(uno);
            for (int i = 0; i < num - 2; i++) {
                aux = cero;
                cero = uno;
                uno = aux + uno;
                System.out.println(uno);
            }

        }
    }
}