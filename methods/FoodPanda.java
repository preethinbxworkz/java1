class FoodPanda{
	public static double takeOrders (String foodName){
		if(foodName=="pulao") { return 70.00; }
		if(foodName=="veg biriyani") { return 120.00; }
		if(foodName =="ghee rice") { return 90.00; }
		if(foodName=="jeera rice") { return 85.0; }
		if(foodName=="kushka") { return 100.00; }
		if(foodName=="biranji") { return 110.00; }
		if(foodName=="vanjibath") { return 65.00; }
		if(foodName=="curd rice") { return 60.00; }
		if(foodName=="masala rice") { return 65.00; }
		if(foodName=="gobi rice") { return 70.00; }
		if(foodName=="lemon rice")  { return 40.00; }
		if(foodName=="puliyogare") { return 45.00; }
		if(foodName=="mango rice") { return 60.00; }
		if(foodName=="tomato bath")
		{
			return 780.00; 
		}
		else { System.out.println(foodName+ " not found"); }
		//else if(!foodName) {
		//System.out.println("foodName is not found in the menu"); 
		//}
		
		return 0.00;
	}
}
		