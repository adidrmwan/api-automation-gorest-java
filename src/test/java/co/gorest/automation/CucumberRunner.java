package co.gorest.automation;

import io.cucumber.junit.Cucumber;
import io.cucumber.junit.CucumberOptions;
import org.junit.runner.RunWith;

@RunWith(Cucumber.class)
@CucumberOptions(
        stepNotifications = true,
        plugin = {
                "pretty",
                "json:build/cucumber-report.json",
                "html:build/result"
        },
        features = {"src/test/resources/features"},
        glue = {"co.gorest.automation"}
)
public class CucumberRunner {

}