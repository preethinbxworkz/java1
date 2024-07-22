class Garden{
	String name;
	String place;
	

	public void displayGardenDetails()
	{
		System.out.println("name of garden is: "+this.name);
		System.out.println("place of garden is: "+this.place);
		}
		
	public Garden(String name,String place){
				
		System.out.println("creation of constructor");
		this.name=name;
		this.place=place;
	}
}