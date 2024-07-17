class RedChilliesEntertainmentRunner{
public static void main(String[] ent){

	boolean output=RedChilliesEntertainment.addMovieActors("Ranver Singh");
	System.out.println(output);
	RedChilliesEntertainment.addMovieActors("Ranbir Kapoor");
	System.out.println(output);	
	RedChilliesEntertainment.addMovieActors("Yash");
	System.out.println(output);
	RedChilliesEntertainment.addMovieActors("Sudeep");
	System.out.println(output);
	RedChilliesEntertainment.addMovieActors("sushanth");
	System.out.println(output);
	RedChilliesEntertainment.addMovieActors("Rohit");
	System.out.println(output);
	RedChilliesEntertainment.addMovieActors("Ganesh");
	System.out.println(output);
	RedChilliesEntertainment.addMovieActors("srk");
	System.out.println(output);
	RedChilliesEntertainment.addMovieActors("sk");
	System.out.println(output);
	RedChilliesEntertainment.getMovieActors();
	RedChilliesEntertainment.updateMovieActor("Yash","Radhika");
	System.out.println("After update-------------");
	RedChilliesEntertainment.getMovieActors();
	
	boolean o=RedChilliesEntertainment.delMovieAcor("Sudeep");
	System.out.println("After deleting ");
	RedChilliesEntertainment.getMovieActors();

}
}