package OOP_0606_GenericMethod;

public class Main {
	public static void main(String[] args){
		A ref = new A();
		ref.<String>genericMethod("input");
	}
}
