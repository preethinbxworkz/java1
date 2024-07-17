class DominosRunner{
	public static void main(String []d)
	{
		 System.out.println(" main started");
		 String foodName ="cheese pizza";
		 double val=Dominos.takeOrders(foodName);
		 System.out.println("price of " + foodName + " is " +val);
		 double value1 = Dominos.takeOrders("margheritia");
		 System.out.println("price of margheritia is "+value1);	 
		 double value2 = Dominos.takeOrders("double cheese margheritia");
		 System.out.println("price of double cheese margheritia is "+value2);
		 double value3 = Dominos.takeOrders("farm house");
		 System.out.println("price of farm house is "+value3);
		 double value4 = Dominos.takeOrders("peppy panner ");
		 System.out.println("price of peppy panner is "+value4);
		 double value5 = Dominos.takeOrders("mexican green wave");
		 System.out.println("price of mexican green wave is "+value5);
		 double value6 = Dominos.takeOrders("deluxe veggie");
		 System.out.println("price of deluxe veggie is "+value6);
		 double value7 = Dominos.takeOrders("veg extravaganza");
		 System.out.println("price of veg extravaganza is "+value7);
		 double value8 = Dominos.takeOrders("cheese n corn");
		 System.out.println("price of  cheese n corn is "+value8);
		 double value9 = Dominos.takeOrders("fresh veggie");
		 System.out.println("price of fresh veggie is "+value9);
		 double value10 = Dominos.takeOrders("veggie paradise");
		 System.out.println("price of veggie paradise is "+value10);
		 double value11 = Dominos.takeOrders("panner makhani");
		 System.out.println("price of panner makhan is "+value11);
		 double value12 = Dominos.takeOrders("tandoor paneer");
		 System.out.println("price of  tandoor paneer is "+value12);
		 double value13 = Dominos.takeOrders("achari do pyaza");
		 System.out.println("price of achari do pyaza is "+value13);
		 double value14 = Dominos.takeOrders("barbque");
		 System.out.println("price of barbque is "+value14);
		 System.out.println(" main ended");
	}
}
		