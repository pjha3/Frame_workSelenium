package TestRun;

import org.junit.runner.RunWith;

import cucumber.api.CucumberOptions;
import cucumber.api.junit.Cucumber;

@RunWith(Cucumber.class)
@CucumberOptions(
		features="src/test/java/Features/actitimeEvents.feature",
		glue="src/test/java/TestSteps/",
		dryRun=false,
		monochrome=true,
		tags= {"@sanity"}
		
		)



public class RunnerTest {

}
