import java.util.Scanner;
public class Main {

    public static void main(String[] args){
        Scanner sc = new Scanner(System.in);
        int numero = obtenerInt(sc, "Ingresa un numero entero (positivo)");
        int s= obtenerSuma(numero);
        System.out.println("resultado:"+s);
    }

    /**
     *
     * @param sc es para  leer el numero entero
     * @param mensaje Pedirá al usuario que introduzca un número entero y positivo
     * @return el numero entero
     */
    public static int  obtenerInt(Scanner sc, String mensaje) {
        System.out.println(mensaje);
        return sc.nextInt();
    }

    /**
     *
     * @param
     * @return devolvera el resultado de la operacion
     */
    public static int obtenerSuma(int numero){
        int suma=0;
        for(int i = 1; i <= numero; i++){
            suma+=i;
        }
        return suma;
    }
    }