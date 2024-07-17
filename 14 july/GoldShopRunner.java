class GoldShopRunner{
public static void main(String gshop[]){
	boolean shop = GoldShop.addGoldItem("Malabar");
	System.out.println(shop);
	GoldShop.addGoldItem("Joyulukas");
	System.out.println(shop);	
	GoldShop.addGoldItem("Bhima");
	System.out.println(shop);
	GoldShop.addGoldItem("Sri Sai");
	System.out.println(shop);
	GoldShop.addGoldItem("GRT");
	System.out.println(shop);
	GoldShop.addGoldItem("RR");
	System.out.println(shop);
	GoldShop.addGoldItem("Lalitha");
	System.out.println(shop);
	System.out.println("gold items are:");
	GoldShop.getAllGoldItems();
	boolean value=GoldShop.updateGoldItem("RR","Kalyan");
	System.out.println("after updating");
	GoldShop.getAllGoldItems();
	System.out.println("After deleting ");
	GoldShop.delGoldItem("Bhima");
	GoldShop.getAllGoldItems();
	
	

}
}