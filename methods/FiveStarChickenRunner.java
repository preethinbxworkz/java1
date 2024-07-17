class FiveStarChickenRunner{
	public static void main(String []d)
	{
	 System.out.println("main started");
	 String foodName ="veg roll";
	 double val=FiveStarChicken.takeOrders(foodName);
	 System.out.println("price of " + foodName + " is " +val);
	 double value1 = FiveStarChicken.takeOrders("chicken roll");
     System.out.println("price of chicken roll is "+value1);	 
     double value2 = FiveStarChicken.takeOrders("krisper roll");
	 System.out.println("price of krisper roll is "+value2);
     double value3 = FiveStarChicken.takeOrders("Tandoori roll");
	 System.out.println("price of Tandoori roll  is "+value3);
     double value4 = FiveStarChicken.takeOrders("star burger");
	 System.out.println("price of  star burger is "+value4);
     double value5 = FiveStarChicken.takeOrders("hungry bird burger");
	 System.out.println("price of hungry bird burger is "+value5);
     double value6 = FiveStarChicken.takeOrders("tandoor burger");
	 System.out.println("price of tandoor burger is "+value6);
	 double value7 = FiveStarChicken.takeOrders("hot cripsy burger");
	 System.out.println("price of hot cripsy burger is "+value7);
	 double value8 = FiveStarChicken.takeOrders("masala Fries");
	 System.out.println("price of  masala Fries is "+value8);
	 double value9 = FiveStarChicken.takeOrders("chicken nuggets");
	 System.out.println("price of chicken nuggets is "+value9);
	 double value10 = FiveStarChicken.takeOrders("chicken fingers");
	 System.out.println("price of chicken fingers  is "+value10);
	 double value11 = FiveStarChicken.takeOrders("chicken chese shots");
	 System.out.println("price of chicken chese shots is "+value11);
	 double value12 = FiveStarChicken.takeOrders("chicken popcorn");
	 System.out.println("price of chicken popcorn is "+value12);
	 double value13 = FiveStarChicken.takeOrders("chicken strips");
	 System.out.println("price of chicken strips is "+value13);
	 System.out.println(" main ended");
	}
}
		