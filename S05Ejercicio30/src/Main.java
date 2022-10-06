import java.util.Scanner;
public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int dia_uno = 0;
        int dia_dos;
        int hora_uno;
        int hora_dos = 0;
        String dia_uno_string;
        String dia_dos_string;
        String nombre_dia_uno = "";
        String nombre_dia_dos = "";
        boolean datos_ok = true;



        do {
            System.out.println("\nPor favor, introduzca la primera hora.");

            boolean dia_ok;


            do {

                dia_ok = true;

                System.out.print("Día: ");
                dia_uno_string = sc.next();

                switch (dia_uno_string) {
                    case "lunes":
                    case "1":
                        dia_uno = 1;
                        nombre_dia_uno = "lunes";
                        break;
                    case "martes":
                    case "2":
                        dia_uno = 2;
                        nombre_dia_uno = "martes";
                        break;
                    case "miércoles":
                    case "3":
                        dia_uno = 3;
                        nombre_dia_uno = "miercoles";
                        break;
                    case "jueves":
                    case "4":
                        dia_uno = 4;
                        nombre_dia_uno = "jueves";
                        break;
                    case "viernes":
                    case "5":
                        dia_uno = 5;
                        nombre_dia_uno = "viernes";
                        break;
                    case "sábado":
                    case "6":
                        dia_uno = 6;
                        nombre_dia_uno = "sábado";
                        break;
                    case "domingo":
                    case "7":
                        dia_uno = 7;
                        nombre_dia_uno = "domingo";
                        break;
                    default:
                        dia_ok = false;
                }

                if (!dia_ok) {
                    System.out.println("No se ha introducido correctamente el día de la semana.");
                    System.out.print("Los días válidos son: lunes, martes, miércoles, ");
                    System.out.println("jueves, viernes, sábado y domingo.");
                }

            } while (!dia_ok);



            boolean hora_ok;

            do {
                hora_ok = true;
                System.out.print("Hora: ");
                hora_uno = sc.nextInt();
                if ((hora_uno < 0) || (hora_uno > 23)) {
                    System.out.println("No se ha introducido correctamente la hora del día.");
                    System.out.println("Las horas válidas están entre 0 y 23.");
                    hora_ok = false;
                }
            } while (!hora_ok);

            System.out.println("Por favor, introduzca la segunda hora.");

            do {

                datos_ok = true;

                dia_ok = true;

                System.out.print("Día: ");
                dia_dos_string = sc.next();

                switch (dia_dos_string) {
                    case "lunes":
                    case "1":
                        dia_dos = 1;
                        nombre_dia_dos = "lunes";
                        break;
                    case "martes":
                    case "2":
                        dia_dos = 2;
                        nombre_dia_dos = "martes";
                        break;
                    case "miércoles":
                    case "3":
                        dia_dos = 3;
                        nombre_dia_dos = "miércoles";
                        break;
                    case "jueves":
                    case "4":
                        dia_dos = 4;
                        nombre_dia_dos = "jueves";
                        break;
                    case "viernes":
                    case "5":
                        dia_dos = 5;
                        nombre_dia_dos = "viernes";
                        break;
                    case "sábado":
                    case "6":
                        dia_dos = 6;
                        nombre_dia_dos = "sábado";
                        break;
                    case "domingo":
                    case "7":
                        dia_dos = 7;
                        nombre_dia_dos = "domingo";
                        break;
                    default:
                        dia_dos = 0;
                }

                if (!dia_ok) {
                    System.out.println("No se ha introducido correctamente el día de la semana.[lunes - domingo]");
                }

            } while (!dia_ok);

            // Comprueba que el segundo día sea posterior al primero //////
            if (dia_dos <= dia_uno) {
                System.out.println("El segundo día debe ser posterior al primero.");
                datos_ok = false;
            }

            // Segunda hora ///////////////////////////////////////////////
            if (datos_ok) {
                do {
                    hora_ok = true;
                    System.out.print("Hora: ");
                    hora_dos = sc.nextInt();
                    if ((hora_dos < 0) || (hora_dos > 23)) {
                        System.out.println("No se ha introducido correctamente la hora del día.[00 - 23]");
                        hora_ok = false;
                    }
                } while (!hora_ok);

            }

        } while (!datos_ok);

        System.out.print("Entre las " + hora_uno + ":00h del " + nombre_dia_uno);
        System.out.print(" y las " + hora_dos + ":00h del " + nombre_dia_dos);
        System.out.println(" hay " + (((dia_dos * 24) + hora_dos) - ((dia_uno * 24) + hora_uno)) + " hora/s.");
    }
}