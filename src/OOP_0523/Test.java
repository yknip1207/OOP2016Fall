package OOP_0523;
import java.lang.reflect.Method;

public class Test {
	public static void main(String[] args){
		//reference型別可以是任何type（即便是abstract也行）
		
//		A是abstract class，不能new A
//		A r1 = new A();
		
//		B是一種A，B有時做method，可以new B()
		A r= new B();
		//
		r.m1();
		r.m2();
		System.out.println("-----");
		for(Method m: r.getClass().getMethods())
			System.out.println(m);
//		A r= new B();
//		以上的寫法compile時用A的type來檢查，如果A中沒有某個method，而B中extends了這個
//		r.method()會出錯  -->因為A並沒有這個東西
//		除非強制轉型成B
		
		
	}
	

}
