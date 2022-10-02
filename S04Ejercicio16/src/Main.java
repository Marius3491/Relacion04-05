import java.util.Scanner;
public class Main {
    public static void main(String[] args) {
       Scanner sc = new Scanner(System.in);
       String respuesta;
       int puntos = 0;
       // preguntas
        System.out.print("1. Tu pareja parece estar más inquieta de lo normal sin ningún motivo aparente.\n(v)erdadero o (f)also: ");
        respuesta = sc.next();
        if ( respuesta.equals("v") ) {
            puntos += 3;
        }
        System.out.print("2. Ha aumentado sus gastos de vestuario.");
        respuesta = sc.next();
        if ( respuesta.equals("v") ) {
            puntos += 3;
        }
        System.out.print("3. Ha perdido el interés que mostraba anteriormente por ti.");
        respuesta = sc.next();
        if ( respuesta.equals("v") ) {
            puntos += 3;
        }
        System.out.print("4. Ahora se afeita y se asea con más frecuencia (si es hombre) o ahora se arregla el pelo y se asea con más frecuencia (si es mujer).");
        respuesta = sc.next();
        if ( respuesta.equals("v") ) {
            puntos += 3;
        }
        System.out.print("5. No te deja que mires la agenda de su teléfono móvil.");
        respuesta = sc.next();
        if ( respuesta.equals("v") ) {
            puntos += 3;
        }
        System.out.print("6. A veces tiene llamadas que dice no querer contestar cuando estás tú delante.");
        respuesta = sc.next();
        if ( respuesta.equals("v") ) {
            puntos += 3;
        }
        System.out.print("7. Últimamente se preocupa más en cuidar la línea y/o estar bronceado/a.");
        respuesta = sc.next();
        if ( respuesta.equals("v") ) {
            puntos += 3;
        }
        System.out.print("8. Muchos días viene tarde después de trabajar porque dice tener mucho más trabajo.");
        respuesta = sc.next();
        if ( respuesta.equals("v") ) {
            puntos += 3;
        }
        System.out.print("9. Has notado que últimamente se perfuma más.");
        respuesta = sc.next();
        if ( respuesta.equals("v") ) {
            puntos += 3;
        }
        System.out.print("10. Se confunde y te dice que ha estado en sitios donde no ha ido contigo.");
        respuesta = sc.next();
        if ( respuesta.equals("v") ) {
            puntos += 3;
        }

        //puntaje

        if ( puntos <= 10 ) {
            System.out.print("Pareja Fiel");
        }

        if ( (puntos > 11 ) && (puntos <= 22) ) {
            System.out.print("Mucho ojo");
        }

        if ( puntos >= 22 ) {
            System.out.print("Tengo malas noticias para ti");
        }
    }
}