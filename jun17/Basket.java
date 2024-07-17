class Basket{
	static int price=749;
	static String color="Dark Brown";
	static	String  material ="Plastic";
	public static void main(String args[]){
	
		String brand="Bel Casa";
		String shape="Rectangular";
		String productDimensions="37.5D x 31W x 25.5H Centimeters";

		boolean isSold=true;
		System.out.println("---------------------------");
		System.out.println("Brand : "+brand);
		System.out.println("shape : "+shape);
		System.out.println("Price : "+ price);
		System.out.println("Product Dimensions : "+ productDimensions);
		System.out.println("color: "+ color);
		System.out.println("Material: "+ material);
		System.out.println("Is product delivered : "+isSold );
		System.out.println("---------------------------");
	}
}