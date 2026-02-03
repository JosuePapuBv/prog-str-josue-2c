import java.util.Scanner;

public class Main {
    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);
        int opcion = 0;

        int cont1 = 0;
        int cont2 = 0;
        int cont3 = 0;
        int cont4 = 0;

        do {
            System.out.println("\nMENU");
            System.out.println("1) Celsius a Fahrenheit");
            System.out.println("2) Fahrenheit a Celsius");
            System.out.println("3) Kilometros a Millas");
            System.out.println("4) Millas a Kilometros");
            System.out.println("5) Salir");
            System.out.print("Elige una opcion: ");

            if (sc.hasNextInt()) {
                opcion = sc.nextInt();
            } else {
                System.out.println("Debes ingresar un numero");
                sc.next();
                continue;
            }

            if (opcion >= 1 && opcion <= 4) {

                System.out.print("Ingresa el valor: ");

                double valor;
                if (sc.hasNextDouble()) {
                    valor = sc.nextDouble();
                } else {
                    System.out.println("Debes ingresar un valor numerico");
                    sc.next();
                    continue;
                }

                if (opcion == 1) {
                    double resultado = (valor * 9 / 5) + 32;
                    System.out.println(valor + " C = " + resultado + " F");
                    cont1++;
                } else if (opcion == 2) {
                    double resultado = (valor - 32) * 5 / 9;
                    System.out.println(valor + " F = " + resultado + " C");
                    cont2++;
                } else if (opcion == 3) {
                    double resultado = valor * 0.621371;
                    System.out.println(valor + " km = " + resultado + " millas");
                    cont3++;
                } else if (opcion == 4) {
                    double resultado = valor / 0.621371;
                    System.out.println(valor + " millas = " + resultado + " km");
                    cont4++;
                }

            } else if (opcion != 5) {
                System.out.println("Opcion incorrecta");
            }

        } while (opcion != 5);

        System.out.println("\nRESUMEN");
        System.out.println("C a F: " + cont1);
        System.out.println("F a C: " + cont2);
        System.out.println("Km a Millas: " + cont3);
        System.out.println("Millas a Km: " + cont4);
        System.out.println("Total: " + (cont1 + cont2 + cont3 + cont4));
    }
}
