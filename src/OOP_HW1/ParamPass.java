package OOP_HW1;

class 雞{
	public 蛋 孵蛋(){
		return new 蛋();
	}
}
class 蛋{
	public 雞 生雞(){
		return new 雞();
	}
}

public class ParamPass {
	public static void m1(){
		
	}
//	public static void main(String[] args) {
//		// TODO Auto-generated method stub
//		
//		int i = 1;
//		System.out.println(1 + " " +i++);
//		System.out.println(2 + " " +i);
//		
//		
//		i = 1;
//		System.out.println(3 + " " +  ++i);
//		System.out.println(4 + " " +  i);
//		i = 1;
//		System.out.println("======");
//		int j = 7;
//		int k = j++;
//		
//		System.out.println(j + " " + k);
//		
//		
//		j = 7;
//		k = ++j; 
//		System.out.println(j + " " + k);
//			
//		
//		雞 c1 = new 雞();
//		蛋 e1 = c1.孵蛋();
//		雞 c2 = e1.生雞();
//		
//		
//		new 雞().孵蛋().生雞().孵蛋();
//	}
	public static void main(String[] args){
		int n = 2;
		int x = 2*(++n);
		int y = 2*(n++);
		System.out.println(x);
		System.out.println(y);
	}
//		int i, j;
//OUTER:		for ( i =0; i< 5 ;i++){
//			
//INNER:			for(j = 0;j<5;j++){	
//					System.out.printf("i=%d, j=%d, i+j=%d\n", i, j, i+j);
//					if(i+j > 3){
//						
//						System.out.printf("i=%d, j=%d, i+j=%d > 3, break!\n", i, j, i+j);
//						break INNER;
//					}
//			}
//		}
//
//	}

}
