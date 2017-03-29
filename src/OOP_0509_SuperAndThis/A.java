package OOP_0509_SuperAndThis;
//如果加上final：該class不能被繼承
public class A {
	public A(){
		System.out.println("A()");
	}
	public int d1;
	
	
	//method 一旦加上final：就不能被其他subclass給override了
	public void m1(){
		System.out.println("A:m1()");
	}
	
	void pm(){
		System.out.println("A.private method");
	}
}
