import java.util.Scanner;
public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Introduce un numero: ");
        int num = sc.nextInt();
      for(int i = 0;i<5;i++){
          System.out.printf("Numero :"+num+" | Cuadrado: "+(num*num)+" | Cubo: "+(num*num*num)+" |\n");
          num++;
      }
    }
}