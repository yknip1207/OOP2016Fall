package OOP_0606_GenericsBound;

public class Test {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		G ref = new G();
		
		//若是<T extends A>，放A或B都可以，但有要求既要A且I，只有B符合
//		G<A> ref1 = new G<A>();
		G<B> ref2 = new G<B>();
		
		
		//若是<T extends I>，放C可以
//		G<C> ref3 = new G<C>();
		
		
		//generic class的參數，可以傳Interface，也可以傳abstract class，有的人根本沒辦法new，所以generic根本不能new
		J<String> j;
		
		
	}

}
