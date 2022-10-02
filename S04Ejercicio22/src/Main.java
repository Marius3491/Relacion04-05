import java.util.Scanner;
public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Introduce dia de la semana: \n");
        String dia = sc.next();
        int dianum=0;
        switch (dia){

            case "lunes":
                dianum=0;
            break;
            case "martes":
                dianum=1;
                break;
            case "miercoles":
                dianum=2;
                break;
            case "jueves":
                dianum=3;
                break;
            case "viernes":
                dianum=4;
                break;
            default:
                System.out.println("Error! Dia introducido no existe!");
        }
        System.out.print("Hora: ");
        int horas = sc.nextInt();

        System.out.print("Minuto: ");
        int minutos = sc.nextInt();

        int mintotal = (4 * 24 * 60) + (15*60);
        int minact = (dianum * 24 * 60) + (horas * 60) + minutos;
        System.out.println("Faltan "+(mintotal-minact)+" minuto para llegar al fin de semana. ");
    }
}