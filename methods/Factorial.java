class Factorial{
	public static double toGetFact(int input)
	{	
		System.out.println("method started");
		int fact =1;
		for(int num=1;num<=input;num++)
		{
			fact=fact*num;
		}
		//System.out.println(fact);
		System.out.println("method ended");
		return fact;
	}
	
}