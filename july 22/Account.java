class Account{
	
	int customerId;
	String bankName;
	String branchName;
	String ifscCode;
	long accNo;
	String address;
	String accType;
	
	
	//parameterised constructor
	public Account(int customerId,String bankName,String branchName,String ifscCode,long accNo,String address,String accType){
		System.out.println("parameterised constructor is being invoked");
			this.customerId=customerId;
			this.bankName=bankName;
			this.branchName=branchName;
			this.ifscCode=ifscCode;
			this.accNo=accNo;
			this.accType=accType;
			this.address=address;
			
	
		
	}
	
	//get method
	public void getDetails()
	{
		System.out.println("Customer Id is "+this.customerId);
		System.out.println("Bank name is " +this.bankName);
		System.out.println("Branch name is "+this.branchName);
		System.out.println("IFSC code is "+this.ifscCode);
		System.out.println("Account number is "+this.accNo);
		System.out.println("Adress is "+this.address);
		System.out.println("Account type is "+this.accType);
		
	}
	
}