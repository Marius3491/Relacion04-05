import java.util.Scanner;
public class Main {
    public static void main(String[] args) {
        int extra;
        Scanner sc = new Scanner(System.in);
        System.out.print("Introduce primer numero para ordenar de menor a mayor: ");
        int num1 = sc.nextInt();
        System.out.print("Introduce segundo numero: ");
        int num2 = sc.nextInt();
        System.out.print("Introduce tercer numero: ");
        int num3 = sc.nextInt();
        if(num1 > num2){
          extra = num1;
          num1 = num2;
          num2 = extra;
        }
        if(num2 > num3){
            extra = num2;
            num2 = num3;
            num3 = extra;
        }
        if(num1 > num2){
            extra = num1;
            num1 = num2;
            num2 = extra;
        }
        System.out.printf("Los numeros ordenados de menor a mayor son: "+num1+" , "+num2+" , "+num3);
    }
}