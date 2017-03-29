package OOP_HW1;
//
public class APlusB {
	public static int f(int a, int b){
		assert(b != 0);
		//如果錯誤的情況(布林值為false,就會跳錯誤訊息) 
		return a / b;
	}
	public static void main(String[] args){
		int a = 2;
		int b = 0;
		int c;
		c = f(a,b);
		System.out.println(c);
		
		
//		char b = 97;
//		double a = 97;
//		double c,d;
//		c = d = a;
//		
//		
//		Typetester tt = new Typetester();
//		tt.printType(a);
//		tt.printType(b);
//		tt.printType(a+b);
//		tt.printType(c);
//		tt.printType(d);
	}
	public static int plus(int a, int b){
		return a+b;
	}
	
	public static  class Typetester {
		void printType(short x) {
	        System.out.println(x + " is an short");
	    }
	    void printType(byte x) {
	        System.out.println(x + " is an byte");
	    }
	    void printType(int x) {
	        System.out.println(x + " is an int");
	    }
	    void printType(float x) {
	        System.out.println(x + " is an float");
	    }
	    void printType(double x) {
	        System.out.println(x + " is an double");
	    }
	    void printType(char x) {
	        System.out.println(x + " is an char");
	    }
	}
}
