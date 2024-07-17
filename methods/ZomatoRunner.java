class ZomatoRunner{
public static void main(String z[]){

    System.out.println("Main started");  
	//String foodName ="Pizza";
		
	 double value = Zomato.takeOrders("Pizza");
	 System.out.println("price of pizza is "+ value);
	 double value1 = Zomato.takeOrders("Burger");
     System.out.println("price of burger is "+value1);	 
     double value2 = Zomato.takeOrders("Roti Curry");
	 System.out.println("price of roti curry is "+value2);
     double value3 = Zomato.takeOrders("Ice Cream");
	 System.out.println("price of ice cream is "+value3);
     double value4 = Zomato.takeOrders("Pani Puri");
	 System.out.println("price of pani puri is "+value4);
     double value5 = Zomato.takeOrders("Samosa");
	 System.out.println("price of  samosa is "+value5);
     double value6 = Zomato.takeOrders("Masala Dosa");
	 System.out.println("price of masal dosa  is "+value6);
	 double value7 = Zomato.takeOrders("Gobi Manchuri");
	 System.out.println("price of gobi is "+value7);
	 double value8 = Zomato.takeOrders("Sweet Pongal");
	 System.out.println("price of sweet pongal is "+value8);
	 double value9 = Zomato.takeOrders("Halwa");
	 System.out.println("price of halwa is "+value9);
	 double value10 = Zomato.takeOrders("Paneer Roti");
	 System.out.println("price of panner n roti is "+value10);
	 double value11 = Zomato.takeOrders("Cold Drinks");
	 System.out.println("price of cold drinks is "+value11);
	 double value12 = Zomato.takeOrders("Pasta");
	 System.out.println("price of pasat is "+value12);
	 double value13 = Zomato.takeOrders("Vada Pav");
	 System.out.println("price of vada paav is "+value13);
	 double value14 = Zomato.takeOrders("Bel Puri");
	 System.out.println("price of   bel puri is "+value14);
	 
	   
	  System.out.println("Main ended");
}
}