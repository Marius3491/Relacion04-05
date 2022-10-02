import java.util.Scanner;
public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Introduce numero para saber cuantas cifras tiene: ");
        int num_in= sc.nextInt();

        int num= num_in;
        int num_dig = 1;
    while (num > 10){
        num_dig++;
        num = num / 10;
    }
        System.out.printf("Numero: "+num_in+" tiene "+num_dig+" digitos.");
    }
}