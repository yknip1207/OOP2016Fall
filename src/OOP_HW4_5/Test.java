package OOP_HW4_5;

public class Test {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
//		Pizza pizza = new Pizza("large", 3, 1, 5);
//	    System.out.println(pizza.getSize());
//	    System.out.println(pizza.getNumberOfCheese());
//	    System.out.println(pizza.getNumberOfPepperoni());
//	    System.out.println(pizza.getNumberOfHam());
//	    
//	    
//	    pizza = new Pizza();
//	    pizza.setSize("medium");
//	    pizza.setNumberOfCheese(2);
//	    pizza.setNumberOfPepperoni(4);
//	    pizza.setNumberOfHam(1);
//	    System.out.println(pizza.getSize());
//	    System.out.println(pizza.getNumberOfCheese());
//	    System.out.println(pizza.getNumberOfPepperoni());
//	    System.out.println(pizza.getNumberOfHam());
//	    System.out.println(pizza.calcCost());
//	    System.out.println(pizza.toString());
//	    System.out.println(pizza.equals(new Pizza("large", 2, 4, 1)));
//	    System.out.println(pizza.equals(new Pizza()));
//	    System.out.println(pizza.equals(new Pizza("medium", 2, 4, 1)));
		
		
		Pizza pizza1 = new Pizza("large", 1, 0, 1);
	    Pizza pizza2 = new Pizza("medium", 2, 2, 5);
	    Pizza pizza3 = new Pizza();
	    PizzaOrder order = new PizzaOrder();
	    System.out.println(order.setNumberPizzas(5));
	    order.setNumberPizzas(2);
	    order.setPizza1(pizza1);
	    order.setPizza2(pizza2);
	    System.out.println(order.calcTotal());
	    order.setNumberPizzas(3);
	    order.setPizza1(pizza1);
	    order.setPizza2(pizza2);
	    order.setPizza3(pizza3);
	    System.out.println(order.calcTotal());
	}

}
