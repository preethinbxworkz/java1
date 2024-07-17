class XworkzApplication {
    static String nm;
    static String mail;
    static String usnn;
    static String phNum;
    static String addr;
	static boolean isApplicationCreated;
    static boolean isnameValid;
	static boolean isemailValid;
    static boolean isusnValid;
	static boolean isphoneNumberValid;
    static boolean isaddressValid;
    public static boolean createApplication(String name, String email, String usn, 
	String phoneNumber, String address) {
        //validating details
		validateUserDetails( name, email, usn , phoneNumber,  address);
		return isApplicationCreated;		
	}
      	
    public static void getApplicationData()//method declartion
	{
        
        System.out.println("Username: " + nm);
        System.out.println("Email: " + mail);
        System.out.println("USN: " + usnn);
        System.out.println("Phone Number: " + phNum);
        System.out.println("Address: " + addr);
      
    }

public static void validateUserDetails(String name, String email, String usn, 
	String phoneNumber, String address){
 if(name!=null)
			{
				nm=name;
				isnameValid=true;
			}
		else{
			System.out.println("please provide the valid name");
			}
       if(email!=null )
			{
				mail=email;
				isemailValid=true;
			}
			else{
				System.out.println("please provide valid email");
			}

        if(usn!=null)
			{
				usnn=usn;
				isusnValid=true;
			}
			else{
				System.out.println("please provide valid usn");
			}

        if(phoneNumber!=null)
			{
				phNum=phoneNumber;
				isphoneNumberValid=true;
			}
			else{
				System.out.println("please provide the valid mblNum");
			}

        if(address!=null)
			{
				addr=address;
				isaddressValid=true;
			}
			else{
				System.out.println("please provide the address");
			}


        if (isnameValid && isemailValid && isusnValid && isphoneNumberValid && isaddressValid) {
          isApplicationCreated=true;
			}
			else
			{
				
				System.out.println("pls enter valid details");
			}
			
	}
}
		