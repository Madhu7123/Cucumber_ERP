package testRunner;

import org.junit.runner.RunWith;

import io.cucumber.junit.Cucumber;

import io.cucumber.testng.AbstractTestNGCucumberTests;
import io.cucumber.testng.CucumberOptions;
@RunWith(Cucumber.class)
@CucumberOptions(dryRun = true,features = {"FeatureFiles"})

public class AppTest extends AbstractTestNGCucumberTests {

}
