package runner;

import io.cucumber.testng.AbstractTestNGCucumberTests;
import io.cucumber.testng.CucumberOptions;
import org.testng.annotations.DataProvider;

@CucumberOptions(features = "src/test/resources/features",
        glue = {"stepDefinition"},
        plugin = {"pretty", "html:target/cucumber-reports", "json:target/cucumber.json"},
        monochrome = true,
        publish = true)
public class RunnerTest extends AbstractTestNGCucumberTests {
    @Override
    @DataProvider(parallel = true)
    public Object[][] scenarios() {
        return super.scenarios();
    }
}