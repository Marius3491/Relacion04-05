import java.util.Scanner;
public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        double numero = 0;
        double num_in = 0;
        double suma = 0;
        System.out.print("Introduce numeros para hacer media de los introducidos: ");
        while (num_in >= 0){
            num_in = sc.nextDouble();
            numero++;
            suma += num_in;
        }
        System.out.println("Media es: "+(suma-num_in)/(numero - 1));
    }
}