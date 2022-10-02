import java.util.Scanner;
public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Introduce un numero para mostrar la tabla: ");
        int n = sc.nextInt();
        for (int i=0; i<11; i++ ){
            System.out.println(n+" x "+i+" = "+(n*i));
        }
    }
}