package org.ctsqa.salesforce;


import cucumber.api.CucumberOptions;
import cucumber.api.junit.Cucumber;
import org.junit.runner.RunWith;

@RunWith(Cucumber.class)
@CucumberOptions(
        plugin = {"pretty"},
//        features = "src/test/resources/features/*"
        features= "src/test/resources/features/test.feature"
)
public class runner {

}
