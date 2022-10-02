import java.util.Scanner;
public class Main {
    public static void main(String[] args){
        Scanner sc = new Scanner(System.in);
        int intento = 0;
        System.out.print("Introduce clave de Acceso [4 Digitos]: ");
        int clave = sc.nextInt();
        for(int i=0;i<3;i++){
            if((clave==3491) && (i==0)){
                System.out.println("Acceso concedido, cerrojo desbloqueado");
            } else if (clave != 3491){
                System.out.println("Acceso Denegado");
                System.out.print("Introduce clave de Acceso [4 Digitos]: ");
                clave = sc.nextInt();
                intento++;
            }
            if(intento==3){
                System.out.println("Acceso Denegado");
                System.out.println("Cerrando Sistema...");
            }
        }
    }
}