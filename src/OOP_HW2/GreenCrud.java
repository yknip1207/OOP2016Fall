package OOP_HW2;

public class GreenCrud {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		GreenCrud greenCrud = new GreenCrud();
		System.out.println(greenCrud.calPopulation(5,15));
		System.out.println(greenCrud.calPopulation(10,17));
		System.out.println(greenCrud.calPopulation(3,20));
		

	}
	/***
	 * 
	 * @param initialSize
	 * @param day
	 * @return number of pound after days
	 */
	public static int calPopulation(int initialSize, int day){
		// return initial size if day <= 10
		if(day / 5 == 0 || day / 5 == 1)
			return initialSize;
		else
			return calPopulation(initialSize, day - 5) + calPopulation(initialSize, day - 10);
		
		
	}
}
