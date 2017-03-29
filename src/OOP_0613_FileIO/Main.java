package OOP_0613_FileIO;
import java.util.Enumeration;
import java.util.Properties;
import java.util.Scanner;



//javac src/Main.java
//執行： java -DmyName="123" bin/Main arg1
public class Main {
	//讓程式讀設定好的參數有三種方式
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		//從args收
		for(int i = 0; i < args.length; i++)
			System.out.printf("args[%d]=[%s]", i, args[i]);
		
		
		//透過std input
		Scanner scan = new Scanner(System.in);
		String buf = scan.next();
		System.out.println(buf);
		
		//透過property，這個VM在執行時定義的一些參數
		//定義一個參數 myname，值=123
		//VM透過property傳給program		
		//cmd執行的時候：java -Dmyname="你好" Main
		//就會被加進去property
		Properties props = System.getProperties();
		Enumeration p_names = props.propertyNames();
		while(p_names.hasMoreElements()){
			String p_name = (String)p_names.nextElement();
			String property = props.getProperty(p_name);
			System.out.printf("%s:%s\n", p_name, property);
		}
		
	}

}
