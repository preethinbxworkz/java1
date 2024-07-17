class FoodPandaRunner{
	
	public static void main(String[] fp)
	{
	 System.out.println("main started");
	 //double val = FoodPanda.gettingDetails("pulao");
	 //System.out.println(val);
		
	 String foodName ="pulao";
	 double value=FoodPanda.takeOrders(foodName);
	 System.out.println("price of " + fp[0] + " is " +value);
	 double value1 = FoodPanda.takeOrders("veg biriyani");
     System.out.println("price of " + fp[1] + " is "+value1);	 
     double value2 = FoodPanda.takeOrders("ghee rice");
	 System.out.println("price of " + fp[2] + " is "+value2);
     double value3 = FoodPanda.takeOrders("jeera rice");
	 System.out.println("price of  " + fp[3] + " is "+value3);
     double value4 = FoodPanda.takeOrders("kushka");
	 System.out.println("price of " + fp[4] + " is "+value4);
     double value5 = FoodPanda.takeOrders("biranji");
	 /*System.out.println("price of " + fp[0] + " is "+value5);
     double value6 = FoodPanda.takeOrders("vanjibath");
	 System.out.println("price of " + fp[0] + " is "+value6);
	 double value7 = FoodPanda.takeOrders("curd rice");
	 System.out.println("price of " + fp[0] + " is "+value7);
	 double value8 = FoodPanda.takeOrders("masala rice");
	 System.out.println("price of " + fp[0] + "is "+value8);
	 double value9 = FoodPanda.takeOrders("gobi rice");
	 System.out.println("price of " + fp[0] + " is "+value9);
	 double value10 = FoodPanda.takeOrders("lemon rice");
	 System.out.println("price of " + fp[0] + " is "+value10);
	 double value11 = FoodPanda.takeOrders("puliyogare");
	 System.out.println("price of " + fp[0] + " is "+value11);
	 double value12 = FoodPanda.takeOrders("jeera rice");
	 System.out.println("price of " + fp[0] + " is "+value12);
	 double value13 = FoodPanda.takeOrders("mango rice");
	 System.out.println("price of " + fp[0] + " is "+value13);
	 double value14 = FoodPanda.takeOrders("tomato bath");
	 System.out.println("price of  " + fp[0] + " is "+value14);	
	 System.out.println("main ended");*/
		
	}
}
