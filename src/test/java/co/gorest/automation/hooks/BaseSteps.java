package co.gorest.automation.hooks;

import co.gorest.automation.data.ApiData;
import io.github.cdimascio.dotenv.Dotenv;
import io.restassured.RestAssured;
import io.restassured.response.Response;
import io.restassured.specification.RequestSpecification;

public class BaseSteps {
    public static final Dotenv dotenv = Dotenv.load();
    private Response response;
    private RequestSpecification requestSpecification;

    public void setHeaders() {
        requestSpecification = RestAssured.given()
                .baseUri(dotenv.get("API_URL"))
                .header("Content-Type", ApiData.getContentType())
                .header("Authorization", "Bearer "+ dotenv.get("TOKEN"));
        ApiData.setRequestSpecification(requestSpecification);
    }

    public void sendRequest(String method, String endpoint) {
        setHeaders();
        switch (method.toLowerCase()) {
            case "get":
                response = ApiData.getRequestSpecification().get(endpoint);
                break;
            case "post":
                response = ApiData.getRequestSpecification().post(endpoint);
                break;
            case "put":
                response = ApiData.getRequestSpecification().put(endpoint);
                break;
            case "delete":
                response = ApiData.getRequestSpecification().delete(endpoint);
                break;
            case "patch":
                response = ApiData.getRequestSpecification().patch(endpoint);
                break;
            default:
        }
        ApiData.setResponse(response);
    }

    public void sendRequestWithBody(String method, String endpoint, Object body) {
        setHeaders();
        switch (method.toLowerCase()) {
            case "get":
                response = ApiData.getRequestSpecification().body(body).get(endpoint);
                break;
            case "post":
                response = ApiData.getRequestSpecification().body(body).log().all().post(endpoint);
                break;
            case "put":
                response = ApiData.getRequestSpecification().body(body).put(endpoint);
                break;
            case "delete":
                response = ApiData.getRequestSpecification().body(body).delete(endpoint);
                break;
            case "patch":
                response = ApiData.getRequestSpecification().body(body).patch(endpoint);
                break;
            default:
        }
        ApiData.setResponse(response);
    }
}
