package OOP_0516_InheritanceControlAccessPkg1;
import static OOP_0516_InheritanceControlAccessPkg2.A.sm3;
import static OOP_0516_InheritanceControlAccessPkg2.A.sm4;
import static OOP_0516_InheritanceControlAccessPkg2.A.sv3;
import static OOP_0516_InheritanceControlAccessPkg2.A.sv4;

import OOP_0516_InheritanceControlAccessPkg2.A;


//既不在同個package，也沒有繼承，不同access的方式有不同的access permission
public class E {
	private void f(){
		v1 = 1;
		v2 = 1;
		v3 = 1;
		v4 = 1;
		a.m1();
		a.m2();
		a.m3();
		a.m4();
		
		A a = new A();
		a.v1 = 1;
		a.v2 = 1;
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
