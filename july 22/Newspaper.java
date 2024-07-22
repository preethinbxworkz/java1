class Newspaper{

	String companyNmae;
	int noOfPapers;
	String language;
	double price;
	
	public Newspaper(String companyNmae,int noOfPapers,String language,double price)
	{
			this.companyNmae=companyNmae;
			this.noOfPapers=noOfPapers;
			this.language=language;
			this.price=price;
			
	}
	public void getDetails()
	{
		System.out.println("companyNmae of newspaper is :"+this.companyNmae);
		System.out.println("noOfPapers in newspaper is : "+this.noOfPapers);
		System.out.println("language used in newspaper is :"+this.language);
		System.out.println("price of newspaper is : "+this.price);
	}






}