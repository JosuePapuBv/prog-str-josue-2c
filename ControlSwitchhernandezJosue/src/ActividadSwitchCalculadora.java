import java.util.Scanner;

public class ActividadSwitchCalculadora {
        public static void main (String[] args){
            Scanner scanner = new Scanner(System.in);
            System.out.println(" 1) Sumar\n 2) restar\n 3) multiplicar\n 4)dividir");
            System.out.println("elija su opcion");
            int opcion= scanner.nextInt();

            switch (opcion){
                case 1:
                    System.out.println("ingrese el primer valor");
                    double valor1 = scanner.nextDouble();
                    System.out.println("ingrese el segundo valor");
                    double valor2 =  scanner.nextDouble();
                    System.out.println("tu elccion fue la suma");
                    System.out.println("tus valores elegidos fueron:" +valor1+ " y "+valor2);
                    double resultado= valor1 + valor2;
                    System.out.println("el resultado de la operacion es:"+resultado);
                    break;
                case 2:
                    System.out.println("ingrese el primer valor");
                    valor1 = scanner.nextDouble();
                    System.out.println("ingrese el segundo valor");
                    valor2 =  scanner.nextDouble();
                    System.out.println("tu elccion fue la resta");
                    System.out.println("tus valores elegidos fueron:" +valor1+ " y "+valor2);
                    resultado= valor1 - valor2;
                    System.out.println("el resultado de la operacion es:"+resultado);
                    break;
                case 3:
                    System.out.println("ingrese el primer valor");
                    valor1 = scanner.nextDouble();
                    System.out.println("ingrese el segundo valor");
                    valor2 =  scanner.nextDouble();
                    System.out.println("tu elccion fue la multiplicacion");
                    System.out.println("tus valores elegidos fueron:" +valor1+ " y "+valor2);
                    resultado= valor1 * valor2;
                    System.out.println("el resultado de la operacion es:"+resultado);
                    break;
                case 4:
                    System.out.println("ingrese el primer valor");
                    valor1 = scanner.nextDouble();
                    System.out.println("ingrese el segundo valor");
                    valor2 =  scanner.nextDouble();
                    System.out.println("tu elccion fue la division");
                    System.out.println("tus valores elegidos fueron:" +valor1+ " y "+valor2);
                    if (valor2==0) {
                        System.out.println("no se puede dividir entre cero");
                    }else{
                        resultado = valor1 / valor2;
                        System.out.println("tu resultado es:"+resultado);}
                default:
                    System.out.println("error, seleccione una opcion valida");
                    break;
            }
        }




    }

