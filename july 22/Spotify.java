class Spotify{

	int userId;
	String userName;
	String email;
	String dob;
	String countryName;
	
	public Spotify(int userId,String userName,String email,String dob,String countryName){
	
		this.userId=userId;
		this.userName=userName;
		this.email=email;
		this.dob=dob;
		this.countryName=countryName;
	
	
	}
	
	public void  getTheDetails()
	{
		System.out.println("Userid is: "+this.userId);
	}
}