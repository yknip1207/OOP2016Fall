package OOP_HW4_5;
	
public class Pizza {
	private String size;
	private int cheeseToppings;
	private int pepperoniToppings;
	private int hamToppings;
	
	Pizza(){
		this.size = "small";
		this.cheeseToppings = 1;
		this.pepperoniToppings = 1;
		this.hamToppings = 1;
	}
	
	Pizza(String s, int c, int p, int h){
		this.size = s;
		this.cheeseToppings = c;
		this.pepperoniToppings = p;
		this.hamToppings = h;
	}
	
	public String getSize() {
		return size;
	}

	public void setSize(String size) {
		this.size = size;
	}

	public int getNumberOfCheese() {
		return cheeseToppings;
	}

	public void setNumberOfCheese(int cheeseToppings) {
		this.cheeseToppings = cheeseToppings;
	}

	public int getNumberOfPepperoni() {
		return pepperoniToppings;
	}

	public void setNumberOfPepperoni(int pepperoniToppings) {
		this.pepperoniToppings = pepperoniToppings;
	}

	public int getNumberOfHam() {
		return hamToppings;
	}

	public void setNumberOfHam(int hamToppings) {
		this.hamToppings = hamToppings;
	}
	
	public double calcCost(){
		double sizeCost = 0.0;
		if(this.size == "small")
			sizeCost = 10.0;
		else if(this.size == "medium")
			sizeCost = 12.0;
		else
			sizeCost = 14.0;
		
		return  sizeCost + 2 * (this.cheeseToppings + this.pepperoniToppings + this.hamToppings);
	}
	
	public boolean equals(Pizza p){
		return (p != null && this.size.equals(p.size) && this.cheeseToppings == p.cheeseToppings && 
		        this.pepperoniToppings == p.pepperoniToppings && this.hamToppings == p.hamToppings);
	}
	public String toString(){
		return "size = " + this.size + ", numOfCheese = " + this.cheeseToppings + ", numOfPepperoni = " + this.pepperoniToppings + ", numOfHam = " + this.hamToppings;
	}
			 

}
