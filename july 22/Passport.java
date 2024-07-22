class Passport{
	 String cprLoc;
	 int dcdrLoc;
	 String sName;
	 String fName;
	 String dateOfBirth;
	//static String 

	public Passport(String cprLoc,int dcdrLoc,String sName,String fName,String dateOfBirth) {
		boolean isPassportdataCreated=false;
		
		
		{
			
			this.cprLoc=cprLoc;
			this.dcdrLoc=dcdrLoc;
			this.sName=sName;
			this.fName=fName;
			this.dateOfBirth=dateOfBirth;
			isPassportdataCreated=true;
		}
		
	}
	
	public  void getPassportDatils(){
	System.out.println("cprLocation is: "+this.cprLoc);
		System.out.println("dcdrLocationis: "+this.dcdrLoc);
		System.out.println("sirName is:" +this.sName);
		System.out.println("firstName is: "+this.fName);
		System.out.println("dob is:" +this.dateOfBirth);
}
	
}





