class ZeptoRunner{
public static void main(String z[]){

     System.out.println("Main started"); 
	 String foodName ="plain maggie";
	 double value = Zepto.takeOrders(foodName);
	 //System.out.println(value);	 
	 System.out.println("price of " + foodName + " is " +value);
	 double value1 = Zepto.takeOrders("tea");
     System.out.println("price of tea is "+value1);	 
     double value2 = Zepto.takeOrders("coffee");
	 System.out.println("price of coffee is "+value2);
     double value3 = Zepto.takeOrders("badam milk");
	 System.out.println("price of badam milk is "+value3);
     double value4 = Zepto.takeOrders("egg maggie");
	 System.out.println("price of egg maggie is "+value4);
     double value5 = Zepto.takeOrders("panner maggie");
	 System.out.println("price of  panner maggie is "+value5);
     double value6 = Zepto.takeOrders("cheese maggie");
	 System.out.println("price of cheese maggie is "+value6);
	 double value7 = Zepto.takeOrders("corn maggie");
	 System.out.println("price of corn maggie is "+value7);
	 double value8 = Zepto.takeOrders("poori");
	 System.out.println("price of   poori is "+value8);
	 double value9 = Zepto.takeOrders("panner butter masala");
	 System.out.println("price of panner butter masala is "+value9);
	 double value10 = Zepto.takeOrders("palak paner");
	 System.out.println("price of palak paner is "+value10);
	 double value11 = Zepto.takeOrders("Kadai paner");
	 System.out.println("price of Kadai paner is "+value11);
	 double value12 = Zepto.takeOrders("matar panner");
	 System.out.println("price of matar panner is "+value12);
	 double value13 = Zepto.takeOrders("paner tikka");
	 System.out.println("price of paner tikka is "+value13);
	 double value14 = Zepto.takeOrders("malai kofta");
	 System.out.println("price of malai kofta is "+value14);
	 System.out.println("Main ended");
}
}