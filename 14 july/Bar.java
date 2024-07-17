import java.util.*;
class Bar{
static String wineBrands[]={null,null,null,null,null,null,null,null,null,null,null,null,null,null,null};
static int index=0;


public static boolean addWineBrands(String brand){
	 boolean isWineBrandsAdded=false;
	 if(index<wineBrands.length){
		 
	 if(brand!=null && wineBrands.length>0)
	 {
		 wineBrands[index]=brand;
		 index++;
		 isWineBrandsAdded=true;
	 }
	 
	 else
		 System.out.println("cant be null");
	}
	 return isWineBrandsAdded;
}

public static void getAllBrands()
{
	for(String brand:wineBrands)
		System.out.println(brand);
}

public static boolean updateWineBrand(String old , String newBrandd)
{
	boolean isWineBrandsUpdated=false;
	for(index=0;index<wineBrands.length;index++)
	{
		if(old==wineBrands[index])
		{
			wineBrands[index]=newBrandd;
			isWineBrandsUpdated=true;
		}
	}
	if(isWineBrandsUpdated==false)
	{
		System.out.println(old+ "not found");
	}
	return isWineBrandsUpdated;
}
public static boolean delWineBrand(String wineBrandToBeDel)
{
	boolean isWineBrandsDel=false;
	int oldIndex,newIndex;
	for(oldIndex=0,newIndex=0;oldIndex<wineBrands.length;oldIndex++){
		if(wineBrands[oldIndex]!=wineBrandToBeDel)
		{
			wineBrands[newIndex]=wineBrands[oldIndex];
			newIndex++;
			isWineBrandsDel=true;
		}
	}
	wineBrands=Arrays.copyOf(wineBrands,newIndex);
	
	if(isWineBrandsDel==false)
		System.out.println(wineBrandToBeDel+ "is not found");
	if(wineBrands!=null)
		isWineBrandsDel=false;
	return isWineBrandsDel;

}
}
//runtime --jre
/*String ia class 
String are identifier
name giveb to cls,method,var name are caled as methods.*/