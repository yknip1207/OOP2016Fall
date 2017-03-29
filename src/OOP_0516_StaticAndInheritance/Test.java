package OOP_0516_StaticAndInheritance;

public class Test {
	//B extends A
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		A r1 = new A();
		A r2 = new B();
		r1.m1();
		r2.m1();   //non-static method，是看object type(late binding) -> B type， call B物件.m1()
		//r2.bself_method();  //不能用A type的 reference去用 B裡面新定義的method
		
		A.sm1();
		B.sm1();
		
		r1.sm1();
		r2.sm1();	//static method（沒有所謂object，不做late binding），看reference type -> A type，所以call A.sm1()
	}

}
