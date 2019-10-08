class A{
	int b;
	A(){}
	A(int i){
		
		this();
	}
	}

public class JavaTestCase {
	A object; 
	int i;
	static public  void main(String s[]) {
		
		String str = " JavaExperienced";
		JavaTestCase a = new JavaTestCase();
		System.out.println(" Variable " +a.i + " Instance Value  " + a.object);
		
	}
	
	public static String reverse(String rev) {
		String temp;
		
		if (rev.length()==1)
			return rev;
		temp = rev.charAt(rev.length()-1) + reverse(rev.substring(0, rev.length()-1));
		return temp;
		
	}
}
