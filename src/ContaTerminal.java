public class ContaTerminal {
    Integer number;
    String agency;
    String holderName;
    String balance;

    public ContaTerminal(Integer number, String agency, String holderName, String balance) {
        {
            this.number = number;
            this.agency = agency;
            this.holderName = holderName;
            this.balance = balance;
        }
    }

    public void welcomeMessage(){
        System.err.println("Hello " + holderName + ", thanks for creating a new account at our bank, your agency is " + agency + ", account number " + number + " and your balance " + balance + " is available.");
    }
}
