import java.util.Scanner;
public class Main {
    public static void main(String[] args) {
       Scanner sc = new Scanner(System.in);
        System.out.print("Introduce un relleno ");
        String r = sc.next();
        System.out.print("Introduzca opcion para vertice: ");
        System.out.println("1. Hacia arriba");
        System.out.println("2. Hacia abajo");
        System.out.println("3. Hacia la izquierda");
        System.out.println("4. Hacia la derecha");
        int opcion = sc.nextInt();
        switch(opcion) {
            case 1:
                System.out.println("  " + r);
                System.out.println(" " + r + r + r);
                System.out.println(r + r + r + r + r);
                break;
            case 2:
                System.out.println(r + r + r + r + r);
                System.out.println(" " + r + r + r);
                System.out.println("  " + r);
                break;
            case 3:
                System.out.println("    " + r);
                System.out.println("  " + r + " " + r);
                System.out.println(r + " " + r + " " + r);
                System.out.println("  " + r + " " + r);
                System.out.println("    " + r);
                break;
            case 4:
                System.out.println(r);
                System.out.println(r + " " + r);
                System.out.println(r + " " + r + " " + r);
                System.out.println(r + " " + r);
                System.out.println(r);
                break;
            default:
                System.out.println("Error!");
        }
        }
    }