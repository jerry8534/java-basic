package access;

public class BankAccount {

    private int balance;

    public BankAccount() {
        balance = 0;
    }

    public void deposit(int amount) {
        if(isAmountValid(amount)) {
            balance += amount;
        } else {
            System.out.println("Amount invalid");
        }
    }

    public void withdraw(int amount) {
        if(isAmountValid(amount) && balance >= amount) {
            balance -= amount;
        } else {
            System.out.println("Amount invalid");
        }
    }

    public int getBalance() {
        return balance;
    }

    private boolean isAmountValid(int amount) {
        return amount > 0;
    }
}
