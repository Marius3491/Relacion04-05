import java.util.Scanner;
public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Por favor introduzca numero para dia de la semana correspondiente: ");
        int num_dia = sc.nextInt();
        String nombredia;
        switch (num_dia){
            case 1:
                nombredia="lunes";
                break;
            case 2:
                nombredia="martes";
                break;
            case 3:
                nombredia="miercoles";
                break;
            case 4:
                nombredia="jueves";
                break;
            case 5:
                nombredia="viernes";
                break;
            case 6:
                nombredia="sabado";
                break;
            case 7:
                nombredia="domingo";
                break;
            default:
                nombredia="Error!";
        }
        System.out.println(nombredia);
    }
}