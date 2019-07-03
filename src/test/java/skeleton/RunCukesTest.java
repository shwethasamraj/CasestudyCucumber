package skeleton;

import cucumber.api.CucumberOptions;
import cucumber.api.junit.Cucumber;
import org.junit.runner.RunWith;

@RunWith(Cucumber.class)
@CucumberOptions(features={"src/test/resources/Case1.feature","src/test/resources/Case2.feature","src/test/resources/Case3.feature","src/test/resources/Case4.feature"},glue="skeleton",plugin="json:target/jsonreport.json")
public class RunCukesTest {
}
