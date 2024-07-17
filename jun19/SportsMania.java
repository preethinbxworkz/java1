class SportsMania{
	static String iplTeams[]={"RCB","CSK","MI","DC","GT","KKR","SRH","RR","PK","LSG"};
	static String top10BatsMan[]={"Virat Kohli","Trvis Head","Sunil","Ruturaj","Sanju","Abhishek","Riyan","KL Rahnul","Rishabh","MSD"};
	static String top10Bowlers[]={"HV Patel","CV Varun","JJ Bumrah","AD Russell","Harshit Kanna","T Natarajan","Arshdeep Singh","Avesh Khan","YS Chanal","PJ Cummins"};
	static String top10ICCTeams[]={"IND","AUS","SA","PAK","NZ","ENG","SL","BAN","AFG","WI"};
	public static void main(String args[]){
		/*
		System.out.println("IPL Teams:\n"+iplTeams[0]+ "\n" +iplTeams[1]+ "\n" +iplTeams[2]+ "\n" +iplTeams[3]+ "\n" +iplTeams[4]+ "\n" +iplTeams[5]+ "\n" +iplTeams[6]+ "\n" +iplTeams[7]+ "\n" +iplTeams[8]+ "\n" +iplTeams[9]);
		System.out.println("----------------------");
		System.out.println("Top 10 Batsman are:\n" +top10BatsMan[0]+ "\n" +top10BatsMan[1]+ "\n" +top10BatsMan[2]+ "\n" +top10BatsMan[3]+ "\n" +top10BatsMan[4]+ "\n" +top10BatsMan[5]+ "\n" +top10BatsMan[6]+ "\n" +top10BatsMan[7]+ "\n" +top10BatsMan[8]+ "\n" +top10BatsMan[9]); 
		System.out.println("----------------------");
		System.out.println("Top 10 Bowlers are:\n" +top10Bowlers[0]+ "\n" +top10Bowlers[1]+ "\n" +top10Bowlers[2]+ "\n" +top10Bowlers[3]+ "\n" +top10Bowlers[4]+ "\n" +top10Bowlers[5]+ "\n" +top10Bowlers[6]+ "\n" +top10Bowlers[7]+ "\n" +top10Bowlers[8]+ "\n" +top10Bowlers[9]);
		System.out.println("----------------------");
		System.out.println("Top 10 ICC Teams:\n" +top10ICCTeams[0]+ "\n" +top10ICCTeams[1]+ "\n" +top10ICCTeams[2]+ "\n" +top10ICCTeams[3]+ "\n" +top10ICCTeams[4]+ "\n" +top10ICCTeams[5]+ "\n" +top10ICCTeams[6]+ "\n" +top10ICCTeams[7]+ "\n" +top10ICCTeams[8]+ "\n" +top10ICCTeams[9]);
	*/
	System.out.println("----------------------");
	System.out.println("IPL Teams are: ");
	for(String iplTeamsList:iplTeams)
	{
		System.out.println(iplTeamsList);
	}
	System.out.println("TOp 10 batsman:");
	for(String top10BatsManList:top10BatsMan)
	{
		System.out.println(top10BatsManList);
	}
	System.out.println("Top 10 bowlers are:");
	for(String top10BowlersList:top10Bowlers)
	{
		System.out.println(top10BowlersList);
	}
	System.out.println("Top 10 ICC Teams");
	for(String top10ICCTeamsList:top10ICCTeams)
	{
		System.out.println(top10ICCTeamsList);
	}
}
}