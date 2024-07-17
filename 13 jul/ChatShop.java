import java.util.*;
class ChatShop{
	static String name="pree";
	static String ownerName="";
	//Datatypes arrayvariable[]={val};
	static String chatNames[]={null,null,null,null,null,null};
	static double chatPrices[]={0.0,0.0,0.0};
	static int chatNameIndex;

//add chatName in chatName index position(ref)
// String chatName="kjhg";
public static boolean createChatName(String chatName)
{
	boolean isChatNameCreated=false;
	//validation
	if(chatNameIndex<chatNames.length)
	//0<+6
	{
		//to avoid array out of bond execption
		
		if(chatName!=null && chatNames.length>0)
		{
					chatNames[chatNameIndex]=chatName;
					chatNameIndex++;
					isChatNameCreated=true;
		} 
		else{
		System.out.println("chatName is null,so cannot be printed");
		}
	}
	else{
		System.out.println("chat names are ful");
	
}
return isChatNameCreated;
}



public static void getDetails()
{
	for(String chatName:chatNames)
	{
		System.out.println(chatName);
	}
}

	public static boolean updateChatName(String oldChatName, String newChatName)
	{
		boolean isUpdateChatName=false;
		for(int index=0; index < chatNames.length;index++){
			if(oldChatName==chatNames[index]){
				//newChatName=chatNames[index];
				chatNames[index]=newChatName;
				isUpdateChatName=true;		
			}
		} 
		if(isUpdateChatName==false){
			System.out.println(oldChatName+ "not found");
		}
		return isUpdateChatName;
	}
	
	public static boolean delChatName(String chatNameToBeDel)
	{
		boolean isChatDel=false;
		int oldChat,newChat;
		int oldChatIndex;
		for(oldChat=0,newChat=0;oldChat<chatNames.length;oldChat++)
		{
			if(chatNames[oldChat]!=chatNameToBeDel){
				chatNames[newChat]=chatNames[oldChat];
				newChat++;
				isChatDel=true;
			}
		}
		chatNames=Arrays.copyOf(chatNames,newChat);
		if(chatNames!=null)
			isChatDel=true;
		if(isChatDel==false)
			System.out.println(chatNameToBeDel+ "is not found");
		
		return isChatDel;
	}
}
	
	
	
/*
	public static void getChatPrice()
{
	for(double chatPrice:chatPrices)
	{
		System.out.println(chatPrice);
	}
}	
	public static boolean addChatPrice(double chatPrice)
{	int chatPriceIndex=0;
	boolean isPriceAdded=false;
	if(chatPrice>0.0) {
		 chatPrices[chatPriceIndex]=chatPrice;
		chatPriceIndex++;
		isPriceAdded=true;
	}
		return isPriceAdded;
}
}
*/
