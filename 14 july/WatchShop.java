import java.util.*;
class WatchShop{
static String brands[]={null,null,null,null,null,null,null,null,null,null};
static int index;

public static boolean addWatchBrandNames(String brand)
{
	boolean isWatchBrandAdded=false;
	if(brands.length>0 && brands!=null)
	{
		brands[index]=brand;
		index++;
		isWatchBrandAdded=true;
	}
	else System.out.println("cant be null");
	return isWatchBrandAdded;
}

public static void getAllWatchBrands()
{
	for(String item:brands)
		System.out.println(item);
}

public static boolean updateWatchBrands(String old ,  String newBrand )
{
	boolean isWatchBrandUpdated=true;
	for(index=0;index<brands.length;index++)
	{
		if(old==brands[index])
		{
			brands[index]=newBrand;
			isWatchBrandUpdated=true;
		}
	}
	if(isWatchBrandUpdated==false)
	{
		System.out.println(newBrand+ "not found");
	}
	return isWatchBrandUpdated;
}
public static boolean delWatchBrands(String watchBrandToBeDel)
{
	boolean isWatchBrandDel=false;
	int oldIndex,newIndex;
	for(oldIndex=0,newIndex=0;oldIndex<brands.length;oldIndex++){
		if(brands[oldIndex]!=watchBrandToBeDel)
		{
			brands[newIndex]=brands[oldIndex];
			newIndex++;
			isWatchBrandDel=true;
		}
	}
	brands=Arrays.copyOf(brands,newIndex);
	
	if(isWatchBrandDel==false)
		System.out.println(watchBrandToBeDel+ "is not found");
	if(brands!=null)
		isWatchBrandDel=false;
	
	return isWatchBrandDel;
}
}