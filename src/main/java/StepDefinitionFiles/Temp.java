package StepDefinitionFiles;

public class Temp {
	public int i;
	Temp(int i){
		this.i=i;
	}
	public void calculator() {
		i= i*i;
	}
	public int calculatedValue() {
		return i;
	}	
}
