package testRunner;

import cucumber.api.CucumberOptions;
import cucumber.api.SnippetType;
import cucumber.api.testng.AbstractTestNGCucumberTests;

@CucumberOptions(
		features = {"src/test/java/features/login.feature"},
		dryRun = false,
		monochrome = true,
		snippets = SnippetType.CAMELCASE,
		glue = {"stepdefinations","hooks"},
		plugin= {"pretty", "html:CucumberReports",
				"json:reports/result.json",
				"junit:reports/result.xml"
				}
		//tags = {"@reg and @smoke"}
		
		
		)
public class Runner extends AbstractTestNGCucumberTests {

}
