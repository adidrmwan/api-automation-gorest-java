package co.gorest.automation.data;

import io.restassured.response.Response;
import io.restassured.specification.RequestSpecification;

public class ApiData {
    private static String contentType = "application/json";
    private static RequestSpecification requestSpecification;
    private static Response response;
    private static String firstName;
    private static String lastName;
    private static int idUser;

    public static String getContentType() {
        return contentType;
    }

    public static void setContentType(String contentType) {
        ApiData.contentType = contentType;
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

    public static String getFirstName() {
        return firstName;
    }

    public static void setFirstName(String firstName) {
        ApiData.firstName = firstName;
    }

    public static String getLastName() {
        return lastName;
    }

    public static void setLastName(String lastName) {
        ApiData.lastName = lastName;
    }

    public static int getIdUser() {
        return idUser;
    }

    public static void setIdUser(int idUser) {
        ApiData.idUser = idUser;
    }
}
