package example.model;

public class SimpleBankAccountWithAtm extends AbstractBankAccount{

    public SimpleBankAccountWithAtm(double balance, AccountHolder holder, double fee) {
        super(balance, holder, fee);
    }
}

        /*implements BankAccount{

    private double balance;
    private final AccountHolder holder;

    public SimpleBankAccountWithAtm(final AccountHolder holder, final double balance) {
        this.holder = holder;
        this.balance = balance;
    }
    @Override
    public AccountHolder getHolder() {
        return this.holder;
    }

    @Override
    public double getBalance() {
        return this.balance;
    }

    @Override
    public void deposit(int userID, double amount) {
        if (checkUser(userID)) {
            this.balance += amount-1;
        }
    }

    private boolean checkUser(final int userID) {
        return this.holder.getId() == userID;
    }

    @Override
    public void withdraw(int userID, double amount) {
        if (checkUser(userID) && isWithdrawAllowed(amount)) {
            this.balance -= amount;
            this.balance --;
        }
    }

    private boolean isWithdrawAllowed(final double amount){
        return this.balance >= amount;
    }

}

         */
