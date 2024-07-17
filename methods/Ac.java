///parameters
class Ac{
	static boolean isConnected;
	//static int increaseTemp;
	static int currentTemp;
	static int minTemp;
	static int maxTemp=6;
	
	public static void increaseTemperature(){
		System.out.println("increaseTemperature() strated");
		if (isConnected==true){
			if(currentTemp<maxTemp)
				currentTemp=currentTemp+1;
			System.out.println(currentTemp);
			}
			else{
				System.out.println("reached maximum temp");
			}
		}
		else{
			System.out.println("bye");
		}
		return;
		System.out.println("increaseTemperature() ended");
		

	}
		
	public static void getDetails(){
		System.out.println("getDetails() started");
		String brand ="lg";
		String price ="2k";
		//System.out.println("Brand of AirConditioner : +brand+ "\n" Price of Airconditioner:"+price);
		System.out.println("Brand of AirConditioner :" +brand);
		 System.out.println("Price of Airconditioner:"+price);
		System.out.println("getDetails() ended");
		return;
	}
		
		public static void onOrOff()
		{
			System.out.println("onOrOff() started");
			
			if(isConnected==true){
				isConnected=false;
				System.out.println("ac is turned off");
			}
			else if(isConnected==false){
				isConnected=true;
				System.out.println("ac is turned on");
			}
			
			System.out.println("onOrOff() ended");
			return;
		}
}