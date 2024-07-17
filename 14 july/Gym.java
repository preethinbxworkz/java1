import java.util.*;
class Gym{
static String gymEquiments[]={null,null,null,null,null,null,null,null,null};
static int index;
public static boolean createGymEquipment(String gymEquiment)
{
	boolean isGymEqCreated=false;
	if(index<gymEquiments.length)
	{
		if(gymEquiment!=null && gymEquiments.length>0)
		{
			gymEquiments[index]=gymEquiment;
			index++;
			isGymEqCreated=true;
		}
		else{
			System.out.println("gymEquiment acnt be null");
		}
	}
	else
		System.out.println("gymEquiment are full");
	return isGymEqCreated;
}

public static void getGymEquipments()
{
	for(String gymEquiment:gymEquiments)
		System.out.println(gymEquiment);
	
}
public static boolean updateGymEquipment(String old,String newGym){
	boolean isGymEqUpdated=false;
	int index=0;
	for(index=0;index<gymEquiments.length;index++){
	if(old==gymEquiments[index])
	{
		gymEquiments[index]=newGym;
		isGymEqUpdated=true;
	}
	}
	if(isGymEqUpdated==false) System.out.println(old+ "nt found");


	return isGymEqUpdated;
}
public static boolean delGymEq(String gymEqToBeDel)
	{
		boolean isGymEqDel=false;
		int oldEq,newEq;
		for(oldEq=0,newEq=0;oldEq<gymEquiments.length;oldEq++)
		{
			if(gymEquiments[oldEq]!=gymEqToBeDel){
				gymEquiments[newEq]=gymEquiments[oldEq];
				newEq++;
				isGymEqDel=true;
			}
		}
		gymEquiments=Arrays.copyOf(gymEquiments,newEq);
		if(gymEquiments!=null)
			isGymEqDel=true;
		if(isGymEqDel==false)
			System.out.println(gymEqToBeDel+ "is not found");
		
		return isGymEqDel;
	}
}