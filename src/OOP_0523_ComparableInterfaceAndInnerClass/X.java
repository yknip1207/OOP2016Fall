package OOP_0523_ComparableInterfaceAndInnerClass;

public class X extends AC implements I, J {
//	多重繼承下的問題：(Java不允許多重繼承，但是用interface來逼近多重繼承的概念)
	//只要是單一繼承就不會有type inconsistence的問題
	//type inconsistent（多重繼承下一樣的method）
	//兩個interface同時被implement，但他們彼此return type不同
	
	//I的m1要return void，但J的m1要reutrn int會衝突
	//implementI.m1()但對J.m1()是incompatable
//	@Override
//	public void m1() {
//		// TODO Auto-generated method stub
//
//	}
	
	
	//多重繼承下的問題：
	//type inconsistence：X繼承的abstract class和實作的interface有不同return type但同名的inheritanced method
	//那到底回傳值要是什麼？
	@Override
	public void m1() {
		// TODO Auto-generated method stub

	}


	 
}
