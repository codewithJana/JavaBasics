package Threading_in_Java;

class JanaBankAccount{

    int balance = 10000;

    synchronized public void withdraw(int amount){

        if(balance >= amount){
            //start withdraw
            System.out.println(MyThread.currentThread().getName() +
                    " is withdrawing "+ amount);

            //stimulate delay of 1s - withdraw money
            try {
                Thread.sleep(1000);
            } catch (Exception e) {
                System.out.println(e);
            }

            balance = balance - amount;
            //complete withdraw
            System.out.println(MyThread.currentThread().getName() +
                    " withdraw completed");
            //display remaining balance
            System.out.println("Remaining balance is " + balance);

        }
        else {
            //print insufficient balance
            System.out.println(MyThread.currentThread().getName() +
                    " insufficient Balance ");
        }

    }

}

class ATM extends Thread{
    JanaBankAccount account;
    int amount;

    ATM(JanaBankAccount account,int amount, String atmName){
        this.account = account;
        this.amount = amount;

        setName(atmName);
    }

    public void run(){
        account.withdraw(amount);
    }
}

public class WithoutSynchronization {

    static void main(String[] args) {

        JanaBankAccount account = new JanaBankAccount();

        ATM atm1  = new ATM(account, 7000, "ATM 1");
        ATM atm2 = new ATM(account, 5000, "ATM 2");

        atm1.start();
        atm2.start();

    }

}
