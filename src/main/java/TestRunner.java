//import org.junit.runner.RunWith;


import java.io.File;

import org.testng.annotations.AfterClass;

import com.cucumber.listener.Reporter;

import cucumber.api.CucumberOptions;
//import cucumber.api.junit.Cucumber;
import cucumber.api.testng.AbstractTestNGCucumberTests;

//@RunWith(Cucumber.class)

@CucumberOptions(
		features="Feature"
		,glue= {"StepDefinitionFiles"}
		,tags = {"@FuntionalTests,~@First"}
		//,format = {"pretty", "html:target/Destination"}
		,format = { "pretty","html:target/site/cucumber-pretty","json:target/cucumber.json" },
		plugin = { "com.cucumber.listener.ExtentCucumberFormatter:target/cucumber-reports/report12.html"},
		monochrome=false
		
		)
public class TestRunner extends AbstractTestNGCucumberTests {

	@AfterClass
	public static void writeExtentReport() {
		Reporter.loadXMLConfig(new File(ConfigFileReader.getReportConfigPath()));
		
	}
}

