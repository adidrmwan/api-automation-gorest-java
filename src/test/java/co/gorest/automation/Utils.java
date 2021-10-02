package co.gorest.automation;

import co.gorest.automation.data.ApiData;
import com.github.javafaker.Faker;

public class Utils {
    private static final Faker faker = new Faker();

    public static void generateFirstName() {
        String firstName = faker.name().firstName();
        ApiData.setFirstName(firstName);
    }

    public static void generatelastName() {
        String lastName = faker.name().lastName();
        ApiData.setLastName(lastName);
    }
}
