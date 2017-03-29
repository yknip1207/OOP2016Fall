package OOP_HW1;
//import tw.edu.ntu.im.chrisyknip.MyDate;

public class TestA {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
	
		
		A ref = new A();
		ref.setX(10);
		
		int a = 10;
		int b = 100;
		int c = ref.add(a, b);
		
		
		
		
		
		
		
//		MyDate md = new MyDate();
//		
////		md.day = 1;
////		md.month = 2;
////		md.year = 2016;
////		
////		MyDate md2 = new MyDate();
////		
////		md2.day = 1;
////		md2.month = 2;
////		md2.year = 2016;
////		md2.setDay(12);
////		System.out.println(md2.getDay());
//		
//		String a= "                            The patient is a 40-year-old female with complaints of headache and dizziness";
//		int x = a.indexOf("40-year-old");
////		System.out.println(a.indexOf("40-year-old", x+));
//		
//		String[] aa = a.split(" ");
//		int num_of_space = a.length() - a.replace(" ", "").length();  //aa.length-1
//		System.out.println(num_of_space);
//		int fromIndex = a.indexOf(aa[0]);
//		for(int i = 0; i <= aa.length-1;i++){
//			String word = aa[i];
//			int sIndex, eIndex;
//			if(!word.equals("")){
//				if(i == 1){
//					sIndex = a.indexOf(word, fromIndex);
//				}else{
//					sIndex = a.indexOf(word, fromIndex);
//				}
//				eIndex = sIndex + word.length();
//				fromIndex = eIndex + 1;
//				
//				System.out.print((sIndex+1) + "/" + (eIndex+1) + " {"+word+"} " );
//				System.out.println(a.substring(sIndex,eIndex));
//			}
//			
//			
//		}
//		
//		
//		
//		
		
	}

	public static int[] a(String w, String ph, String prev){
		int[] result = {0,0};
		int sIndex = ph.indexOf(w, prev.length());
		int eIndex = sIndex + w.length();
		prev += w;
		return result;
	} 
}
