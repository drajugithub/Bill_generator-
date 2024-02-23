package pizzaBillGenerator;

public class main {

	public static void main(String[] args) {
		boolean veg;
		Pizza basePizza = new Pizza(veg = true);
		basePizza.addExtraToppings();
		basePizza.addExtraCheese();
		basePizza.takeAway();
		basePizza.getBill();
		//

		// DeluxPizza dp = new DeluxPizza(veg = false);
		// dp.takeAway();
		// dp.getBill();
	}

}
