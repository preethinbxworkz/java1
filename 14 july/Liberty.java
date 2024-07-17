import java.util.*;
class Liberty{
static String shoeNames[]={null,null,null,null,null,null,null,null,null,null,null,null,null,null,null,null};
	static int index;
	public static boolean addShoeBrands(String brandName){
	boolean isbrand=false;
	if(index<shoeNames.length){
	if(brandName!=null){
	shoeNames[index]=brandName;
	index++;
	isbrand=true;
	}else System.out.println("shoess are full....");
	}else{
	System.out.println("let's see next time......");
	}
	return isbrand;
}
public static void getAllShoeBrands(){
	for(String brandName:shoeNames){
		System.out.println(brandName);
	}
}
public static boolean updateShoeBrand(String oldName,String newName){
	boolean isupdate=false;
	for(int index=0;index<shoeNames.length;index++){
	if(oldName==shoeNames[index]){
	shoeNames[index]=newName;
	isupdate=true;
	}
	}
	if(isupdate==false){
	System.out.println("not found");
	}
	return isupdate;
}
public static boolean delShoeBrand(String showBrandToBeDeleted)
{
	boolean isShoeBrandsDel=false;
	int oldIndex,newIndex;
	for(oldIndex=0,newIndex=0;oldIndex<shoeNames.length;oldIndex++){
		if(shoeNames[oldIndex]!=showBrandToBeDeleted)
		{
			shoeNames[newIndex]=shoeNames[oldIndex];
			newIndex++;
			isShoeBrandsDel=true;
		}
	}
	shoeNames=Arrays.copyOf(shoeNames,newIndex);
	
	if(isShoeBrandsDel==false)
		System.out.println(showBrandToBeDeleted+ "is not found");
	if(shoeNames!=null)
		isShoeBrandsDel=false;
	return isShoeBrandsDel;

}
}
