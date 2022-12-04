import io.cucumber.junit.Cucumber;
import io.cucumber.junit.CucumberOptions;
import org.junit.runner.RunWith;

@RunWith(Cucumber.class)
@CucumberOptions(
        features = "src/test/java/features/addAddress.feature",
        glue = "steps",
        plugin = {"pretty"},
        publish = true
)



public class TestRunner {
}
