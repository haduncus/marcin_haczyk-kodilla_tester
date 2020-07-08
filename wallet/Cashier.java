package wallet;

public class Cashier {
    private CashSlot cashSlot;
    Wallet wallet = new Wallet();

    public Cashier(CashSlot cashSlot) {
        this.cashSlot = cashSlot;
    }

    public String notification() {
        return "You have insufficient funds in your account!";
    }

    public void withdraw(Wallet wallet, int amount) {
        if (amount <= wallet.getBalance()) {
            wallet.debit(amount);
            cashSlot.dispense(amount);
        } else {
            notification();
        }
    }
}