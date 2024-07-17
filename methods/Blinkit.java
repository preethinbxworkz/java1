class Blinkit{
	public static double takeOrders(String foodName){
		if(foodName=="samosa") { return 45.00; }
		if(foodName=="avalakki") { return 50.00; }
		if(foodName=="puffed rice") { return 45.00; }
		if(foodName=="masala dosa") {return 70.00; }
		if(foodName=="plain dosa") { return 50.00; }
		if(foodName=="set dosa") { return 45.00; }
		if(foodName=="ghee pudi dosa") { return 80.00; }
		if(foodName=="ghee pudi idli") { return 50.00; }
		if(foodName=="vada") { return 30.00; }
		if(foodName=="onion dosa") { return 60.00; }
		if(foodName=="button idli") { return 40.00; }
		if(foodName=="pongal") { return 40.00; }
		if(foodName=="kichidi") { return 35.00; }
		if(foodName=="parota") { return 60.00;  }
		if(foodName=="shavege") { return 50.00; }
		else { System.out.println(foodName+ "is not found in the menu"); }
		return 0.0;
	}
}