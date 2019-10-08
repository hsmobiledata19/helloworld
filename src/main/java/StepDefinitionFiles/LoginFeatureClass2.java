package StepDefinitionFiles;


import cucumber.api.java.en.Given;
import cucumber.api.java.en.Then;
import cucumber.api.java.en.When;

public class LoginFeatureClass2 {
	
	
	int i;
	String s;
	Temp tt;
	PicoContainerTestClass obj1;
	public LoginFeatureClass2(PicoContainerTestClass obj){
		obj1 = obj;
	}
	
	@Given("^Value is 4$")
	public void captureValue() {
		tt = new Temp(4);
	}
	
	@Then("^Value is 16$")
	public void printValue() {
		//tt.calculator();
		System.out.println("In " + this.getClass().getName() + " - Cube of 3 - " );
		System.out.println("Shared Pico Container Value should be 9" + obj1.getValue());
		//Assert.assertEquals(3,4);
	}
}
