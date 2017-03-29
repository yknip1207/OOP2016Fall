package OOP_0516_CH8_BindingAndClone;

public class A {
	private int x;
	public A(){
		
	}
	
	public A(A o){
		this.x = o.x;
	}
	
	
	
	//本來應該回傳object，因為clone是從Object繼承過來的，returned type是co-variant(returned type A也是繼承Object)
	public A clone(){
		return new A(this);
	}
	
	//clone是protected，在繼承的class中才能用，
	//假設另一個獨立的class D，不能直接 D d = new D();  d.clone();   (除非有override)    
	//但是class D裡面可以呼叫clone
	

	public void m1(){
		System.out.println("A:m1()");
	}
	public static void sm1(){
		System.out.println("A:sm1()");
	}
	
	public static void sm2(){
		System.out.println("A:sm2()");
	}
}
