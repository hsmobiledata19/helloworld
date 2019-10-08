package StepDefinitionFiles;

public class PicoContainerTestClass {

	private int i;
	public PicoContainerTestClass(){
		if(i==0)
			i=10;
	}
	public void setValue(int i) {
		this.i = i;
	}
	
	public int getValue() {
		return i;
	}
}
