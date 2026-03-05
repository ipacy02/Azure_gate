//package runner;
//
//import io.cucumber.junit.Cucumber;
//import io.cucumber.junit.CucumberOptions;
//import org.junit.runner.RunWith;
//
//@RunWith(Cucumber.class)
//@CucumberOptions(
//        features = "src/test/resources/feature",
//        glue = "stepdefinition "
//
//)
//public class TestRunner {
//
//}


package runner;

import io.cucumber.junit.Cucumber;
import io.cucumber.junit.CucumberOptions;
import org.junit.runner.RunWith;

@RunWith(Cucumber.class)
@CucumberOptions(
        features = "classpath:feature",
        tags = "@scenario1",
        glue = "classpath:stepdefinition",
        plugin = {"pretty", "html:target/cucumber-report.html"},
        monochrome = false
)
public class TestRunner {
}

