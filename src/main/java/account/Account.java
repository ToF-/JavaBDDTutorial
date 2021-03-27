package account;

public class Account {
    private Integer balance;

    public Account() {
        balance = 0;
    }

    public Integer balance() {
        return balance;
    }

    public void setBalance(Integer balance) {
        this.balance = balance;
    }

    public void withdrawFixedAmount(Integer amount) {
        if (balance > amount)
            this.balance -= amount;
    }
}
