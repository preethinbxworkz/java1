class Recharge{
static long number;
static String dataval;
static int price;
static String payment;
static String dataPackage;




public static void recharging(long num,String dataValidity, String data, int rupees,String modeOfPayment)
{
number=num;
dataval=dataValidity;
dataPackage=data;
price=rupees;
payment=modeOfPayment;
}

public static void details(){
System.out.println("phone num for recharging: "+number);
System.out.println("Data Validity: "+dataval);
System.out.println("Data package: "+dataPackage);
System.out.println("Price: "+price);
System.out.println("Mode of payment: "+payment);
}
}