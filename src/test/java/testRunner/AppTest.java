package testRunner;
import org.junit.runner.RunWith;
import io.cucumber.junit.Cucumber;
import io.cucumber.testng.AbstractTestNGCucumberTests;
import io.cucumber.testng.CucumberOptions;
@RunWith(Cucumber.class)
@CucumberOptions(dryRun = false,
features = {"FeatureFiles"},
glue = {"stepDefination"},
tags="@suppliers, @customers" ,
//tags="@customers" ,
plugin = {"pretty","html:target/report/cucumber.html",
		"junit:target/report/cucumber.xml",
		"json:target/report/cucumber.json"})

public class AppTest extends AbstractTestNGCucumberTests {

}

/*
 for getting methods- 
 
 
package testRunner;
import io.cucumber.testng.AbstractTestNGCucumberTests;
import io.cucumber.testng.CucumberOptions;
@CucumberOptions(dryRun = true,features = {"FeatureFiles"})

*/