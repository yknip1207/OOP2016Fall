package OOP_0523_Interface;

public interface I {
public static final int constA = 10;
	
	
	//不能在這裏實作，預設不必寫abstract(本來就是abstract)，就算不寫public也是public(本來就是要給人實作的)
	public void m1();
	
	public void m2();
	
	
	//method傳進去參數回傳什麼都在interface中定義好
	//理論上document應該是寫在interface(合約)裡面
	public int sum(int x, int y);
}
