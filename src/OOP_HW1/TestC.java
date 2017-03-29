package OOP_HW1;
class D {
	private int x;

	public int getX() {
		return x;
	}

	public void setX(int x) {
		this.x = x;
	}
}
class C {
	private int x = 1;
	public int a = 122;
	public int v;
	public C(){}
	
	public C(int a, int v){
		this.a = a;
		this.v = v;
		this.m7();
	}
	public void m1(int a) {
		int ccc;
		
		a = 20;
		m5(200);
		m2();
	}
	public void m2(D r) {
		r = new D();
		r.setX(30);
	}
	public void m3(D r) {
		r.setX(30);
	}
	public void m2() {
		
	}
	public void m4() {
		this.x = 100000;
//		C.m5(1);
//		m5(1);
		
//		m1();
	}
	public void m5(int x) {
		System.out.println(x);
	}
	public void m6(C c){
		c.x = -1;
	}
	public void m7(){
		System.out.println(this.x);
	}
	public static void m8(float cc){
		System.out.println(cc + 11000000);
	}
}
class E{
	private static int count = 1;
	private int s;
	E(){
		count++;
		this.s = count;
	}
	
	E(int c){
		this.s = c;
		
	}
	public void g(){
		System.out.println(this.s);
	}
	public static void staticg(){}
}


public class TestC{
	public static void main(String[] argc){
		
		
		E.staticg();
		E e = new E();
		
		
		
		
		
		
		
		
		E e = new E(4);
		e.g();
		E ee = new E(6);
		ee.g();
		double x = Math.random();
		System.out.println(x);
		
		
//		C ref = new C();
//		int x = 10;
//		ref.m1(x);
//		System.out.println(x);
//		
//		D d = new D();
//		d.setX(20);
//		ref.m2(d);
//		System.out.println(d.getX());
//		
//		
//		
//		ref.m3(d);
//		System.out.println(d.getX());
//		
//		C.m4();
//		f();
		
		
	}
}

/*
呼叫m2之前 d到的obj x=20
呼叫m2之後：r本來也指導同一個obj，後來換指導另外一個新的obj(然後改值)，m2離開之後原本的obj裡面的x不會被改（所以x還是不變）
把d ref的

Java有pass by value of reference
java沒有pass by reference (C也沒有)
C++才有

m2()   r  (指向跟d一樣的地方)
--------------------------------------------
d   -------(指向一個heap)-------->   D  x:存20
x
ref
main()

*/