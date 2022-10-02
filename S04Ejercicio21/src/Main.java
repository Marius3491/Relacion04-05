import java.util.Scanner;
public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Nota del primer control: ");
        double nota1 = sc.nextDouble();
        System.out.print("Nota del segundo control: ");
        double nota2 = sc.nextDouble();
        double media = (nota1+nota2)/2;
        if(media >= 5){
            System.out.println("Aprobado");
            System.out.println("Media: "+media);
        } else if(media < 5) {
            System.out.print("¿Cuál ha sido el resultado de la recuperación?");
            String resultado = sc.next();
            if(resultado.equals("apto")){
                System.out.println("Nota: 5");
            } else{
                System.out.println("Media: "+media);
            }
        }
    }
}