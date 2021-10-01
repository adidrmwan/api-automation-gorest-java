package co.gorest.automation.stepdefinitions;

import co.gorest.automation.Utils;
import co.gorest.automation.data.ApiData;
import co.gorest.automation.hooks.BaseSteps;
import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import org.junit.Assert;

public class PostNewUserSteps extends BaseSteps {

    @Given("I send a request to the URL to post new user")
    public void iSendARequestToTheURLToPostNewUser() {
        Utils.generateRandomName();
        Object payload = "{\n" +
                "  \"name\": \"" + ApiData.getName() + "\",\n" +
                "  \"gender\":  \"male\",\n" +
                "  \"email\":  \"" + ApiData.getName() + "@mail.com" + "\",\n" +
                "  \"status\":  \"active\"\n" +
                "}";
        sendRequestWithBody("post", "v1/users", payload);
        ApiData.getResponse().prettyPrint();
    }

    @Then("the response will return status {int}")
    public void theResponseWillReturnStatus(int statusCode) {
        Assert.assertEquals(statusCode, ApiData.getResponse().getStatusCode());
    }
}
