import java.util.Scanner;
public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Introduce numero para voltearlo: ");
        int num_int = sc.nextInt();
        int numero = num_int;
        int num_inv = 0;
        while (numero > 0){
            num_inv = (num_inv * 10) + (numero % 10);
            numero /= 10;
        }
        System.out.println("El numero "+num_int+" es el numero invertido: "+num_inv);
    }
}