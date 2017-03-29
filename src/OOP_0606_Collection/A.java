package OOP_0606_Collection;
import java.util.List;

public class A {
	//吃進來的List其中元素的type可以是任何繼承A type的class
	
	
	//A裡面有一個普通的method，不是generic method，只是說可以傳一個generic class進來（可以傳Y或Y的subclass)
	//generic method:  public <T> m1(xxxx){...}
	public void m1(List<? extends Y> l){
		
	}
	
	//一般在宣告generic class的時候，如果type parameter的class有繼承關係的話<>裡面只能用extends
	//wild card：在函數的裡面<>可以用 super，這是例外
	public void m2(List<? super Y> l){
		
	}
	
	public static <T> T g(T[] a){return null;}
	
	
	
	//generic method，可以傳List進來
	//T用Z帶入的話，List就只能用 Z type的List
	//T用Y帶入的話，List就只能用 Y type的List
	public <T extends Y> void m3(List<T> l){
		
	}
}
