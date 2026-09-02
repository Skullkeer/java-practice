package CanberraBranch;

public class Main {
    public static void main(String[] args) {
        Account a = new Account(123, "Willow Woods", "Jadey");
        UI.checkBalance(a);
        UI.depositFunds(a);
        UI.checkBalance(a);
    }
}
