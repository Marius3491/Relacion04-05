import java.util.Scanner;
public class Main {
    public static void main(String[] args) {
Scanner sc = new Scanner(System.in);
int n;
int digitos=0;
System.out.print("Introduce numero para averiguar numero de cifras: ");
n = Math.abs(sc.nextInt());
if(n < 10){
  digitos=1;
}
if (( n >= 10 ) && (n < 100)){
    digitos=2;
}
if ((n >= 100) && (n < 1000)){
    digitos=3;
}
if ((n >= 1000) && (n < 10000)){
    digitos=4;
}
if (n >= 10000){
    digitos=5;
}
if (digitos==1) {
    System.out.printf(n + " tiene un solo digito.");
}else{
    System.out.printf(n+" tiene "+digitos+" digitos.");
}
    }
}