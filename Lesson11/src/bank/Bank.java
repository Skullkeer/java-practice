package bank;

public class Bank {

    public static void main() {
        BankAccount acc = new BankAccount("Jadey");
        try {
            acc.displayBalance();
            acc.depositFund(100);
            acc.displayBalance();
            acc.withdrawFund(0);
            acc.displayBalance();
        } catch (BankAccount.InvalidAccountRequest e) {
            e.printStackTrace();
            return;
        }

    }

}
