import java.util.*;
class Textiles{
static String materialNames[]={null,null,null,null,null,null,null,null,null,null,null,null,null,null};
static int index;
public static boolean addMaterial(String name){
	boolean isMaterial=false;
	if(index<materialNames.length){
		if(name!=null){
		materialNames[index]=name;
		index++;
		isMaterial=true;
		}else
		System.out.println("it is full");
	}else{
		System.out.println("see for next time");
	}
	return isMaterial;
}
public static void getAllMaterial(){
	for(String name:materialNames){
	System.out.println(name);
	}
}
public static boolean updateMaterial(String oldName,String newName){
	 boolean isupdate=false;
	 for(int index=0;index<materialNames.length;index++){
	 if(oldName==materialNames[index]){
	 materialNames[index]=newName;
	 isupdate=true;
	 }
	 }
	 if(isupdate==false){
	 System.out.println("oldName not found");
	  }
	  return isupdate;
}
 public static boolean delMaterialName(String materialNameToBeDeleted)
{
	boolean isMaterialDel=false;
	int oldIndex,newIndex;
	for(oldIndex=0,newIndex=0;oldIndex<materialNames.length;oldIndex++){
		if(materialNames[oldIndex]!=materialNameToBeDeleted)
		{
			materialNames[newIndex]=materialNames[oldIndex];
			newIndex++;
			isMaterialDel=true;
		}
	}
	materialNames=Arrays.copyOf(materialNames,newIndex);
	
	if(isMaterialDel==false)
		System.out.println(materialNameToBeDeleted+ "is not found");
	if(materialNames!=null)
		isMaterialDel=false;
	return isMaterialDel;

}
}