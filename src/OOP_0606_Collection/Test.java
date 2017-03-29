package OOP_0606_Collection;
import java.util.*;

public class Test {
// Y繼承X，Z繼承Y
	public static void main(String[] args) {
		X xx = new Y();
		
		
		
		
		A ref = new A();
		//Y extends X, Z extends Y 
		List<X> l1 = new ArrayList<X>();
		List<Y> l2 = new ArrayList<Y>();
		List<Z> l3 = new ArrayList<Z>();
		
		//傳進來的type必須是Y或Y的subclass
		ref.m1(l1);
		ref.m1(l2);
		ref.m1(l3);
		
		
		//傳進來的type必須是Y或Y的parent class
		ref.m2(l1);
		ref.m2(l2);
		ref.m2(l3);
		
		
		
		
		
		
		
		
		// TODO Auto-generated method stub
		Collection r1;
		//collection，List，Set都是interface，不能直接new
		List<String> r21 = new ArrayList<String>();
		List<X> r22 = new Vector();
		List r23 = new LinkedList();
		
		
		
		Set r31 = new HashSet();
		Set r32 = new TreeSet();
		
		SortedSet r4 = new TreeSet();
		
	}

}
