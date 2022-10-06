import java.util.Scanner;
public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int cuenta_num=0;
        int num_int;
        int sum_impar = 0;
        int ele_impar = 0;
        int max_par = 0;
        System.out.println("Introduce numero hasta introducir numero negativo: ");
do {
    num_int = sc.nextInt();
    if(num_int >= 0) {
        cuenta_num++;
        if(num_int % 2 == 1){
            sum_impar += num_int;
            ele_impar++;
        } else{
            if(num_int > max_par){
                max_par = num_int;
            }
        }
    }

}while (num_int >=0 );

        System.out.println("Numeros introducidos positivos: "+cuenta_num);
        System.out.println("Media de impares: "+sum_impar/ele_impar);
        System.out.println("Maximo de los pares: "+max_par);
    }
}