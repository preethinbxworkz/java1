class SwiggyRunner {
public static void main(String []swi){
	System.out.println("main started");
	String foodName= "bhel puri";
	double value = Swiggy.takingTheOrders(foodName);
	System.out.println("price of " + foodName + " is " +value);
	 System.out.println("Main ended");
}

}
	 