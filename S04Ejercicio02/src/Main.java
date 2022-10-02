import java.util.Scanner;
public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Introduzca hora para saludo correspondiente: ");
        int hora = sc.nextInt();
        if(hora >= 6 && hora <= 12){
            System.out.println("Buenos dias");
        } else if (hora >= 13 && hora <= 20){
            System.out.println("Buenas tardes");
        } else if (hora >= 21 && hora <= 24){
            System.out.println("Buenas noches");
        }else if (hora > 24 || hora < 0){
            System.out.println("Error, hora no correcta");
        }
    }
}