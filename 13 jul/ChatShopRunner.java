class ChatShopRunner{
public static void main(String []c)
{
	boolean out =ChatShop.createChatName("bhel");
	System.out.println(out);
	//boolean price=ChatShop.addChatPrice(40.0);
	//System.out.println(price);
	ChatShop.createChatName("jh");
	System.out.println(out);

	 out =ChatShop.createChatName("masala");
	System.out.println(out);
	 out =ChatShop.createChatName("pani");
	System.out.println(out);
	out =ChatShop.createChatName("alo");
	System.out.println(out);
	 out =ChatShop.createChatName("samosa");
	System.out.println(out);
	//ChatShop.getDetails();
	//ChatShop.getChatPrice();
	
	boolean newone=ChatShop.updateChatName("masala","dahi");
	System.out.println("updated chat is:"+newone);
	ChatShop.getDetails();
	System.out.println("kljhg");
	boolean isValdel=ChatShop.delChatName("alo");
	System.out.println(isValdel+":value delted");
	ChatShop.getDetails();
	}
	}
//length-prop of array ref