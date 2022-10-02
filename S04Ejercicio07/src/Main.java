import java.util.Scanner;
public class Main {
    public static void main(String[] args) {
       Scanner sc = new Scanner(System.in);
        System.out.print("Introduce primera nota: ");
        double nota1 = sc.nextDouble();
        System.out.print("Introduce segunda nota: ");
        double nota2 = sc.nextDouble();
        System.out.println("Introduce tercera nota: ");
        double nota3 = sc.nextDouble();

        double resultado = (nota1+nota2+nota3)/3;
        System.out.println("Nota media de las tres anteriores introducidas: "+resultado);
    }
}