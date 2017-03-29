package OOP_0606_Generic;

public class MyArray {
	Object[] data;
	
	//後面塞進來的要跟前面的是一樣的class或是他的subclass
	//eg:看加進來的是不是 A class，就要在add裡面寫死，很麻煩
	//generic:可以允許把型別當成參數傳進來
	public void add(Object o){
		if(o instanceof C){
			
		}
	}
}
