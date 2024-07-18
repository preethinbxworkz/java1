class Newspaper{

	String companyNmae;
	int noOfPapers;
	String language;
	double price;
	
	public boolean create(String companyNmae,int noOfPapers,String language,double price)
	{
		boolean isNewspaperCreated=false;
		if(companyNmae!=null && noOfPapers>0 && language!=null && price>0.0d)
		{
			this.companyNmae=companyNmae;
			this.noOfPapers=noOfPapers;
			this.language=language;
			this.price=price;
			isNewspaperCreated=true;
			}
			
		return isNewspaperCreated;
	}
	public void getDetails()
	{
		System.out.println("companyNmae of newspaper is :"+this.companyNmae);
		System.out.println("noOfPapers in newspaper is : "+this.noOfPapers);
		System.out.println("language used in newspaper is :"+this.language);
		System.out.println("price of newspaper is : "+this.price);
	}






}