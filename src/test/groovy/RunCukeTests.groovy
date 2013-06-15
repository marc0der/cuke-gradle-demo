import cucumber.api.junit.Cucumber
import org.junit.runner.RunWith

@RunWith(Cucumber)
@Cucumber.Options(
    format=["pretty", "html:build/reports/cucumber"],
    features=["src/test/cucumber"],
    glue=["src/test/cucumber/steps"]
)
public class RunCukesTest { }
