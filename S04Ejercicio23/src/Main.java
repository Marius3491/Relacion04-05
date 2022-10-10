import java.util.Scanner;
public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Introduzca la base imponible: ");
        double baseImponible = sc.nextDouble();
        System.out.print("Introduzca el tipo de IVA (general, reducido o superreducido): ");
        String tipoIVA = sc.next();
        System.out.print("Introduzca el código promocional (nopro, mitad, meno5 o 5porc): ");
        String codigoPromocional = sc.next();

        int tipoIVANumerico = 0;
        switch(tipoIVA) {
            case "general":
                tipoIVANumerico = 21;
                break;
            case "reducido":
                tipoIVANumerico = 10;
                break;
            case "superreducido":
                tipoIVANumerico = 4;
                break;
            default:
                System.out.println("El tipo de IVA introducido no es correcto.");
        }
        double iva = baseImponible * tipoIVANumerico / 100;
        double precioSinDescuento = baseImponible + iva;

        double descuento = 0;
        switch(codigoPromocional) {
            case "nopro":
                break;
            case "mitad":
                descuento = precioSinDescuento / 2;
                break;
            case "meno5":
                descuento = 5;
                break;
            case "5porc":
                descuento = precioSinDescuento * 0.05;
                break;
            default:
                System.out.println("El código promocional introducido no es correcto.");
        }

        double total = precioSinDescuento - descuento;
        System.out.println("Base imponible: "+baseImponible);
        System.out.println("IVA ("+tipoIVANumerico+") "+iva);
        System.out.println("Precio con IVA "+precioSinDescuento);
        System.out.println("Cód. promo. ("+codigoPromocional+") -% "+descuento+".");
        System.out.println("TOTAL "+total);
    }
}