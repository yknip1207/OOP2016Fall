package OOP_0516_InheritanceControlAccessPkg1;
import OOP_0516_InheritanceControlAccessPkg2.*;

//繼承A但不在同個package
public class D extends A {
	private void f(){
		//這些都是繼承A來的
		v1 = 1;
		v2 = 1; 	//protected 必須直接access才能拿得到，
		v3 = 1;
		v4 = 1;
		m1();
		m2();
		m3();
		m4();
		
		A a = new A();  //當成外部object的用法，這些a.xxx都是直接用A的，不牽涉繼承
		a.v1 = 1;
		a.v2 = 1;	//透過reference拿不到
		a.v3 = 1;
		a.v4 = 1;
		a.m1();
		a.m2();
		a.m3();
		a.m4();
		
		sv1 = 1;
		sv2 = 1;
		sv3 = 1;
		sv4 = 1;
		sm1();
		sm2();
		sm3();
		sm4();
		A.sv1 = 1;
		A.sv2 = 1;
		A.sv3 = 1;
		A.sv4 = 1;
		A.sm1();
		A.sm2();
		A.sm3();
		A.sm4();
		
	}
}
