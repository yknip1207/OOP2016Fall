package OOP_0509_SuperAndThis;

public class TestParentConstructor {

	public static void main(String[] args) {
		// 任何constructor如果沒有寫任何東西，會自動幫你加上不帶參數的super()
		// Java會自動幫你加的東西：this，default constructor，super的constructor
		B b = new B();
		b.pm();
	}

}
