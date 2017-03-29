package OOP_HW6;

public class SimpleArrayList {
	private Integer[] ary;
	SimpleArrayList(){
		this.ary = new Integer[0];
	}
	
	SimpleArrayList(int size){
		this.ary = new Integer[size];
		for(int i = 0; i < this.ary.length; i++){
			this.ary[i] = new Integer(0);
		}
	}
	
	
	public void add(Integer i){
		Integer[] newAry = new Integer[this.ary.length + 1];
		//來源陣列，起始index，目的陣列，起始index，複製長度
		System.arraycopy(this.ary, 0, newAry, 0, this.ary.length);
		if(i == null)
			newAry[newAry.length - 1] = i;
		else
			newAry[newAry.length - 1] = new Integer(i.intValue());
		this.ary = newAry;
	}
	
	
	public Integer get(int i){
		if(this.ary.length == 0 || i >= this.ary.length || i < 0)
			return null;
		else
			return this.ary[i];
	}
	public Integer set(int i, Integer element){
		Integer oldVal = null;
		if(i < this.ary.length && i >= 0){
			oldVal = this.ary[i]; 
			this.ary[i] = element;
		}
		return oldVal;
	}
	
//	public String toString(){
//		String result = "";
//		for (Integer i: this.ary){
//			result += String.valueOf(i) + " ";
//		} 
//		return result;
//	}
	
	public boolean remove(int i){
		boolean result = false;
		if(i < this.ary.length && i >= 0 && this.ary[i] != null){
			Integer[] aAry = new Integer[i];
			Integer[] bAry = new Integer[this.ary.length - i -1];
			int aLen = aAry.length;
			int bLen = bAry.length;
			System.arraycopy(this.ary, 0, aAry, 0, aLen);
			System.arraycopy(this.ary, i + 1, bAry, 0, bLen);
			
			Integer[] newAry = new Integer[aLen + bLen];
			System.arraycopy(aAry, 0, newAry, 0, aLen);
			System.arraycopy(bAry, 0, newAry, aLen, bLen);
			this.ary = newAry;
			result = true;
		}
		return result;
	}
	
	public void clear(){
		this.ary = new Integer[0];
	}
	
//	public void print(){
//		for(Integer s: this.ary){
//			System.out.print(s + " ");
//		}
//		System.out.println();
//	}
	
	
	public int size(){
		return this.ary.length;
	}
	
	public boolean retainAll(SimpleArrayList l1){
		boolean hasChanged = false;
		for(int i = 0; i < this.ary.length; i++){
			for(int j = 0; j < l1.ary.length; j++){
				if(this.ary[i].equals(l1.ary[j]))
					break;
				else{
					if(j == l1.ary.length - 1){
						this.remove(i);
						hasChanged = true;
					}
				}
			}
		}
		return hasChanged;
	}
	
	
//	public static void main(String[] args) {
//		// TODO Auto-generated method stub
//		System.out.println("=== TASK 1 ===");
//		SimpleArrayList list = new SimpleArrayList();
//		System.out.println(list.get(0));
//
//		System.out.println("=== TASK 2 ===");
//		list.add(2);
//		list.add(5);
//		list.add(8);
//		list.add(1);
//		list.add(12);
//		System.out.println(list.get(2));
//
//		System.out.println("=== TASK 3 ===");
//		System.out.println(list.get(5));
//
//		System.out.println("=== TASK 4 ===");
//		System.out.println(list.set(2, 100));
//
//		System.out.println("=== TASK 5 ===");
//		System.out.println(list.get(2));
//
//		System.out.println("=== TASK 6 ===");
//		System.out.println(list.set(5, 100));
//
//		System.out.println("=== TASK 7 ===");	
//		System.out.println(list.remove(2));
//	
//		System.out.println("=== TASK 8 ===");
//		System.out.println(list.get(2));
//
//		System.out.println("=== TASK 9 ===");
//		System.out.println(list.remove(2));
//
//		System.out.println("=== TASK 10 ===");
//		System.out.println(list.get(2));
//
//		System.out.println("=== TASK 11 ===");
//		System.out.println(list.get(3));
//
//		System.out.println("=== TASK 12 ===");
//		list.clear();
//		System.out.println(list.get(0));
//
//		System.out.println("=== TASK 13 ===");
//		SimpleArrayList list2 = new SimpleArrayList(5);
//		System.out.println(list2.get(3));
//		list2.print();
//
//		System.out.println("=== TASK 14 ===");
//		System.out.println(list2.get(9));
//
//		System.out.println("=== TASK 15 ===");
//		for (int i = 0; i < list2.size(); i++) {
//			System.out.println(list2.set(i, i));
//		}
//		for (int i = 0; i < 5; i++) {
//			list.add(i);
//		}
//		System.out.println(list.retainAll(list2));
//
//		System.out.println("=== TASK 16 ===");
//		for (int i = 0; i < list.size(); i++) {
//			System.out.println(list.get(i));
//		}
//
//		System.out.println("=== TASK 17 ===");
//		System.out.println(list2.remove(0));
//		System.out.println(list2.remove(2));
//		System.out.println(list.retainAll(list2));
//		
//		System.out.println("=== TASK 18 ===");
//		for (int i = 0; i < list.size(); i++) {
//			System.out.println(list.get(i));
//		}
//
//		System.out.println("=== TASK 19 ===");
//		System.out.println(list.set(1, null));
//		System.out.println(list.remove(1));
//
//		System.out.println("=== TASK 20 ===");
//		for (int i = 0; i < list.size(); i++) {
//			System.out.println(list.get(i));
//		}
//
//		System.out.println("=== TASK 21 ===");
//		System.out.println(list.set(1, 123));
//
//		System.out.println("=== TASK 22 ===");
//		for (int i = 0; i < list.size(); i++) {
//			System.out.println(list.get(i));
//		}
//
//		System.out.println("=== TASK 23 ===");
//		System.out.println(list.remove(1));
//
//		System.out.println("=== TASK 24 ===");
//		for (int i = 0; i < list.size(); i++) {
//			System.out.println(list.get(i));
//		}
//
//		System.out.println("=== TASK 25 ===");
//		list.add(null);
//		System.out.println(list.remove(2));
//
//		System.out.println("=== TASK 26 ===");
//		for (int i = 0; i < list.size(); i++) {
//			System.out.println(list.get(i));
//		}
//	}

}
