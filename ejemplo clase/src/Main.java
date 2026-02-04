import java.util.Scanner;
public class Main {
    public static void main(String[] args) {
        Ticket ticket = new Ticket();
        InputValidator inputvalidator = new InputValidator();
        Scanner sc = new Scanner(System.in);
        //I-p-0
        //Input
        int cantidad = inputvalidator.getValdInt("Ingresa la cantidad de articulos", sc);
        //proceso
        ticket.process(cantidad);
        //Outpot
        ticket.imprimirTicket(cantidad);
    }
}