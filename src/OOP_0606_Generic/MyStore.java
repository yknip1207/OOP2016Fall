package OOP_0606_Generic;
//這種class就叫generic

public class MyStore<T> {
	private T data;
//	不能在裡面assign array size，因為你根本不知道它的大小
//	private T[] ary = new T[100];
	private T[] ary;
 	
	
	//傳進來的TYPE 是參數，根本不知道他是什麼所以不能new
	//private T data = new T();
	
	
	

	
	
	//constructor name不能有type parameter ，不用加 <T>
	//只有在呼叫constructor的時候才要加
	//eg: MyStore<String> d = new MyStore<String>("SDS");
	public MyStore(){
		
	}
	
	public MyStore(T data){
		this.data = data;
	}
	

	//裡面不能放T type array，要從外面塞進來
	public MyStore(T[] ary){
		this.ary = ary;
	}
	
	
	public T getData() {
		return data;
	}

	public void setData(T data) {
		this.data = data;
	}

}
