package OOP_HW1;

public class Testt {
	private static int serial = 0;
	public int x1;
	private int x2;
	public static int x3;
	private static int x4;
	public final int x5 = 5;
	private final int x6;
	public static final int x7 ;
	private static final int x8 ;
	
	//final的var，一定要先給值(不管static or not都可以用explicit initialization)
	//    如果是non-static，也可以在constructor中initialize
	//    如果是static，因為不能在constructor中給初始值，只能在static block
	
	//class在load進來的時候就跑一次static load
	//default value(0/false/null/...) -> explicit initialization -> static block	
	static {
		x7 = 7;
		x8 = 8;
	}
	
	public int getSerial(){
		return serial;
	}
	
	//每次建立物件的時候都會一次
	//default value -> explicit initialization -> constructor有另外從外面帶值進來
	public Testt(int x6){
		this.x6 = x6;
//		x4 =4;
		serial++;
		
	}
	
	public void m1(){
		x1 = 1;
		x2 = 1;
		x3 = 1;
		x4 = 1;
//		x5 = 1;
//		x6 = 1;
//		x7 = 1;
//		x8 = 1;
	}
	public void A(){
		System.out.println(this.x4);
	}	
	public static void main(String[] args){
//		Testt t = new Testt();
//		t.A();
		
		byte b = 1;
		short s = 1;
		int i = 1;
		long l = 1;
		
		s = 1000;
		b = 100;
		l = 100;
		
	}
}

