import java.util.Scanner;
public class Main {
    public static void main(String[] args) {
   int num_int;
   Scanner sc = new Scanner(System.in);
    
    do {
      System.out.print("Por favor, introduzca un número entero: ");
      num_int = sc.nextInt();
      
      if (num_int < 0) {
        System.out.println("El número introducido no es correcto.");
      }
    } while (num_int < 0);

    int factorial = num_int;
    
    if (num_int == 0) {
      System.out.println("0! = 1");
    } else {
      for (int i = 1; i < num_int; i++) {
        factorial *= i;
      }

      System.out.println(num_int + "! = " + factorial);
    }
    }
}
