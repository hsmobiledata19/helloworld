package StepDefinitionFiles;

import org.testng.Assert;

import cucumber.api.java.en.Given;

import cucumber.api.java.en.Then;
import cucumber.api.java.en.When;


public class LoginFeatureClass {
	
	
	int i;
	Temp t;
	PicoContainerTestClass obj1;
	public LoginFeatureClass(PicoContainerTestClass obj){
		obj1 = obj;
	}
	
	@Given("^Value is 3$")
	public void captureValue() {
	//	t = new Temp(3);
		i = 3;
		//Assert.assertEquals(true, false);
	}
	@When("^enter value in Calculator and Press ENTER$")
	public void calculateCube() {
		//t.calculator();
		i = i*i;
		System.out.println("\nIn CalculateCube Method");
		obj1.setValue(i);
	}
	@Then("^Value is 9$")
	public void printValue() {
		System.out.println("In " + this.getClass().getName() + "-  Cube of 3 - " + i);
		
		System.out.println(obj1.getValue());
		
	}
	
	@Given ("^Cube Calculator$")
	public void tests() {
			System.out.println("Calling BackgroundStarting Cube Calculator");
	}
	
	
	@Given("^Parameter is (\\d+)$")
	public void parameter_is(int arg1) throws Throwable {
    // Write code here that turns the phrase above into concrete actions
		i = arg1;
	}
	
}
