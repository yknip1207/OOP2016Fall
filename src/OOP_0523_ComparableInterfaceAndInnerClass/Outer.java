package OOP_0523_ComparableInterfaceAndInnerClass;

public class Outer {
	private int d1;
	
	private void m(){
		System.out.println("Outer.m()");
	}
	public void m1(){
		d1 = 10;
		Inner2 b = new Inner2();
		b.d2 = 30;
		b.m2();
	}
	public void m0(){
		System.out.println("Outer.m0()");
	}
	
	
//	Outer中宣告了Inner2
	//外部可以使用裡面的class method
	public class Inner2{
		private int d2;
		public void m2(){
			d1 = 20;
			d2 = 30;
		}
		public void m(){}
		//可以呼叫outer的method
		private void im(){
			m();	//INNER2自己的m()
			Outer.this.m();
			Outer.this.m0();
		}
	}
	
	public static class Inner3{
		private int d3;
		public void m3(){}
	}
	
	
	public  class Inner4{
		private  int d4;
		public void m4(){}
	}
	
	
	
	
	
	
	//如果m2沒有被執行，x根本看不到
	//x只在這個method裡面用(臨時變數)，一旦method考完就可以丟了
	public void m2(){
		class XX{}
			
	}
	
	//static看不到non-static的成員，只能看到static的成員
	public static void m3(){
		Inner3 x = new Inner3();
//		Inner2 y = new Inner2();	//illegal
	}
	
	
	public static void main(String[] args ){
		Outer a = new Outer();
		
		//因為Inner2是non-static，要使Inner2之前，Outer物件一定要生成出來
		Outer.Inner2 b = a.new Inner2();
		b.im();
		
		//class中的static class的呼叫，只能透過這樣（因為Inner3是static）
		Outer.Inner3 c = new Outer.Inner3();
		
		
	
	}
}
