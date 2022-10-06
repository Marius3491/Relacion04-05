import java.util.Scanner;
public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int sumatorio = 0;
        int valor;
        int contador=0;
        do{
            System.out.print("Introduce valores: ");
            valor = sc.nextInt();
            sumatorio = sumatorio + valor;
            contador=contador+1;
        }while(sumatorio <= 10000);
        sumatorio=sumatorio-valor;
        contador=contador-1;
            System.out.println("Total acumulado: "+sumatorio);
            System.out.println("Contador: "+contador);
            System.out.println("Media: "+sumatorio/ (double)contador);
        }
    }
}