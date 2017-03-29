package OOP_0530_Exception;

public class HelloWorld {

	//method裡面要丟exception，宣告的地方要另外加註
	public static void m1_ex(int i) throws M1Exception{
		if (i <= 0){
			throw new M1Exception(i + "<0");
		}
		
	}
	
	//method不想自己catch，把遇到的exception往外丟，在calling method main中接收
	public static void m2_ex(int i) throws M2Exception, LargerThanTenException{
		if (i <= 0){
			throw new M2Exception(i + "<0");
		}
		if (i > 10){
			throw new LargerThanTenException();
		}
		
	}
	
	
	
	public static boolean m1(int i){
		if (i <= 0) return false;
		else
			return true;
	}
	
	public static boolean m2(int i){
		if (i <= 0) return false;
		else
			return true;
	}
	
	
	
	
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		//第一種方式
		try{
			if(!m1(0)){
				throw new Exception("m1 Exception!");
				//一旦throw exception，就跳掉了，m2也不會檢查
			}
			
			if(!m2(-1)){
				throw new Exception("m2 Exception!");
			}
		}
		catch(Exception e){
			//從catch接收端看發生了什麼事情
			System.out.println(e.getMessage());
			System.exit(1);
		}
		
		
		
		
		
		//第三種方式，把exception type分開做處理
		try{
			if(!m1(0)){
				throw new M1Exception("1");
				//一旦throw exception，就跳掉了，m2也不會檢查
			}
			
			if(!m2(-1)){
				throw new M2Exception("2");
			}
		}
		catch(M1Exception e){
			//從catch接收端看發生了什麼事情
			System.out.println(e.getMessage());
			System.exit(1);
		}
		catch(M2Exception e){
			//從catch接收端看發生了什麼事情
			System.out.println(e.getMessage());
			System.exit(1);
		}

		
		
		
		
		
		//第四種方式，把exception寫在method中
		try{
			m1_ex(0);
			m2_ex(-1);
		}catch(M1Exception e1){
			
		}catch(M2Exception e2){
			
		}catch(LargerThanTenException e3){
			
		}
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
//		---------------------Exception的繼承--------------
		//access modifier要更鬆，returned type要covariant，method name要一樣
		//E2是一種E1
		A a = new A();
		try{
			X x = a.m1(); //可以是X或所有X的subclass
			//a,m1()丟幾個exception，就要有幾種對應的catch block
		}catch(E1 e1){
		}
	}

}
