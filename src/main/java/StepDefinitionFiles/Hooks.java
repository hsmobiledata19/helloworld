package StepDefinitionFiles;

import cucumber.api.java.After;
import cucumber.api.java.Before;

public class Hooks {
	//@Before ("@First")
	public void startHook() {
		System.out.println(" Starting Hook before calling method");
	}
	
	
	//@After
	public void closeHook() {
		System.out.println(" Starting Hook after calling method");
	}


}
