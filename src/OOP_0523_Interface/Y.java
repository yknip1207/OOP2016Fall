package OOP_0523_Interface;

public class Y extends X {
	//Y繼承X，其override method的returned type要遵守covariant(繼承包含extends跟implement)
	//returned type是abstractclass -> subclass method的returned type是concrete class也合法
	
	
	public C m1(){
		return null;
	}

}
