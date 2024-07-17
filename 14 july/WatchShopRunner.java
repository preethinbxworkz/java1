class WatchShopRunner{
public static void main(String w[]){
	boolean value = WatchShop.addWatchBrandNames("titan");
	System.out.println(value);
	WatchShop.addWatchBrandNames("fastrack");
	System.out.println(value);	
	WatchShop.addWatchBrandNames("timex");
	System.out.println(value);
	WatchShop.addWatchBrandNames("rolex");
	System.out.println(value);
	WatchShop.addWatchBrandNames("aple");
	System.out.println(value);
	WatchShop.addWatchBrandNames("samsumg");
	System.out.println(value);
	WatchShop.addWatchBrandNames("boat");
	System.out.println(value);
	WatchShop.addWatchBrandNames("Breguet");
	System.out.println(value);
	WatchShop.addWatchBrandNames("Chopard");
	System.out.println(value);
	WatchShop.addWatchBrandNames("Sonata");
	System.out.println(value);
	System.out.println("watch brands are:");
	WatchShop.getAllWatchBrands();
	WatchShop.updateWatchBrands("timex","casio");
	System.out.println("updation:...............");
	WatchShop.getAllWatchBrands();
	System.out.println("del brands...........");
	WatchShop.delWatchBrands("aple");
	WatchShop.getAllWatchBrands();
	
	
	

}
}