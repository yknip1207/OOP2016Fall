package OOP_0523;

public abstract class A {
	
	private int x;
	
	
	public int getX() {
		return x;
	}

	public void setX(int x) {
		this.x = x;
	}

	//	constructor沒有繼承，但是subclass的會呼叫super的不帶參數的那個constructor
	public A(){
		System.out.println("A:A()");
	}
	
	
	
	
	public  void m1(){
		System.out.println("A.m1()");
	}
	
	//這樣default是public
	abstract void m0();
	public abstract void m2();
	
//	abstract method是為了繼承用的，不能final
	
//	
}
