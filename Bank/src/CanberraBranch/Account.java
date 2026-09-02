package CanberraBranch;

public class Account {

    private int balance = 0;
    private int id;
    private String name;
    private String password;

    public Account(int id, String name, String password) {
        this.id = id;
        this.name = name;
        this.password = password;
    }

    public int getID() {
        return this.id;
    }

    public Object getBalance(String password) {
        if (Verify.verifyAccountPassword(password, this)) {
            return (float) this.balance / 100;
        }
        return("Incorrect Password!");
    }

    public String depositMoney(int amount) {
        this.balance += (amount * 100);
        return "You Deposited: $" + amount;
    }

    public static class Verify {
        static boolean verifyAccountName(String name, Account acc) {
            return name.equals(acc.name);
        }

        static boolean verifyAccountID(int id, Account acc) {
            return id == acc.id;
        }

        static boolean verifyAccountPassword(String password, Account acc) {
            return password.equals(acc.password);
        }


    }

}
