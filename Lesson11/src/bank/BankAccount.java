package bank;

public class BankAccount {

    private double balance;
    private String name;

    BankAccount(String name) {
        this.name = name;
        this.balance = 0;
    }

    class InvalidAccountRequest extends Exception {
        InvalidAccountRequest(String msg) {
            super(msg);
        }
    }

    void depositFund(double amount) throws InvalidAccountRequest {
        if (amount < 0)
            throw new InvalidAccountRequest("Negative Deposit!");
        else
            this.balance += amount;
    }

    void withdrawFund(double amount) throws InvalidAccountRequest {
        if (amount > this.balance)
            throw new InvalidAccountRequest("Withdraw Exceeds Balance");
        else
            this.balance -= amount;
    }

    void displayBalance() {
        System.out.printf("Current Balance: %.2f\n", this.balance);
    }

}
