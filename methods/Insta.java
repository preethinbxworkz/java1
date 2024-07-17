class Insta{
static String mobileNum="8976567890";
static String fullName;
static String userName;
static String password;

			public static void createAcc(String mblNum,String fName,String uName,String pwd){
			mobileNum=mblNum;
			fullName=fName;
			userName=uName;
			password=pwd;
			
			}
			
			
			public static void getInfo(){
			System.out.println("Mobilr Num is "+mobileNum);
			System.out.println("Full name is"+fullName);
			System.out.println("User name is"+userName);
			System.out.println("Password is "+password);
			}
		}