package OOP_HW1;

public class A {
	
	//	一開始new出來的時候_x預設是0, 然後變成1，如果其他人有再改就會變成其他值
	private int _x = 1;
	private int y=0;
	public A(){
		
	}
	public void setX(int x){
		
	}
	
	public int getX(){
		return this._x;
	}
	
	//沒有side effect，
	public int add(int x, int y){
		x = 40;
		y = 30;
		return x +y;
	}
}
