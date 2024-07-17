class Swiggy{
	public static double takingTheOrders( String foodName){
		if(foodName=="paav Bhaji"){ return 60.00; }
		if(foodName=="butter paav bhaji") { return 70.00; }
		if(foodName=="cheese paav bhaji") { return 100.00; }
		if(foodName=="cheese vada paav") { return 50.00; }
		if(foodName=="paneer paav bhaji")  { return 80.00; }
		if(foodName == "paneer vada paav") { return 60.00; }
		if(foodName== "egg curry") { return 40.00;}
		if(foodName=="bhel puri") { return 40.00; }
		if(foodName=="dahi puri") { return 45.00; }
		if(foodName=="pani puri") { return 30.00; }
		if(foodName=="masala puri") { return 40.00; }
		if(foodName=="aloo puri") { return 50.00; }
		if(foodName == "tikki puri") { return 55.00; }
		if(foodName=="samosa chat") { return 35.00; }
		if(foodName=="churmuri") { return 50.00; }
		else { System.out.println(foodName+ "is not found in the menu"); }
		return 0.0;
	}
}
		