class WashingMachine{
	static String brand="Bosch";
	static String dimensions="59D x 66W x 84.8H Centimeters";
	static String capacity="8 Kilograms";
	public static void main(String args[]){
		long price=53990;
		String color ="Silver";
		int voltage=240;
		String specialFeature="Eco silence drive,Active water,Anti vibration,Anti wrinkle feature";
		boolean isSold=false;
		System.out.println("---------------------------");
		System.out.println("Brand : "+brand);
		System.out.println("dimensions : "+dimensions);
		System.out.println("capacity : "+capacity);
		System.out.println("Price : "+ price);
		System.out.println("Color : "+ color);
		System.out.println("Voltage: "+voltage);
		System.out.println("Spl features: "+ specialFeature);
		System.out.println("Is product delivered : "+isSold );
		System.out.println("---------------------------");
	}
}