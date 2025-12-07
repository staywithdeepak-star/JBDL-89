public class BankAccount {

    private String id;
    private long balance;
    public BankAccount(String id, long balance) {
        this.id = id;
        this.balance = balance;
    }

    public String getId() {
        return id;
    }

    public void setId(String id) {
        this.id = id;
    }

    public long getBalance() {
        return balance;
    }

    public void setBalance(long balance) {
        this.balance = balance;
    }

    public void deposit(long amount) {
//        System.out.println("Inside deposit function, amount = " + amount + ", thread = " + Thread.currentThread());

        synchronized (this) { // in whichever thread this is code is running, that thread is going to take a lock on the current object
            System.out.println("Inside deposit critical section, thread = " + Thread.currentThread());
            try {
                Thread.sleep(2000);
            }catch (InterruptedException e){
                e.printStackTrace();
            }
            this.balance += amount;
        }

        System.out.println("Exiting deposit function, balance = " + this.balance + ", thread = " + Thread.currentThread());
    }

    public void withdraw(long amount){
//        System.out.println("Inside withdraw function, amount = " + amount + ", thread = " + Thread.currentThread());

        synchronized (this) {
            System.out.println("Inside withdraw critical section, thread = " + Thread.currentThread());
            this.balance -= amount;
            try {
                Thread.sleep(2000);
            } catch (InterruptedException e) {
                throw new RuntimeException(e);
            }
        }
        System.out.println("Exiting withdraw function, balance = " + this.balance + ", thread = " + Thread.currentThread());
    }
}
