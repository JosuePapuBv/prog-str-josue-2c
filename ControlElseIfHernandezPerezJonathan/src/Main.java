import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.println("¿cual es tu edad?");
        int edad = scanner.nextInt();

        if (edad < 0 || edad > 120) {
            System.out.println("edad invalida");
        } else {
            System.out.println("¿es estudiante?\nescribe true si eres estudiante\nescribe false si no eres estudiante");
            boolean eleccion = scanner.nextBoolean();
            double tarifa = 0;

            if (edad < 12) {
                tarifa = 50;
            } else if (edad >= 12 && edad <= 17) {
                if (eleccion == true) { tarifa = 60; }
                else { tarifa = 80; }
            } else if (edad >= 18) {
                if (eleccion == true) { tarifa = 90; }
                else { tarifa = 120; }
            }
            System.out.println("Su edad es: " + edad);
            if (eleccion == true) {
                System.out.println("Es estudiante");
            } else {
                System.out.println("No es estudiante");
            }
            System.out.println("Su tarifa es de: " + tarifa);
        }
    }
}