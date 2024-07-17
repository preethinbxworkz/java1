import java.util.*;
class GoldShop{
static String goldNames[]={null,null,null,null,null,null,null};
static int index;
public static boolean addGoldItem(String goldName) {
	boolean isGoldAdded=false;
	if(index<goldNames.length)
	{
		if(goldNames!=null)
		{
			goldNames[index]=goldName;
			index++;
			isGoldAdded=true;
		}
		else
			System.out.println("goldNames cant be null");
	}
	else System.out.println("goldNames are full");
	return isGoldAdded;
}

public static void getAllGoldItems()
{
	for(String golditems:goldNames){
		System.out.println(golditems);
	}
	return ;
}

public static boolean updateGoldItem(String oldItem,String newItem) {
	boolean isGoldUpdated=false;
	for(int index=0; index<goldNames.length;index++)
	{
		if(oldItem==goldNames[index])
		{
			goldNames[index]=newItem;
			isGoldUpdated=true;
		}
	}
	if(isGoldUpdated==false)
		System.out.println(oldItem+ "not foundd");
	
	return isGoldUpdated;
}
public static boolean delGoldItem(String goldItemToBeDel)
{
	boolean isGoldDel=false;
	int oldIndex,newIndex;
	for(oldIndex=0,newIndex=0;oldIndex<goldNames.length;oldIndex++)
	{
		if(goldNames[oldIndex]!=goldItemToBeDel)
		{
			goldNames[newIndex]=goldNames[oldIndex];
			newIndex++;
			isGoldDel=true;
		}
	}
	goldNames=Arrays.copyOf(goldNames,newIndex);
	
	if(isGoldDel==false)
		System.out.println(goldItemToBeDel+ "not foundd");
	if(goldNames!=null)
		isGoldDel=true;
	
	return isGoldDel;
}
}











