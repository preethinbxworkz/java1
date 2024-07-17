import java.util.Arrays;
class RedChilliesEntertainment{

	static String movieActors[]={null,null,null,null,null,null,null,null,null};
	static int index;
	
	public static boolean addMovieActors(String actorsName){
	System.out.println("Create method started");
		boolean isMovieActorsCreated=false;
		if(actorsName!=null){
			movieActors[index]=actorsName;
				index++;
				isMovieActorsCreated=true;
				}
				else System.out.println("Movie Actors cannot be null");
				System.out.println("Create method Ended");
				return isMovieActorsCreated;
	}
	public static void getMovieActors(){
	System.out.println("The Available Movie Actors are:");
	for(String movAct:movieActors)
		System.out.println(movAct);
	}
	public static boolean delMovieAcor(String actorToBeDeleted){
		boolean isMovieActorsDel=false;
		int oldIndex,newIndex;
		for(oldIndex=0,newIndex=0;oldIndex<movieActors.length;oldIndex++)
		{
			if(movieActors[oldIndex]!=actorToBeDeleted)
			{
				movieActors[newIndex]=movieActors[oldIndex];
				newIndex++;
			}
		}
		movieActors=Arrays.copyOf(movieActors,newIndex);
		if(movieActors!=null)
		{
			isMovieActorsDel=true;
		}
		if(isMovieActorsDel==false)
		{
			System.out.println(actorToBeDeleted+ "is not found");
		}
		return isMovieActorsDel;
	}

}