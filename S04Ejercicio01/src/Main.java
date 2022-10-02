import java.util.Scanner;
public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Introduce un dia para ver la primera hora correspondiente: ");
        String dia = sc.next();
        if(dia.equals("lunes")){
            System.out.println("BDA");
        } else if (dia.equals("martes")){
            System.out.println("PRG");
        } else if (dia.equals("miercoles")){
            System.out.println("PRG");
        } else if (dia.equals("jueves")){
            System.out.println("EDS");
        } else if(dia.equals("viernes")){
            System.out.println("BDA");
        } else {
            System.out.println("ERROR!");
        }
    }
}