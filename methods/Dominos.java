class Dominos{
public static double takeOrders(String foodName){
		if(foodName=="cheese pizza") { return 245.00; }
		if(foodName=="margheritia") { return 250.00; }
		if(foodName=="double cheese margheritia") { return 245.00; }
		if(foodName=="farm house") {return 370.00; }
		if(foodName=="peppy panner ") { return 350.00; }
		if(foodName=="mexican green wave") { return 245.00; }
		if(foodName=="deluxe veggie") { return 180.00; }
		if(foodName=="veg extravaganza") { return 250.00; }
		if(foodName=="cheese n corn") { return 230.00; }
		if(foodName=="fresh veggie") { return 160.00; }
		if(foodName=="veggie paradise") { return 240.00; }
		if(foodName=="panner makhani") { return 340.00; }
		if(foodName=="tandoor paneer") { return 235.00; }
		if(foodName=="achari do pyaza") { return 360.00;  }
		if(foodName=="barbque") { return 200.00; }
		else { System.out.println(foodName+ "is not found in the menu"); }
		return 0.0;
	}
}



