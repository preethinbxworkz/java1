class FiveStarChicken{
public static double takeOrders(String foodName){
		if(foodName.equals("chicken roll")) { return 80.00; }
		if(foodName.equalsIgnoreCase("veg roll")) { return 60.00; }
		if(foodName=="krisper roll") { return 110.00; }
		if(foodName=="Tandoori roll") {return 99.00; }
		if(foodName=="star burger") { return 80.00; }
		if(foodName=="hungry bird burger") { return 110.00; }
		if(foodName=="tandoor burger") { return 115.00; }
		if(foodName=="hot cripsy burger") { return 140.00; }
		if(foodName=="masala Fries") { return 110.00; }
		if(foodName=="chicken nuggets") { return 111.00; }
		if(foodName=="chicken fingers") { return 105.00; }
		if(foodName=="chicken chese shots") { return 156.00; }
		if(foodName=="chicken popcorn") { return 99.00; }
		if(foodName=="chicken strips") { return 115.00;  }
		else { System.out.println(foodName+ "is not found in the menu"); }
		return 0.0;
	}
}

/*double price=0.0;
if(foodName=="dds")  { price =65.00; }
return price;*/


