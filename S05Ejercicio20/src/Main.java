import java.util.Scanner;
public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Introduzca altura piramide: ");
        int altura_int = sc.nextInt();

        System.out.print("Introduzca caracter: ");
        String relleno = sc.next();

        int altura = 1;
        int i = 0;
        int espacios_del = altura_int - 1;
        int espacios_in = 0;

        while (altura < altura_int) {


            for (i = 1; i <= espacios_del; i++) {
                System.out.print(" ");
            }


            System.out.print(relleno);
            for (i = 1; i < espacios_in; i++) {
                System.out.print(" ");
            }

            if (altura>1) {
                System.out.print(relleno);
            }

            System.out.println();
            altura++;
            espacios_del--;
            espacios_in += 2;
        }


        for (i = 1; i < altura*2; i++) {
            System.out.print(relleno);
        }
    }
}