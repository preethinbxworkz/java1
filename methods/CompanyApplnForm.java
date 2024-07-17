class CompanyApplnForm{
	static  String firstName;
	static String lastName;
	static String dateOfBirth;
	static String placeeee;
	static String emaillId;
	static long phoneNumber;
	
public static void fillingForm(String fName,String lName,String dob,String place,String emailId,long phoneNo)
{
	firstName=fName;
	lastName=lName;
	dateOfBirth=dob;
	placeeee=place;
	emaillId=emailId;
	phoneNumber=phoneNo;
}
	public static void getTheDetails(){
		System.out.println("First Name :"+firstName);
		System.out.println("Last Name :"+lastName);
		System.out.println("Date of Birth :"+dateOfBirth);
		System.out.println("Place :"+placeeee);
		System.out.println("Email id :"+emaillId);
		System.out.println("Phone Number :"+phoneNumbera);
	}
}