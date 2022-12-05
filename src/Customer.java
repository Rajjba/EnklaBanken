import java.util.Scanner;

public class Customer{
    String name;
    int id;
    Account account;

    public Customer() {
        account = new Account(this);
    } //här så skapas ett account och kopplas till customern genom owner på direkten när en customer skapas.

}

