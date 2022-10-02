import java.util.Scanner;
public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int acierto = 0;
        int fallo = 0;
        int sincon= 0;
        String respuesta;
        System.out.println("Contesta a las siguientes preguntas: ");
        System.out.print("1. La estructura For es una estructura condicional \na-Si\nb-No\nc-nc\n");
        respuesta = sc.next();
        if (respuesta.equals("no")) {
            System.out.println("Correcto");
            acierto++;
        } else if (respuesta.equals("si")) {
            System.out.println("Incorrecto ");
            fallo++;
        } else if (respuesta.equals("nc")) {
            sincon++;
        }

        System.out.print("2. En HTML, la etiqueta <em> sirve para destacar un texto en negrita \na-Si\nb-No\nc-nc\n");
        respuesta = sc.next();
        if(respuesta.equals("no")) {
            System.out.println("Correcto");
            acierto++;
        } else if (respuesta.equals("si")){
            System.out.println("Incorrecto ");
            fallo++;
        } else if(respuesta.equals("nc")){
            sincon++;
        }

        System.out.print("3. Para las BBDD, usamos el modelo entidad-atributo \na-Si\nb-No\nc-nc\n");
        respuesta = sc.next();
        if(respuesta.equals("no")) {
            System.out.println("Correcto");
            acierto++;
        } else if (respuesta.equals("si")){
            System.out.println("Incorrecto ");
            fallo++;
        } else if (respuesta.equals("nc")){
            sincon++;
        }

        System.out.print("4. En Java, el tipo de dato Double no nos permite usar decimales \na-si\nb-no\nc-nc\n");
        respuesta = sc.next();
        if(respuesta.equals("no")) {
            System.out.println("Correcto");
            acierto++;
        } else if (respuesta.equals("si")){
            System.out.println("Incorrecto ");
            fallo++;
        } else if (respuesta.equals("nc")){
            sincon++;
        }

        System.out.print("5. En HTML, </body> es una etiqueta de apertura \n1-si\n2-no\n3-nc\n");
        respuesta = sc.next();
        if(respuesta.equals("no")) {
            System.out.println("Correcto");
            acierto++;
        } else if (respuesta.equals("si")){
            System.out.println("Incorrecto ");
            fallo++;
        } else if(respuesta.equals("nc")){
            sincon++;
        }

        System.out.print("6. Los datos booleanos que se pueden mostrar en pantalla son true y false \n1-si\n2-no\n3-nc\n");
        respuesta = sc.next();
        if(respuesta.equals("si")) {
            System.out.println("Correcto");
            acierto++;
        } else if (respuesta.equals("no")){
            System.out.println("Incorrecto ");
            fallo++;
        } else if(respuesta.equals("nc")){
            sincon++;
        }

        System.out.print("7. En Windows, podemos limpiar la consola de comandos usando clear \n1-si\n2-no\n3-nc\n");
        respuesta = sc.next();
        if(respuesta.equals("no")) {
            System.out.println("Correcto");
            acierto++;
        } else if(respuesta.equals("si")){
            System.out.println("Incorrecto ");
            fallo++;
        } else if(respuesta.equals("nc")){
            sincon++;
        }

        System.out.print("8. En Linux, el comando pwd te muestra el contenido de la carpeta raiz \n1-si\n2-no\n3-nc\n");
        respuesta = sc.next();
        if(respuesta.equals("no")) {
            System.out.println("Correcto");
            acierto++;
        } else if(respuesta.equals("si")){
            System.out.println("Incorrecto ");
            fallo++;
        } else if(respuesta.equals("nc")){
            sincon++;
        }

        System.out.print("9. Cuando dividimos dos numeros con % el posible resultado que muestra es el resto \n1-si\n2-no\n3-nc\n");
        respuesta = sc.next();
        if(respuesta.equals("si")) {
            System.out.println("Correcto");
            acierto++;
        } else if(respuesta.equals("no")){
            System.out.println("Incorrecto ");
            fallo++;
        } else if(respuesta.equals("nc")){
            sincon++;
        }

        System.out.print("10. Aprender programacion te sirve para hacer pizzas \n1-si\n2-no\n3-nc\n");
        respuesta = sc.next();
        if(respuesta.equals("no")) {
            System.out.println("Correcto");
            acierto++;
        } else if(respuesta.equals("si")){
            System.out.println("Incorrecto ");
            fallo++;
        } else if(respuesta.equals("nc")){
            sincon++;
        }
        System.out.println("Has acertado: "+acierto+" preguntas y fallado: "+fallo+". Has dejado sin contestar: "+sincon);
    }
}