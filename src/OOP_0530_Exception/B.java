package OOP_0530_Exception;

public class B extends A {
	
	//若是A.m1() throw E1
	//B 的throw的Exception不能比A throw的還多，如果要throw的比A的還多，丟的Exception都要是A丟的subclass
	public Y m1() {
		return null;
	}
}
