import java.util.*;

class BankAccount {
    int balance = 0;

    void deposit(int amount) {
        balance += amount;
    }

    void withdraw(int amount) {
        balance -= amount;
    }
}

public class task5 {
    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);

        int n = sc.nextInt();
        BankAccount account = new BankAccount();

        for (int i = 0; i < n; i++) {
            String operation = sc.next();
            int amount = sc.nextInt();

            if (operation.equalsIgnoreCase("Deposit")) {
                account.deposit(amount);
            } else {
                account.withdraw(amount);
            }
        }

        System.out.println(account.balance);
    }
}
// output
// 3
// Deposit 5000
// Withdraw 1500
// Deposit 500
// 4000