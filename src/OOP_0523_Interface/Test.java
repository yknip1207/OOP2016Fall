package OOP_0523_Interface;

//J繼承I，class A又實作I，class B實作J，C繼承A又實作J
public class Test {
	
	//class中的variable，可以是class，也可以是abstract class，甚至是interface
	private D data;
	private static D data2;
	public A m1(){
		return null;
	}
	
	
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		//poly:透過一個type去指到有實體有實作的物件，virtual method invocation
		I r1 = new A();
		//virtual method invocation
		r1.m1();
		
		//interface是沒有實體的，這樣不合法
		//A r1 = new I()
		
		
		
		
		
		
		
		
		
	}

}
