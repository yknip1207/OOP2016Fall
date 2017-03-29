package OOP_0516_CH8_BindingAndClone;
import java.util.ArrayList;
import java.util.List;

public class Test {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		A a = new B();
		//m1什麼時候才能決定？執行的時候才能決定(late bind，執行的時候實際綁到誰身上)
		
		a.getClass().getMethods();
		System.out.println("---------------");
		//reflective:反射自己的資訊
		//a.getClass() -> 回傳B
		//.getMethods() ->吐出各種B的method
		
		
		
		
		//可以呼叫什麼方法, 看 reference type，A裡面沒有m2()，所以不能呼叫
		//實際用哪個版本, 看 object type，a的object type是B，所以m1()是叫B的
		a.m1();   //virtual method invocation，表面上看起來呼叫到A，但是虛擬的抓到B的m1
		//a.m2();
		
		//比較early binding: private, static，在compile時就能夠決定
		
		
		//static method --> early binding(看reference type)
		A.sm1();
		B.sm1();	//有繼承m1
		
		
		//兩種說法：static method沒有override
		//        (課本寫法)或是static其實有override，但並非late binding（是在compile time就決定是哪個type）
		
		
		
		List<Integer> y = new ArrayList<Integer>();		
		
		
		//強制轉型
		((B)a).m1();
		((B)a).m2();
		
		A x = new A();
		((B)x).m1();
		((B)x).m2();
	}

}
