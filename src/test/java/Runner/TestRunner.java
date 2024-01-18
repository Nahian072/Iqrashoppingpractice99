package Runner;
import io.cucumber.junit.Cucumber;
import io.cucumber.junit.CucumberOptions;
import org.junit.runner.RunWith;
//import cucumber.api.CucumberOptions;
//import cucumber.api.junit.Cucumber;

@RunWith(Cucumber.class)
@CucumberOptions(
        features = "C:\\MyWorkspace\\Iqrashoppingpractice99\\src\\test\\resources\\Features\\registration.feature"
        ,glue={"stepDefinition"}
)
public class TestRunner {

}
