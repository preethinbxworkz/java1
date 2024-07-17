import java.util.*;
class Girias{
static String homeAppls[]={null,null,null,null,null,null,null,null,null,null,null,null,null,null};
static int index=0;


public static boolean createHomeAppliances(String homeAppliance){
boolean isHomeAppliancesCreated=false;

if(index<homeAppls.length)
{
	if(homeAppliance!=null  && homeAppls.length>0){
	homeAppls[index]=homeAppliance;
	index++;
	isHomeAppliancesCreated=true;
	}
	else{
	System.out.println("Home Appliances cant be null");
	}
}	
else{
System.out.println("Home Appliances are full");
}
	return  isHomeAppliancesCreated;
}

public static void getInfo()
{
	for( String appliances:homeAppls){
		System.out.println(appliances);
	}
}

public static boolean updateHomeAppliances(String oldHomeAppliance,String newHomeAppln){
	boolean isHomeAppliancesUpdated=false;
	for(int index=0;index<homeAppls.length;index++){
	if(oldHomeAppliance==homeAppls[index])
	{
		homeAppls[index]=newHomeAppln;
		isHomeAppliancesUpdated=true;
	}
	}
	if(isHomeAppliancesUpdated==false){
		System.out.println(oldHomeAppliance+ "not found");
	}
	return isHomeAppliancesUpdated;
}

public static boolean delHomeAppliances(String homeApplianceToBeDeleted){
	boolean isHomeAppliancesDel=false;
	int oldIndex,newIndex;
	for(oldIndex=0,newIndex=0;oldIndex<homeAppls.length;oldIndex++)
	{
		if(homeAppls[oldIndex]!=homeApplianceToBeDeleted)
		{
			homeAppls[newIndex]=homeAppls[oldIndex];
			newIndex++;
			isHomeAppliancesDel=true;
		}
	}
	homeAppls=Arrays.copyOf(homeAppls,newIndex);
	if(homeAppls!=null)
	{
		isHomeAppliancesDel=true;
	}
	if(isHomeAppliancesDel==false) 
		System.out.println(homeApplianceToBeDeleted+ "is not found");
	
	return isHomeAppliancesDel;
}
}