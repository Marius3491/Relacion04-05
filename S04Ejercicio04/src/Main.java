import java.util.Scanner;
public class Main {
    public static void main(String[] args) {
       Scanner sc = new Scanner(System.in);
        System.out.print("Por favor, introduzca horas trabajadas");
        int horas = sc.nextInt();
        System.out.println("Horas trabajadas: "+horas);
        if(horas <= 40) {
            System.out.println("Correspondencia salarial: " + horas * 12 + " euros.");
        } else {
            System.out.println("Correspondencia salarial: " + horas * 16 + " euros");
        }
    }
}