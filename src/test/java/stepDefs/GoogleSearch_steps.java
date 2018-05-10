package stepDefs;

import org.junit.Assert;

import cucumber.api.java.en.Then;
import cucumber.api.java.en.When;

public class GoogleSearch_steps {


@When("^user goes to \"([^\"]*)\"$")
public void user_goes_to(String arg1) throws Throwable {
	
    Assert.fail();
}

@Then("^user searches for \"([^\"]*)\"$")
public void user_searches_for(String arg1) throws Throwable {
    
}

@Then("^user should see same keyword in the result$")
public void user_should_see_same_keyword_in_the_result() throws Throwable {
    
}
}
