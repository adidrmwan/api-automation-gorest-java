package co.gorest.automation.stepdefinitions;

import co.gorest.automation.Utils;
import co.gorest.automation.data.ApiData;
import co.gorest.automation.hooks.BaseSteps;
import io.cucumber.java.en.And;
import io.cucumber.java.en.When;
import org.junit.Assert;

public class PutUserSteps extends BaseSteps {
    @When("client send a request to the URL to update existing user")
    public void iSendARequestToTheURLToUpdateExistingUser() {
        Utils.generatelastName();
        Object payload = "{\n" +
                "  \"name\": \"" + ApiData.getLastName() + "\",\n" +
                "  \"email\":  \"" + ApiData.getLastName() + "@mail.com" + "\",\n" +
                "  \"status\":  \"active\"\n" +
                "}";
        int id = ApiData.getResponse().path("data.id");
        sendRequestWithBody("put", "v1/users/" + id, payload);
        ApiData.getResponse().prettyPrint();
    }

    @And("response should have name matching with the request")
    public void responseShouldHaveNameMatchingWithTheRequest() {
        Assert.assertEquals(ApiData.getLastName(), ApiData.getResponse().path("data.name"));
    }

    @And("response should have email matching with the request")
    public void responseShouldHaveEmailMatchingWithTheRequest() {
        Assert.assertEquals(ApiData.getLastName() + "@mail.com", ApiData.getResponse().path("data.email"));
    }
}
