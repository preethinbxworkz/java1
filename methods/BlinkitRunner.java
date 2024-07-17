class BlinkitRunner{
	public static void main(String []b)
	{
		 System.out.println(" main started");
		 String foodName ="samosa";
		 double value=Blinkit.takeOrders(foodName);
		 System.out.println("price of " + foodName + " is " +value);
		 double value1 = Blinkit.takeOrders("avalakki");
		 System.out.println("price of  avalakki is "+value1);	 
		 double value2 = Blinkit.takeOrders("puffed rice");
		 System.out.println("price of puffed rice is "+value2);
		 double value3 = Blinkit.takeOrders("masala dosa");
		 System.out.println("price of masala dosa is "+value3);
		 double value4 = Blinkit.takeOrders("plain dosa");
		 System.out.println("price of plain dosa is "+value4);
		 double value5 = Blinkit.takeOrders("set dosa");
		 System.out.println("price of  set dosa is "+value5);
		 double value6 = Blinkit.takeOrders("ghee pudi dosa");
		 System.out.println("price of ghee pudi dosa is "+value6);
		 double value7 = Blinkit.takeOrders("ghee pudi idli");
		 System.out.println("price of ghee pudi idli is "+value7);
		 double value8 = Blinkit.takeOrders("vada");
		 System.out.println("price of vada is "+value8);
		 double value9 = Blinkit.takeOrders("onion dosa");
		 System.out.println("price of onion dosa is "+value9);
		 double value10 = Blinkit.takeOrders("button idli");
		 System.out.println("price of button idli is "+value10);
		 double value11 = Blinkit.takeOrders("pongal");
		 System.out.println("price of pongal is "+value11);
		 double value12 = Blinkit.takeOrders("kichidi");
		 System.out.println("price of kichidi is "+value12);
		 double value13 = Blinkit.takeOrders("parota");
		 System.out.println("price of parota is "+value13);
		 double value14 = Blinkit.takeOrders("shavege");
		 System.out.println("price of shavege is "+value14);
		 System.out.println(" main ended");
	}
}
		