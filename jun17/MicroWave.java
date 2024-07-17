class MicroWave{
	static String brand="Panasonic";
	static String dimensions="34D x 44.3W x 25.8H Centimeters";
	static int capacity=20;
	public static void main(String args[]){
		long price=5990;
		String color ="Silver";
		String specialFeature="Defrost,Turntable,Auto Heat,Timer,Compact,Vapor Clean,Auto Cook";
		boolean isSold=false;
		System.out.println("---------------------------");
		System.out.println("Brand : "+brand);
		System.out.println("dimensions : "+dimensions);
		System.out.println("capacity : "+capacity);
		System.out.println("Price : "+ price);
		System.out.println("Color : "+ color);
		System.out.println("Spl features: "+ specialFeature);
		System.out.println("Is product delivered : "+isSold );
		System.out.println("---------------------------");
	}
}