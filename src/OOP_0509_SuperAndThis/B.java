package OOP_0509_SuperAndThis;

public class B extends A{
	public B(){
//		super();	//叫parent class的constructor(如果什麼都不寫會預設幫call super的不帶任何參數的constructor，所以parent class A裡面一定要存在一個不帶參數的constructor，否則會有compile error)
		this(10);	//this constructor 跟super的constructor(super())，要call的時候只能擇一，而且要call的時候只能擺第一行(要是都沒寫，預設就會call super())
					//因為任何constructor如果沒有寫任何東西，預設會自動幫你呼叫不帶參數的super()
	}
	public B(int x){
		this.d1 = x;
	}
	
	
	//當自己宣告了一個和parent class一樣的 variable，自己的叫做this.d1, parent的叫做super.d1
	public int d1; 
	public int d2;
	@Override
	public void m1(){
		super.m1();
		System.out.println("B:m1()");
		
	}
	public void m2(){
		super.d1 = 100;
		this.d1 = 13;
		System.out.println("this is m2 of B");
	}
	
	protected void pm(){
		System.out.println("B.pm");
	}
}
