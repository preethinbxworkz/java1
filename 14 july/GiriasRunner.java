class GiriasRunner{

public static void main(String g[])
{

	boolean applinace=Girias.createHomeAppliances("1+ NORD CE4 (8-256) - MOBILE PHONE - ONE PLUS ");
	System.out.println("Home appliances are:"+applinace);
	Girias.createHomeAppliances("GAS STOVE - BUTTERFLY");
	System.out.println("Home appliances are:"+applinace);
	Girias.createHomeAppliances("MAGIX (2 JAR)(500 WATS) - JUICER MIXER GRINDER - BUTTERFLY - 25607");
	System.out.println("Home appliances are:"+applinace);
	Girias.createHomeAppliances("MAGIC (750W)(I6008C00000) - IRON - BUTTERFLY - 25309");
	System.out.println("Home appliances are:"+applinace);
	Girias.createHomeAppliances("WAVE LEAP CALL - 1.83 CALLING - SMART WATCH-BAND - BOAT - 26432");
	System.out.println("Home appliances are:"+applinace);
	Girias.createHomeAppliances("NIRVANA ION ANC - TWS - ACCESSORY(IT & MOBILE) - BOAT - 26429");
	System.out.println("Home appliances are:"+applinace);
	Girias.createHomeAppliances("GN5530N7HY001ORB1O I5-13450HX 16GB DDR5 1 TB SSD 15.6 FHD GRAY - LAPTOP - DELL - 26416");
	System.out.println("Home appliances are:"+applinace);
	Girias.createHomeAppliances("REDMI A3 (6+128) - MOBILE PHONE - REDMI - 26407");
	System.out.println("Home appliances are:"+applinace);
	Girias.createHomeAppliances("A356 - A35 (5G) (8-128) - MOBILE PHONE - SAMSUNG - 26404");
	System.out.println("Home appliances are:"+applinace);
	Girias.createHomeAppliances("ACE 8.5 TRB DRY (PURPLE DAZZLE)(NH) - (8.5 KG)(10 YRS)(30308) - W-M-SA - WHIRLPOOL - 24755");
	System.out.println("Home appliances are:"+applinace);
	Girias.createHomeAppliances("83ER008GIN - I5-12450H - 16GB-512 GB - WIN 11 + OFFICE - INTEL UHD GRAPHICS - 15.6 FHD - LAPTOP - LENOVO - 26304");
	System.out.println("Home appliances are:"+applinace);
	Girias.createHomeAppliances("15.3 MACBOOK AIR M3 CHIP WITH 8 CORE CPU & 10 CORE GPU, 8GB-256GB - STARLIGHT MAC OS (MRYR3HN-A) - LAPTOP - APPLE - 26168");
	System.out.println("Home appliances are:"+applinace);
	Girias.createHomeAppliances("TS-Q24SNXE.ANLG (2.0 TON)(3 STAR)(8806084782021) - AIR CONDITION INVERTER - LG - 26232");
	System.out.println("Home appliances are:"+applinace);
	Girias.createHomeAppliances("BUDS FE - ACCESSORY(IT & MOBILE) - SAMSUNG - 26279");
	System.out.println("Home appliances are:"+applinace);
	System.out.println("values are");
	Girias.getInfo();
	
	
	Girias.updateHomeAppliances("MAGIC (750W)(I6008C00000) - IRON - BUTTERFLY - 25309","Fridge");
	Girias.updateHomeAppliances("abc","washing machine");
	System.out.println("after updating are:");
	Girias.getInfo();
	
	Girias.delHomeAppliances("GAS STOVE - BUTTERFLY");
	System.out.println("aftr del");
	Girias.getInfo();
	



}
}
