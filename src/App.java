import java.util.Scanner;

public class App {
    public static void main(String[] args) throws Exception {
        var scanner = new Scanner(System.in);

        System.out.println("Your account number: ");
        Integer number = scanner.nextInt();
        scanner.nextLine();

        System.out.println("Your agency: ");
        String agency = scanner.nextLine();

        System.out.println("Account holder name: ");
        String holderName = scanner.nextLine();

        System.out.println("Account balance: ");
        String balance = scanner.nextLine();

        ContaTerminal terminal = new ContaTerminal(number, agency, holderName, balance);

        terminal.welcomeMessage();
    }
}
