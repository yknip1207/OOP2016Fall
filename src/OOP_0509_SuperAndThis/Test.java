package OOP_0509_SuperAndThis;

public class Test {
	
	public static void f1(A ref){
		ref.m1();
	}
	
	
	
	
	//B extends A
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		A ref1 = new A();
//		ref1.m1();
		B ref2 = new B();
		//如果B裡面的m1()沒有override，預設就會跑A.m1()
//		ref2.m1();
		
		
		//因為 B 是一種 A，所以A能做的B都能做，可以拿比較高層的reference指向比較低層的物件
		// A type的 reference能夠指向所有繼承他的class產生的物件
		//以A的角度來看待物件，eg:用Employee的ref來指向Manager的物件
		//假設原先在Employee當中有 getDetail()會印出薪水，如果不希望Manager在call getDetail()時印薪水，Manager中的getDetail()就要override
		//這樣才不會有安全疑慮
		// Employee e = new Manager();
		
		
		//polymorphism: A type的reference可以指向subclass B type的物件
		
		//決定ref可以使用哪些函數時，根據ref的type
		//compile time type：看reference
		A ref3 = new B();
		//所有ref. 能用的method/variable都是A的
		
		
		
		
		
		//runtime type:看object type
		//不管是A或是A的subclass都可以丟進去f1裡面，未來產生的A的subclass都可以當f1的參數
		f1(new A());
		//丟了A的subclass的B物件進去，如果B裡面有定義m1()的話，在f1裡面所呼叫的應該是B.m1() 
		//f1裡面使用的是離class B最近的m1，自己有定義用自己的，沒定義就用parent class的
		f1(new B());
		
		
		//override的method: 除了signature(method name, param list)要和super.method一樣
		//其回傳值： if 是基本資料型態：type也要跟super.method()的回傳型態一模一樣
		//		   if 是回傳class RtnA: return type可以跟super.method()的回傳型態一模一樣(RtnA)，也可以是RtnA的subclass
		
		
		//只要他們都是Employee的subclass，他們都可以放在一個宣告為Employee的array
		//Employee [] staff = new Employee[1024]; 
		//staff[0] = new Manager();
		//staff[1] = new Employee();
		//staff[2] = new Engineer();
		//某個function如下：
		//public void printStaffName(Employee[] staff){
		//	for(int i = 0; i < staff.length(); i++){
		//		staff[i].printName();
		//	}
		//}
		
		//就算未來新的extend 的class丟進去f1裡面都可以正常執行，eg: CEO extends Manager
		//staff[3] = new CEO();
		//call printStaffName也可以正常運作，達到code reuse
		
		
		
		
		
		
		System.out.println("--------------------------Casting object-------------------------");
		//所有class預設繼承java.lang.Object
		//B既是instance of A 也是 instance of B
		//用B type的reference指向一個物件，可以使用B的method
		//D type是 A,B,D的instance，但並非C type的 instance
		
		//A(m1) <- B(m1,m2) <- D(m4)
		//      <- C(m1,m3)
		A[] ary = new A[4];
		ary[0] = new A();
		ary[1] = new B();
		ary[2] = new C();
		ary[3] = new D();
		
		
		for(int i = 0; i < ary.length; i++){
			if(ary[i] instanceof A){
				System.out.println(i + " th is instance of A" );
				
			}
			if(ary[i] instanceof B){
				System.out.println(i + " th is instance of B" );
				B tmp = (B) ary[i];
				tmp.m1();
				tmp.m2();
			}
			if(ary[i] instanceof C){
				System.out.println(i + " th is instance of C" );
				C tmp = (C) ary[i];
				tmp.m1();
				tmp.m3();
			}
			if(ary[i] instanceof D){
				System.out.println(i + " th is instance of D" );
				D tmp = (D) ary[i];
				tmp.m1();
				tmp.m2();
				tmp.m4();
			}
			
		}
		
		
		//如果A裡面有m1()，其subclass C裡面也有個m1(int)，帶參數的這個是overload
		//subclass 不會繼承parent class的constructor，其他的method, variable都會繼承
		//但是進去自己的constructor時，預設會進去parent的constructor
		
		//final variable:不能被修改eg:身分證字號
		//final method :不能被Override
		//final class:不能被繼承
		
		
		
		//abstract method:使有宣告沒有實作，在class diagram裡面以斜體表示)
		//凡是有abstract method的class就是abstract class(但是裡面未必所有method都是abstract)
		//abstract class的constructor不能拿來生成物件，是拿來給subclass(concrete)用的
		
		
		//全部都是abstract method，而且沒有constructor，不屬於class: interface
		//Java解決多重繼承(一個class繼承多個parent class)的問題，用interface：可以implement多個interface
		
		
		//parent class(abstract)的abstract method可以在child class裡面override
		
		
		
		
		
		
		
		
		
	}

}
