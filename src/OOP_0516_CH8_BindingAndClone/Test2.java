package OOP_0516_CH8_BindingAndClone;

public class Test2 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		A a = new A();
		C c = new C();
		c.setData(a);
		
		
		//會有問題
		A aa = new B();
		c.setData(a);
		
		
	}

}
