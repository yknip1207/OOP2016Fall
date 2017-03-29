package OOP_0606_GenericsBound;

//generic class 可以是C, AC, I
//所吃的參數type parameter:可以是C, AC, I
//共有3x3種可能

//public interface J<T>{
public class J <T>{
	T x;
	J(){}
	J(T s){
		this.x = s;
	}
//public abstract class J<T>{
}
