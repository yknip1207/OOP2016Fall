package OOP_HW1;

public class IsLeapYear {

//	public static void main(String[] args) {
//		// TODO Auto-generated method stub
//		IsLeapYear isy = new IsLeapYear();
//		System.out.println(isy.determine(2040));
//		System.out.println(isy.determine(2013));
//		System.out.println(isy.determine(2100));
//	}
	public Boolean determine(int year){
		Boolean isLeap = false;
		if(year % 400 == 0){
			isLeap = true;
		} 
		else if(year % 4 == 0 && year % 100 != 0){
			isLeap = true;
		}
		return isLeap;
	}

}
