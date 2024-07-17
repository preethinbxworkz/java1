class AirConditioner{
	static boolean isConnected;
	static int currentTemp;
	static int minTemp;
	static int maxTemp=3;
	
	public static int increaseTemperature(){
		System.out.println("increaseTemperature() strated");
		if (isConnected==true){
			if(currentTemp<maxTemp){
				currentTemp=currentTemp+1;
			return currentTemp;
			}
			else{
				System.out.println("reached maximum temp");
			}
		}
		else{
			System.out.println("bye");
		}
		
		System.out.println("increaseTemperature() ended");
		return 0;

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


/*class AirConditioner{
static boolean isConnected=false;
static int currentTemperature;
static int maxTemperature= 6;
static int minTemperature;

public  static void onOrOff(){
System.out.println("onOrOff started");
if(isConnected==false){
    isConnected=true;
	System.out.println("AirConditionar is on");
	}
	else if(isConnected==true){
	     isConnected=false;
		System.out.println("AirConditionar is off"); 
        System.out.println("onOrOff ended");
   return ;
 }
}
public static void increaseTemperature(){
				 System.out.println("increaseTemperature() started");
			if(isConnected == true){	       
				 if(currentTemperature < maxTemperature){
					    currentTemperature= currentTemperature+1 ;
				System.out.println("The current temperature is "+ currentTemperature);		
				}else{
						System.out.println("Max Temperature Reached");
					 } 
			}else{
				System.out.println("bye");
			}
				 	 System.out.println("increaseTemperature() ended");
				 return ;
				 }
 public static void decreaseTemperature(){
	 System.out.println("decreaseTemperature() started");
	 if(isConnected==true){
		 if(currentTemperature>minTemperature){
			 currentTemperature=currentTemperature-1;
			 System.out.println("The current temperature is "+ currentTemperature);
		 }
		 else{
			 System.out.println("Min Temperature Reached");
		 }
	 }
	 else{
			 System.out.println("hey");
			 
		 }
	 
		 System.out.println("decreaseTemperature() ended");
		 return;
}
public static void getDetails(){
String name="Sumsung";
     double  price=20000.00;
System.out.println("The brand name is :"+name);
System.out.println("The brand price is :"+price);
 }
}*/