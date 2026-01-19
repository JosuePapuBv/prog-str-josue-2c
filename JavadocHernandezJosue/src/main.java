import java.util.Scanner;

public class main{

    public static void main(String[] args) {
        Scanner entrada = new Scanner(System.in);
        int opcionSeleccionada;

        /**
         * Ciclo principal que muestra el menú y ejecuta la opción seleccionada.
         */
        do {
            System.out.println("MENÚ PRINCIPAL");
            System.out.println("1. Calcular Índice de Masa Corporal (IMC)");
            System.out.println("2. Calcular área de un rectángulo");
            System.out.println("3. Convertir °C a °F");
            System.out.println("4. Calcular área de un círculo");
            System.out.println("5. Salir");
            System.out.print("Selecciona una opción: ");
            opcionSeleccionada = entrada.nextInt();

            /**
             * Ejecuta la acción correspondiente a la opción seleccionada.
             */
            switch (opcionSeleccionada) {
                case 1:
                    calcularImc(entrada);
                    break;
                case 2:
                    calcularAreaRectangulo(entrada);
                    break;
                case 3:
                    convertirCelsiusAFahrenheit(entrada);
                    break;
                case 4:
                    calcularAreaCirculo(entrada);
                    break;
                case 5:
                    System.out.println("Saliendo del programa...");
                    break;
                default:
                    System.out.println("Opción inválida, intenta de nuevo.");
            }
            System.out.println();
        } while (opcionSeleccionada != 5);
        entrada.close();
    }

    /**
     * Calcula el Índice de Masa Corporal (IMC) a partir del peso y la estatura.
     *
     * @param entrada Objeto Scanner para leer los datos ingresados por el usuario.
     */
    public static void calcularImc(Scanner entrada) {
        System.out.print("Ingresa tu peso en kg: ");
        double peso = entrada.nextDouble();
        System.out.print("Ingresa tu estatura en metros: ");
        double estatura = entrada.nextDouble();
        double imc = peso / (estatura * estatura);
        System.out.println("Tu IMC es " + imc);
    }

    /**
     * Calcula el área de un rectángulo a partir de su base y altura.
     *
     * @param entrada Objeto Scanner para leer los datos ingresados por el usuario.
     */
    public static void calcularAreaRectangulo(Scanner entrada) {
        System.out.print("Ingresa la base del rectángulo: ");
        double base = entrada.nextDouble();
        System.out.print("Ingresa la altura del rectángulo: ");
        double altura = entrada.nextDouble();
        double area = base * altura;
        System.out.println("El área del rectángulo es " + area);
    }

    /**
     * Convierte una temperatura de grados Celsius a Fahrenheit.
     *
     * @param entrada Objeto Scanner para leer los datos ingresados por el usuario.
     */
    public static void convertirCelsiusAFahrenheit(Scanner entrada) {
        System.out.print("Ingresa la temperatura en grados Celsius: ");
        double celsius = entrada.nextDouble();
        double fahrenheit = (celsius * 1.8) + 32;
        System.out.println("La temperatura en Fahrenheit es " + fahrenheit);
    }

    /**
     * Calcula el área de un círculo a partir de su radio.
     *
     * @param entrada Objeto Scanner para leer los datos ingresados por el usuario.
     */
    public static void calcularAreaCirculo(Scanner entrada) {
        System.out.print("Ingresa el radio del círculo: ");
        double radio = entrada.nextDouble();
        double area = Math.PI * radio * radio;
        System.out.println("El área del círculo es " + area);
    }
}