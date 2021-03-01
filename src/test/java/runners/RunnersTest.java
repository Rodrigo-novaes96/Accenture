package runners;


import cucumber.api.junit.Cucumber;
import org.junit.runner.RunWith;

import cucumber.api.CucumberOptions;
import cucumber.api.SnippetType;


@RunWith(Cucumber.class)
@CucumberOptions(
		plugin = {"pretty", "html:target/evidencias/html/evidence-html", "json:target/evidencias/json/evidencia.json"},
		snippets = SnippetType.CAMELCASE,
		monochrome = true,
		strict = true,
		features = {"classpath:features"},
		glue = {"classpath:steps"},
		tags = {"@Cot"}
		)
public class RunnersTest {

}
