class Girias{

	static String homeAppliances[]={null,null,null,null,null,null,null,null,null,null,null,null};
	static int index;
	
	public static boolean createhomeAppliance(String homeAppliance){
	System.out.println("Create method started");
		boolean ishomeApplianceCreated=false;
		if(homeAppliance!=null){
			homeAppliances[index]=homeAppliance;
			index++;
			ishomeApplianceCreated=true;
		}else System.out.println("Home Appliances cannot be null");
		System.out.println("Create method Ended");
		return ishomeApplianceCreated;
	}
	public static void getHomeAppliances(){
		for(String homeApp:homeAppliances)
		System.out.println(homeApp);

	} 
	}