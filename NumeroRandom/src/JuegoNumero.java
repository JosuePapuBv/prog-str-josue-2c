import java.util.Random;
import java.util.Scanner;

public class JuegoNumero {
    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);
        Random random = new Random();

        int intentoUsuario = 0;
        int errores = 0;
        int fueraRango = 0;
        int fallos = 0;

        int secreto = random.nextInt(1, 101);
        System.out.println("Numero secreto: " + secreto);

        boolean acerto = false;

        int turno = 1;
        while (turno <= 7) {

            System.out.println("\nTurno " + turno);
            System.out.print("Adivina el numero (1 a 100): ");

            try {
                intentoUsuario = sc.nextInt();
            } catch (Exception e) {
                System.out.println("Entrada invalida, solo admite numeros");
                errores++;
                sc.next();
                turno++;
                continue;
            }

            if (intentoUsuario < 1 || intentoUsuario > 100) {
                System.out.println("El numero esta fuera del rango permitido");
                fueraRango++;
            } else if (intentoUsuario == secreto) {
                acerto = true;
                break;
            } else {
                if (intentoUsuario < secreto) {
                    System.out.println("El numero secreto es mayor");
                } else {
                    System.out.println("El numero secreto es menor");
                }
                fallos++;
            }

            turno++;
        }

        System.out.println("\nresultado");
        if (acerto) {
            System.out.println("Ganaste");
        } else {
            System.out.println("Perdiste");
            System.out.println("El numero secreto fue: " + secreto);
        }

        System.out.println("Intentos fallidos: " + fallos);
        System.out.println("Fuera de rango: " + fueraRango);
        System.out.println("Datos no numericos: " + errores);
    }
}
