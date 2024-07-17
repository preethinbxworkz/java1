class GymRunner{

	public static void main(String gym[]){
	boolean value=Gym.createGymEquipment("Tread Mill");
	System.out.println(value);
	Gym.createGymEquipment("Cycling");
	System.out.println(value);
	Gym.createGymEquipment("Dumb bells");
	System.out.println(value);
	Gym.createGymEquipment("Weight Plate");
	System.out.println(value);
	Gym.createGymEquipment("Bench Press");
	System.out.println(value);
	Gym.createGymEquipment("AdjustableBench");
	System.out.println(value);
	Gym.createGymEquipment("Raises Machine");
	System.out.println(value);
	Gym.createGymEquipment("Cable Row Machine");
	System.out.println(value);
	Gym.getGymEquipments();
	}
} 