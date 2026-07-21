import java.util.Scanner;

public class BankTransactionSystem {
    public class InsufficientBalanceException extends Exception {

        public InsufficientBalanceException(String message) {
            super(message);
        }
    }

    private double balance;

    public BankTransactionSystem(double balance) {
        this.balance = balance;
    }

    public void withdraw(double amount)
            throws InsufficientBalanceException {

        if (amount < 0) {
            throw new IllegalArgumentException(
                    "Invalid withdrawal amount!");
        }

        if (amount > balance) {
            throw new InsufficientBalanceException(
                    "Insufficient balance!");
        }

        balance -= amount;

        System.out.println(
                "Withdrawal successful, New Balance = " + balance);
    }

    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);

        System.out.print("Enter Initial Balance: ");
        double balance = sc.nextDouble();

        BankTransactionSystem account =
                new BankTransactionSystem(balance);

        System.out.print("Enter Withdrawal Amount: ");
        double amount = sc.nextDouble();

        try {

            account.withdraw(amount);

        } catch (InsufficientBalanceException e) {

            System.out.println(e.getMessage());

        } catch (IllegalArgumentException e) {

            System.out.println(e.getMessage());
        }
    }
}