class PassportAbsent{
	
	
	static String cpvLoc;
	static int dcdrLoc;
	static String gName;
	static String sName;
	static String dateOfBirth;
	static String emailId;
	static boolean isEIdSame;
	static String logIn;
	static String pass;
	static String confirmPass;
	static String hintQ;
	static String hintA;
	static String cap;
		

  public static boolean createPassport(String cpvLocation, int dcdrLocation, String givenName, String surName, String dob, String email, 
  boolean isEmailLoginSame, String loginId, String pwd, String confirmPwd, String hintQues, String hintAns, String captcha ){
	  
	  System.out.println("Create passport method started!");
	 boolean isPassportDataCreated=false;
	 boolean isCpvLocationValid;
	 boolean isDrdcLoac;
	 boolean isSurNmaeValid;
	 boolean idPwdValid;
	 boolean isCaptaValid;
	 boolean isCofirmPwdValid;
	 boolean isCpvLocationValid;
	 boolean isDobValid;
	 boolean isEIdSame;
	 boolean isHintAnsValid;
	 boolean isHintqValid;
	 boolean isEmailIdSame;
	 boolean isLogicValid;
	 boolean isGivenNameValid;
	 boolean isEmailValid;
	 
	  //if(cpvLocation!=null&& dcdrLocation > 0 && givenName!=null && surName!=null && 
	 // dob!=null && email!=null && isEmailLoginSame!=false && loginId!=null 
	  //&& pwd!=null && confirmPwd!=null && hintQues!=null && hintAns!=null && captcha!=null)
	  //{	
			if(cpvLocation!=null){
			cpvLoc=cpvLocation;
			isCpvLocationValid=true;
			}
			
			if(dcdrLocation > 0){
				dcdrLoc=dcdrLocation;
				isDrdcLoac=true;
			}
			if(givenName!=null)
				{
					gName=givenName;
					isGivenNameValid=true;
				}
			if(surName!=null)
			{
				sName=surName;
				isSurNmaeValid=true;
			}
			if(dob!=null)
			{
				dateOfBirth=dob;
				isDobValid=true;
			}
			if(email!=null)
			{
				emailId=email;
				isEmailValid=true;
			}
			if(isEmailLoginSame!=false)
			{
				isEIdSame=isEmailLoginSame;
				isEmailIdSame=true;
			}
			if(loginId!=null)
			{
				logIn=loginId;
				isLogicValid=true;
			}
			if(pwd!=null)
			{
				pass=pwd;
				idPwdValid=true;
			}
			if(confirmPwd!=null)
			{
				confirmPass=confirmPwd;
				isCofirmPwdValid=true;
			}
			if(hintQues!=null)
			{
				hintQ=hintQues;
				isHintqValid=true;
			}
			if(hintAns!=null)
			{
				hintA=hintAns;
				isHintAnsValid=true;
			}
			if(captcha!=null)
			{
				cap=captcha;
				isCaptaValid=true;
			}
			
				
       //cpvLoc=cpvLocation;
	   //dcdrLoc=dcdrLocation;
	   //gName=givenName;
	   /*sName=surName;
	   dateOfBirth=dob;
	   emailId=email;
	   isEIdSame=isEmailLoginSame;
	   logIn=loginId;
	   pass=pwd;
	   confirmPass=confirmPwd;
	   hintQ=hintQues;
	   hintA=hintAns;
	   cap=captcha;*/
	   
	   
	   
	   isPassportDataCreated=true;
	   
     System.out.println("Create passport method ended!");
  }
     else{
	  System.out.println("Please provide valid details!");
  }
  
  
  return isPassportDataCreated;
}
  
  public static void getPassportDetails(){
	  //System.out.println("Get passportdetails	 method started!");
	  
	  System.out.println("CPV Location:"+cpvLoc);
	  System.out.println("DCDR Location:"+dcdrLoc);
	  System.out.println("Name:"+gName);
	  System.out.println("Surname:"+sName);
	  System.out.println("Date Of Birth:"+dateOfBirth);
	  System.out.println("Email Id:"+emailId);
	  System.out.println("Is Emailid Same:"+isEIdSame);
	  System.out.println("Username:"+logIn);
	  System.out.println("Password:"+pass);
	  System.out.println("Confirm password:"+confirmPass);
	  System.out.println("Hint Question:"+hintQ);
	  System.out.println("Hint Answer:"+hintA);
	  System.out.println("Captcha:"+cap);
	  
     //System.out.println("Get passportdetails method ended!"); 
  }
  
}