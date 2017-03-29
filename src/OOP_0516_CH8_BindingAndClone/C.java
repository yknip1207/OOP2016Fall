package OOP_0516_CH8_BindingAndClone;

public class C {
	private A data;

	//直接把reference送出去跟送進來是危險的
//	public A getData() {
//		return data;
//	}
//
//	public void setData(A data) {
//		this.data = data;
//	}
	
	
	public A getData() {
		return new A(data);
	}
	
	//如果傳一個 A a = new B();   把這個a傳進setData近來會有錯，沒辦法知道到底人家會傳什麼進來，會叫錯constructor
	//用clone可以解決，clone呼叫自己的constructor
	//用virtual method invocation來解決叫錯constructor的問題
	public void setData(A data) {
		this.data = new A(data);
	}
	
	

	
	
}
