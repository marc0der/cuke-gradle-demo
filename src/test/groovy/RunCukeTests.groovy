import cucumber.api.junit.Cucumber
import org.junit.runner.RunWith

@RunWith(Cucumber)
@Cucumber.Options(
    format=["pretty", "html:build/reports/cucumber"],
	strict=true,
    features=["src/test/cucumber"],
    glue=["src/test/steps"]
)
public class RunCukesTest { }
