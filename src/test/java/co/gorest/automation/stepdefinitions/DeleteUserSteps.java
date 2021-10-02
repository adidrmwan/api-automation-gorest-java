package co.gorest.automation.stepdefinitions;

import co.gorest.automation.data.ApiData;
import co.gorest.automation.hooks.BaseSteps;
import io.cucumber.java.en.When;

public class DeleteUserSteps extends BaseSteps {
    @When("client send a request to the URL to delete existing user")
    public void iSendARequestToTheURLToDeleteExistingUser() {
        int id = ApiData.getResponse().path("data.id");
        sendRequest("delete", "v1/users/" + id);
        ApiData.getResponse().prettyPrint();
    }
}
