package academy.devdojo.maratonajava.javacore.ZZFthreads.domain;

public class Account {
    private int balance = 50;

    public void withDrawal(int amout) {
        this.balance = this.balance - amout;
    }

    public int getBalance() {
        return balance;
    }
}
