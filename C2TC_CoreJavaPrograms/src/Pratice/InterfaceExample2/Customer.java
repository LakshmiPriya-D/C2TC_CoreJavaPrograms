package Pratice.InterfaceExample2;

public class Customer {
	 public static void main(String[] args) {
		 Dmart c1 = new FoodCort();
	     Dmart c2 = new Trends();
	
	     System.out.println("Customer visiting FoodCart:");
	     c1.viewOffers();
	     c1.buyProduct("Burger", 99.0);
	
	     System.out.println("\nCustomer visiting Trends:");
	     c2.viewOffers();
	     c2.buyProduct("T-Shirt", 499.0);
 }

}
