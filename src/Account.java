import java.util.Scanner;

public class Account extends Customer {
    Customer owner;
    float balance;

    public Account(Customer owner) {
        this.owner = owner;
        this.balance = 0;
    }

    public void changeBal(){
            System.out.println("Vill du ändra ditt saldo?");
            Scanner myScanner = new Scanner(System.in);
            String choice = myScanner.next();
        while(true) {
            if (choice == "ja") {
                System.out.println("Hur mycket vill du insätta?");
                int insättning = myScanner.nextInt();
                balance += insättning;
                System.out.println("Ditt saldo: " + balance);
                break;
            }
            else if (choice == "nej") {
                break;
            }
            else{
                System.out.println("Fel. Försök igen.");
            }
        }
    }
}
