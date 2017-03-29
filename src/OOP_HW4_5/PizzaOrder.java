package OOP_HW4_5;

public class PizzaOrder {
	private Pizza pizza1;
	private Pizza pizza2;
	private Pizza pizza3;
	
	public boolean setNumberPizzas(int numberPizzas){
		if (numberPizzas >= 1 && numberPizzas <= 3)
			return true;
		else 
			return false;
	}
	
	public void setPizza1(Pizza pizza){
		this.pizza1 = new Pizza(pizza.getSize(), pizza.getNumberOfCheese(), pizza.getNumberOfPepperoni(), pizza.getNumberOfHam());
	}
	
	public void setPizza2(Pizza pizza){
		this.pizza2 = new Pizza(pizza.getSize(), pizza.getNumberOfCheese(), pizza.getNumberOfPepperoni(), pizza.getNumberOfHam());
	}
	
	public void setPizza3(Pizza pizza){
		this.pizza3 = new Pizza(pizza.getSize(), pizza.getNumberOfCheese(), pizza.getNumberOfPepperoni(), pizza.getNumberOfHam());
	}
	
	public double calcTotal(){
		double total = 0.0;
		total += pizza1.calcCost();
		if(this.pizza2 != null)
			total += this.pizza2.calcCost();
		if(this.pizza3 != null)
			total += this.pizza3.calcCost();
		return total;
	}
}
