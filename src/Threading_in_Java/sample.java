package Threading_in_Java;

class BankAccount {

    int balance = 10000;

    public void withdraw(int amount) {

        // Check balance
        if(balance >= amount) {

            System.out.println(Thread.currentThread().getName()
                    + " is withdrawing ₹" + amount);

            // Simulating delay
            try {
                Thread.sleep(1000);
            } catch(Exception e) {
                System.out.println(e);
            }

            balance = balance - amount;

            System.out.println(Thread.currentThread().getName()
                    + " completed withdrawal");

            System.out.println("Remaining Balance: ₹" + balance);
        }
        else {

            System.out.println(Thread.currentThread().getName()
                    + " Insufficient Balance");
        }
    }
}

class ATM extends Thread {

    BankAccount account;
    int amount;

    ATM(BankAccount account, int amount, String atmName) {

        this.account = account;
        this.amount = amount;

        setName(atmName);
    }

    public void run() {

        account.withdraw(amount);
    }
}

public class sample {

    public static void main(String[] args) {

        BankAccount account = new BankAccount();

        ATM atm1 = new ATM(account, 7000, "ATM 1");

        ATM atm2 = new ATM(account, 5000, "ATM 2");

        atm1.start();

        atm2.start();
    }
}