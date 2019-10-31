package Runner;

import org.junit.runner.RunWith;

import cucumber.api.CucumberOptions;
import cucumber.api.junit.Cucumber;

@RunWith(Cucumber.class)
@CucumberOptions(features="C:\\Users\\training_h2a.06.17\\Desktop\\cucumber\\Features\\casestudy1.feature",glue= {"stepdefinations"}
,plugin= {"pretty","html:target/cucumber-html-report"})

public class casestudy1runner {
	

}
