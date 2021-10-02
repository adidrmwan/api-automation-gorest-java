package co.gorest.automation.stepdefinitions;

import co.gorest.automation.Utils;
import co.gorest.automation.data.ApiData;
import co.gorest.automation.hooks.BaseSteps;
import io.cucumber.java.en.And;
import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import org.junit.Assert;

public class PostNewUserSteps extends BaseSteps {

    @Given("client send a request to the URL to post new user")
    public void iSendARequestToTheURLToPostNewUser() {
        Utils.generateFirstName();
        Object payload = "{\n" +
                "  \"name\": \"" + ApiData.getFirstName() + "\",\n" +
                "  \"gender\":  \"male\",\n" +
                "  \"email\":  \"" + ApiData.getFirstName() + "@mail.com" + "\",\n" +
                "  \"status\":  \"active\"\n" +
                "}";
        sendRequestWithBody("post", "v1/users", payload);
        ApiData.getResponse().prettyPrint();
    }

    @Then("response status should be {int}")
    public void theResponseWillReturnStatus(int statusCode) {
        Assert.assertEquals(statusCode, ApiData.getResponse().getStatusCode());
    }

    @And("response should have matching with request body")
    public void responseShouldHaveMatchingWithRequestBody() {
        Assert.assertEquals(ApiData.getFirstName(), ApiData.getResponse().path("data.name"));
        Assert.assertEquals(ApiData.getFirstName() + "@mail.com", ApiData.getResponse().path("data.email"));
        Assert.assertEquals("male", ApiData.getResponse().path("data.gender"));
        Assert.assertEquals("active", ApiData.getResponse().path("data.status"));
    }
}
