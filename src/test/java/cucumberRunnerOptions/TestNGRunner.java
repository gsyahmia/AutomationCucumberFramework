package cucumberRunnerOptions;

import io.cucumber.testng.AbstractTestNGCucumberTests;
import io.cucumber.testng.CucumberOptions;

@CucumberOptions(features="src/test/java/features", glue="stepDefenitions")
public class TestNGRunner extends AbstractTestNGCucumberTests {

}
