class Gym{

	static String gymEquipments[]={null,null,null,null,null,null,null,null};
	static int index;
	
	public static boolean createGymEquipment(String gymEquipmentName){
	System.out.println("Create method started");
		boolean isGymEquipmentCreated=false;
		if(gymEquipmentName!=null){
			gymEquipments[index]=gymEquipmentName;
				index++;
				isGymEquipmentCreated=true;
				}
				else System.out.println("Gym Equipment cannot be null");
				System.out.println("Create method Ended");
				return isGymEquipmentCreated;
	}
	public static void getGymEquipments(){
	System.out.println("The Available Gym Equipments are:");
	for(String gymEqu:gymEquipments)
		System.out.println(gymEqu);
	}

}