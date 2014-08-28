import cucumber.api.CucumberOptions
import cucumber.api.junit.Cucumber
import org.junit.runner.RunWith

@RunWith(Cucumber)
@CucumberOptions(
    format=["pretty", "html:build/reports/cucumber"],
	strict=true,
    features=["features"],
    glue=["src/test/steps"]
)
public class RunCukesTest { }
