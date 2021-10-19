package jacob;


import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;


import static org.junit.Assert.assertEquals;

class IsItBlack {
    static String isItBlack(String colour) {
        return "black".equals(colour) ? "yes" : "no";
    }
}

public class CarCucumberTest2 {
    private String colour;
    private String actualAnswer;

    Car testCar = new Car("black","BMW","Series 1","CB15RPD",16,"RWD","Automatic",4);


    @Given("the car is red")
    public void theCarIsRed() {
        colour = "red";
    }

    @Given("the car is black")
    public void theCarIsBlack() {
        colour = "black";
    }

    @When("I ask if it is black")
    public void iAskIfItIsBlack() {
        actualAnswer = IsItBlack.isItBlack((colour));
    }

    @Then("I should be told {string}")
    public void iShouldBeTold(String expectedAnswer) {
        assertEquals(expectedAnswer, actualAnswer);
    }
}
