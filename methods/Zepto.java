class Zepto{
public static double takeOrders(String foodName){
	if(foodName=="plain maggie") { return 50.0; }
	if(foodName=="tea") { return 20.00; }
	if(foodName=="coffee") { return 25.00; }
	if(foodName=="badam milk") { return 40.00; }
	if(foodName=="egg maggie") { return 70.00; }
	if(foodName=="panner maggie") { return 80.00; }
	if(foodName=="cheese maggie") { return 85.00; }
	if(foodName=="corn maggie") { return 60.00; }
	if(foodName=="poori") { return 50.00; }
	if(foodName=="panner butter masala") { return 200.00; }
	if(foodName=="palak paner") { return 180.00; }
	if(foodName=="Kadai paner") { return 210.00; }
	if(foodName=="matar panner") { return 180.00; }
	if(foodName=="paner tikka") { return 210.00; }
	if(foodName=="malai kofta") { return 220.00; }
	else { System.out.println(foodName+ "not found"); }
	return 0.00;
} 
}