class GymRunner{
public static void main(String[] gymm){

	boolean out=Gym.createGymEquipment("Pullup Bar");
	System.out.println(out);
	Gym.createGymEquipment("Bench");
	System.out.println(out);	
	Gym.createGymEquipment("Rowing Machine");
	System.out.println(out);
	Gym.createGymEquipment("Barbell");
	System.out.println(out);
	Gym.createGymEquipment("Exercide bike");
	System.out.println(out);
	Gym.createGymEquipment("Dumbbell");
	System.out.println(out);
	Gym.createGymEquipment("Bench press");
	System.out.println(out);
	Gym.createGymEquipment("Treadmill");
	System.out.println(out);
	Gym.createGymEquipment("Elliptical trainer");
	System.out.println(out);
	
	
	Gym.updateGymEquipment("Barbell","Resistance band");
	Gym.getGymEquipments();
	
	
	boolean o= Gym.delGymEq("Bench");
	System.out.println(o+ "delted");
	Gym.getGymEquipments();
	





}
}