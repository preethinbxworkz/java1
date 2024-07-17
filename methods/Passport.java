class Passport{
	static String cprLoc;
	static int dcdrLoc;
	static String sName;
	static String fName;
	static String dateOfBirth;
	//static String 

	public static boolean  createPassport(String cprLocation, int dcdrLocation,String sirName,String firstName,String dob,
	String email,boolean isEmailLoginSame,String loginId,String pwd,String conformPwd,
	String hintQ,String hintAns,String captcha) {
		boolean isPassportdataCreated=false;
		
		/*System.out.println("cprLocation is: "+cprLocation);
		System.out.println("dcdrLocation is: "+dcdrLocation);
		System.out.println("sirName is:" +sirName);
		System.out.println("firstName is: "+sirName);
		System.out.println("dob is:" +dob);
*/

		cprLoc=cprLocation;
		dcdrLoc=dcdrLocation;
		sName=sirName;
		fName=firstName;
		dateOfBirth=dob;
		return isPassportdataCreated  ;
	}
	
	public static void getPassportDatils(){
	System.out.println("cprLocation is: "+cprLoc);
		System.out.println("dcdrLocationis: "+dcdrLoc);
		System.out.println("sirName is:" +sName);
		System.out.println("firstName is: "+fName);
		System.out.println("dob is:" +dateOfBirth);
}
}





