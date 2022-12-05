import java.util.ArrayList;
import java.util.Scanner;

public class Bank{
    ArrayList<Customer> customers = new ArrayList<>();
    ArrayList<Account> accounts = new ArrayList<>();

    public Bank() {
    }
    public void newCustomer() {
        Scanner myScanner = new Scanner(System.in);
        Customer myCust = new Customer();

        customers.add(myCust);
        accounts.add(myCust.account);

        while (true) {
            try {
                System.out.println("Ange namn: ");
                String newName = myScanner.next();
                myCust.name = newName;
            } catch (Exception e) {
                System.out.println("Fel. Skriv ditt namn.");
            }
            break;
        }
        System.out.println("Ange personnummer: ");
        while (true) {
            try {
                int newId = myScanner.nextInt();
                myCust.id = newId;
            } catch (Exception e) {
                System.out.println("Fel. Skriv ditt personnummer.");
            }
            break;
        }
        System.out.println("Ditt namn: " + myCust.name);
        System.out.println("Ditt personnummer: " + myCust.id);
        System.out.println("Ditt konto är nu skapat!");
    }
    public void listAccounts() {
        Scanner myScanner = new Scanner(System.in);
        String choice = myScanner.next();
        while (true) {
            System.out.println("Vill du se listan av konton?");
            if (choice == "ja") {
                for (int i = 0; i < accounts.size(); i++)
                    System.out.println(accounts.get(i));
                break;
            } else if (choice == "nej") {
                break;
            }
            else{
                System.out.println("Fel. Försök igen.");
            }
        }
        System.out.println("klar!!!");
    }
}
