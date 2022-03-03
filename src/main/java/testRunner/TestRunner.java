package testRunner;

import org.junit.runner.RunWith;

import io.cucumber.datatable.CucumberDataTableException;


	@RunWith(Cucumber.class)
	@CucumberOptions(
			features = "C:\\Users\\Bhushan\\eclipse-workspace\\CucumberTest\\src\\main\\java\\feturesFile\\taggingTest.feature",         //Feature file path
			glue = {"stepDefination"},											// Step defination package name
			plugin = {"pretty", "html:target/cucumber_test-output", "json:target/cucumber-json-report.json"},  // To generate json and xml and html report
			monochrome = true,													// To see proper format output on console
			dryRun = false,										// To check mapping between feature file keywords and step defination class methods
			tags = "@Functional or @UI"			// Which type of test we have to perform
			//tags = ""                          // To execute all tags test cases
			)


public class TestRunner {

}
