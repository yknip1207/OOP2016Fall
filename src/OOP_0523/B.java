package OOP_0523;

public class B extends A {

//	如果沒寫@Override：是視為重新改寫parent class中繼承過來的method
//	如果寫了@Override：就是implement abstract class的abstract method
	
	@Override
	public void m2() {
		// TODO Auto-generated method stub
		System.out.println("B:m2()");
	}

	@Override
	void m0() {
		// TODO Auto-generated method stub
		
	}
	
	void c(){}
	
	
	//在這裏super.m1()就是this.m1()

}
