package fizzbuzzchecker;

import io.cucumber.java8.En;
import org.junit.Assert;

public class FizzBuzzSteps implements En {
    private int number;
    private String result;

    public FizzBuzzSteps() {
        Given("number is 3", () -> {
            this.number = 3;
        });

        Given("number is 5", () -> {
            this.number = 5;
        });

        Given("number is 15", () -> {
            this.number = 15;
        });

        Given("number is 25", () -> {
            this.number = 25;
        });

        Given("number is 69", () -> {
            this.number = 69;
        });

        Given("number is 30", () -> {
            this.number = 30;
        });

        Given("number is 29", () -> {
            this.number = 29;
        });

        When("I ask whether it's divisible for 3 or and 5", () -> {
            FizzBuzzChecker fizzBuzzChecker = new FizzBuzzChecker();
            this.result = fizzBuzzChecker.checkIfDivided(this.number);
        });

        Then("It should be returned {string}", (String string) -> {
            Assert.assertEquals(string, this.result);
        });
    }
}
