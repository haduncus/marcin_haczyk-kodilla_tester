package wallet;

import io.cucumber.java8.En;
import org.junit.Assert;

public class WalletSteps implements En {

    private Wallet wallet = new Wallet();
    private CashSlot cashSlot = new CashSlot();
    private Cashier cashier = new Cashier(cashSlot);

    public WalletSteps() {
        Given("I have deposited $ 200 in my wallet", () -> {
            wallet.deposit(200);
            Assert.assertEquals("Incorrect wallet balance", 200, wallet.getBalance());
        });

        When("I request $ 30", () -> {
            cashier.withdraw(wallet, 30);
        });

        Then("$ 30 should be dispensed", () -> {
            Assert.assertEquals(30, cashSlot.getContents());
        });

        Then("the balance of my wallet should be $ 170", () -> {
            Assert.assertEquals("Incorrect wallet balance", 170, wallet.getBalance());
        });

        When("I request $ 50", () -> {
            cashier.withdraw(wallet, 50);
        });

        Then("$ 50 should be dispensed", () -> {
            Assert.assertEquals(50, cashSlot.getContents());
        });

        Then("the balance of my wallet should be $ 150", () -> {
            Assert.assertEquals("Incorrect wallet balance", 150, wallet.getBalance());
        });

        When("I request $ 200", () -> {
            cashier.withdraw(wallet, 200);
        });

        Then("$ 200 should be dispensed", () -> {
            Assert.assertEquals(200, cashSlot.getContents());
        });

        Then("the balance of my wallet should be $ 0", () -> {
            Assert.assertEquals("Incorrect wallet balance", 0, wallet.getBalance());
        });

        When("I request $ 0", () -> {
            cashier.withdraw(wallet, 0);
        });

        Then("$ 0 should be dispensed", () -> {
            Assert.assertEquals(0, cashSlot.getContents());
        });

        Then("the balance of my wallet should be $ 200", () -> {
            Assert.assertEquals("Incorrect wallet balance", 200, wallet.getBalance());
        });

        Given("my account has been credited with $ 100", () -> {
            wallet.deposit(100);
            Assert.assertEquals("Incorrect wallet balance", 100, wallet.getBalance());
        });

        When("I check my balance", () -> {
            wallet.getBalance();
        });

        Then("I should see that my balance is $ 100", () -> {
            Assert.assertEquals("Incorrect wallet balance", 100, wallet.getBalance());
        });

        Given("my wallet has been credited with $ 100", () -> {
            wallet.deposit(100);
            Assert.assertEquals("Incorrect wallet balance", 100, wallet.getBalance());
        });

        When("I withdraw $ 200", () -> {
            cashier.withdraw(wallet, 200);
        });

        Then("nothing should be dispensed", () -> {
            Assert.assertEquals(0, cashSlot.getContents());
        });

        Then("I should be told that I have insufficient funds in my account", () -> {
            Assert.assertEquals("You have insufficient funds in your account!", cashier.notification());
        });

        When("I withdraw $ 50", () -> {
            cashier.withdraw(wallet, 50);
        });

        Then("It should return $ 50", () -> {
            Assert.assertEquals("Incorrect wallet balance", 50, wallet.getBalance());
        });
    }
}