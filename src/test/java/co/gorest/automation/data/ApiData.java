package co.gorest.automation.data;

import io.restassured.response.Response;
import io.restassured.specification.RequestSpecification;

public class ApiData {
    private static String contentType = "application/json";
    private static String apiUrl;
    private static Object body;
    private static RequestSpecification requestSpecification;
    private static Response response;
    private static String name;

    public static String getContentType() {
        return contentType;
    }

    public static void setContentType(String contentType) {
        ApiData.contentType = contentType;
    }

    public static String getApiUrl() {
        return apiUrl;
    }

    public static void setApiUrl(String apiUrl) {
        ApiData.apiUrl = apiUrl;
    }

    public static RequestSpecification getRequestSpecification() {
        return requestSpecification;
    }

    public static void setRequestSpecification(RequestSpecification requestSpecification) {
        ApiData.requestSpecification = requestSpecification;
    }

    public static Response getResponse() {
        return response;
    }

    public static void setResponse(Response response) {
        ApiData.response = response;
    }

    public static Object getBody() {
        return body;
    }

    public static void setBody(Object body) {
        ApiData.body = body;
    }

    public static String getName() {
        return name;
    }

    public static void setName(String name) {
        ApiData.name = name;
    }
}
