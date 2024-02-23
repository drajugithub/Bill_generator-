package pizzaBillGenerator;

public class Pizza {

	private int price;
	private boolean veg;// if we want veg pizza means veg=true or else we want chicken pizza means veg = false
	private int extraCheesePrice = 100; 
	private int extraToppingPrice = 150; 
	private int backPack = 20; 
	private int basePizzaPrice; 
	private boolean isExtraCheesAdded=false;
	private boolean isExtraToppingsAdded=false;
	private boolean isOptedtoTakeAway =false;
	
	public Pizza(boolean veg) {
		super();
		this.veg = veg;
		if(this.veg = true)
		{
			this.price = 300;
		}
		else {
			this.price = 400;
		}
		basePizzaPrice = this.price;
	}
	
	public void addExtraCheese()
	{
		isExtraCheesAdded = true;
		this.price += extraCheesePrice;
	}
	
	public void addExtraToppings() {
		isExtraToppingsAdded = true;
		this.price += extraToppingPrice;
		
	}
	
	public void takeAway()
	{
		isOptedtoTakeAway = true;
		this.price += backPack;
	}
	
	public void getBill() {
		String bill = "";
		System.out.println("Pizza : " +basePizzaPrice);
		if(isExtraCheesAdded) {
			bill += "Extra cheese added : "+extraCheesePrice +"\n";
		}
		if(isExtraToppingsAdded) {
			bill += "Extra Topping added : "+extraToppingPrice +"\n";
		}
		if(isOptedtoTakeAway) {
			bill += "Take Away : "+backPack +"\n";
		}
		
		bill += "Bill:" +this.price+"\n";
		System.out.println(bill);
		
		
	}
	
}
