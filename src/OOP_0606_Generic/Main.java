package OOP_0606_Generic;
import java.util.ArrayList;

public class Main {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int[] a1;
		C[] a2;
		
		
		//以下這些都不能new
		AC[] a3;
		I[] a4;
		N[] a5;
		
		//不能new但可以直接用
		N ref = N.A;
		
		
		ArrayList<Integer> a11;
		ArrayList<C> a12;
		ArrayList<AC> a13;
		ArrayList<I> a14;
		ArrayList<N> a15;
		
		
		//用array跟array list的比較
		String[] sa1 = new String[20];
		sa1[0] = "abc";
		sa1[1] = sa1[0];
		
		for(String a: sa1)
			System.out.println(a);
		
		System.out.println("---------" + sa1.length);
		
		ArrayList<String> sa2 = new ArrayList<String>(20);
		sa2.add("ABC");
		for(String b: sa2)
			System.out.println(b);
		
		
		System.out.println("---------" + sa2.size());
		
		
		
		
		//沒有指定預設就是object為元素，這樣大家都可以用
		ArrayList xx = new ArrayList();
		xx.add(new Object());
		xx.add(new A());
		
		ArrayList<C> gg = new ArrayList<C>();
		gg.add(new C());
		gg.add(new A());
		
		
		
		
		
		ArrayList<String> a;
		MyStore<String> b = new MyStore<String>();
		b.setData("ABCC");
		
		MyStore<C> c = new MyStore<C>();
		
		//可以放class C也可以放 C的subclass A
		c.setData(new A());
		c.setData(new C());
		
		
		MyStore<I> vv = new MyStore<I>();
		vv.setData(new A());
		
		
		
		MyStore<String> d = new MyStore<String>("SDS");
		MyStore<A> f = new MyStore<A>(new A[30] );
		
		
	}

}
