package OOP_0606_GenericsBound;

//T必須是A或A的subclass
//type parameter的bound(限制)，一定要是A或A的subclass
//public class G<T extends A & I> {


public class G<T extends A & I> {
	
	T data;
//	因為T有繼承A跟I，A裡面有定義過的method一定可以用
	
}
