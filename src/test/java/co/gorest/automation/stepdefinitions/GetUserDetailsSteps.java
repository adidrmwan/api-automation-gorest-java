package co.gorest.automation.stepdefinitions;

import co.gorest.automation.data.ApiData;
import co.gorest.automation.hooks.BaseSteps;
import io.cucumber.java.en.And;
import io.cucumber.java.en.When;
import org.junit.Assert;

public class GetUserDetailsSteps extends BaseSteps {

    @When("client send a request to the URL to get user details")
    public void iSendARequestToTheURLToGetUserDetails() {
        int id = ApiData.getResponse().path("data.id");
        ApiData.setIdUser(id);
        sendRequest("get", "v1/users/" + id);
        ApiData.getResponse().prettyPrint();
    }

    @And("response should have id matching with the request")
    public void responseShouldHaveIdMatchingWithTheRequest() {
        int actual = ApiData.getResponse().path("data.id");
        Assert.assertEquals(ApiData.getIdUser(), actual);
    }
}
