package co.gorest.automation;

import co.gorest.automation.data.ApiData;
import com.github.javafaker.Faker;

public class Utils {
    private static final Faker faker = new Faker();

    public static void generateRandomName() {
        String fullName = faker.name().firstName();
        ApiData.setName(fullName);
    }
}
