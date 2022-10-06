import java.util.Scanner;
public class Main {
    public static void main(String[] args) {
        int contador = 0;
        int sumatoria = 0;
        int num;
        Scanner sc = new Scanner(System.in);
        System.out.print("Introduce un numero: ");
        num = sc.nextInt();
        for(int i = 1; i<=num; i++){
            if ((i % 3) == 0) {
                System.out.println("Multiplo de 3: " + i);
                sumatoria = i + sumatoria;
                contador++;
            }

        }
        System.out.println("Contador: " + contador);
        System.out.println("Suma: " + sumatoria);
    }
}