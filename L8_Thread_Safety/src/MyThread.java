public class MyThread extends Thread {

    private BankAccount bankAccount;
    private boolean isDeposit;
    private long amount;

    public MyThread(BankAccount bankAccount, boolean isDeposit, long amount) {
        this.bankAccount = bankAccount;
        this.isDeposit = isDeposit;
        this.amount = amount;
    }

    @Override
    public void run() {
//        ....
//        ....
//        ....
//        ....

//        System.out.println("Inside run function, amount = " + amount + ", thread = " + Thread.currentThread());
        if(isDeposit){
            this.bankAccount.deposit(this.amount);
        }else{
            this.bankAccount.withdraw(this.amount);
        }

//        ....
//        ....
//        ....
    }
}
