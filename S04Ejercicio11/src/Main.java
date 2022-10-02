import java.util.Scanner;
public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Hora: ");
        int hora = sc.nextInt();
        System.out.printf("Minutos: ");
        int minuto = sc.nextInt();

        int transcurrido = (hora *3600 ) + (minuto*60);
        int medianoche = (24 * 3600) - transcurrido;

        System.out.println("Desde las: "+hora+"y "+minuto+"faltan "+medianoche+" para medianoche");
    }
}