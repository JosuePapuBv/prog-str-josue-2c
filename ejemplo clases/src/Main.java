import java.util.Scanner;

public static voi
public class Main {d main(String[] args) {
        Ticket ticket = new Ticket();//Declaracion un objeto
        InputValidator inputValidator= new InputValidator();
        Scanner sc = new Scanner(System.in);
//I-P-O

//Input
        int cantidad = inputValidator.getValdInt("Ingresa la cantidad de articulos",sc);
//Process
        ticket.process(cantidad);

//Output
        ticket.imprimirTicket(cantidad);

    }
}