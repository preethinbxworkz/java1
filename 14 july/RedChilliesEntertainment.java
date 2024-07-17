import java.util.*;
class RedChilliesEntertainment{
static String movieActors[]={null,null,null,null,null,null,null,null,null};
static int index=0;

public static boolean addMovieActors(String actor)
{
	boolean isMovieActorCreated=false;
	if(index<movieActors.length)
	{
		if(movieActors!=null && movieActors.length>0)
		{
			movieActors[index]=actor;
			index++;
			isMovieActorCreated=true;
		}
		else System.out.println("actor can't be null");
	}
	else
		System.out.println("actors are full");

	return isMovieActorCreated;
}
 public static void getMovieActors()
 {
	 for(String actor:movieActors)
		 System.out.println(actor);
 }

public static boolean updateMovieActor(String oldActor,String newActor)
{
	boolean isMovieActorUpdated=false;
	for(int index=0;index<movieActors.length;index++)
	{ if(oldActor==movieActors[index])
		{
			movieActors[index]=newActor;
			isMovieActorUpdated=true;
		}
		else
			System.out.println(oldActor+ "not found");
	}
	//if(isMovieActorUpdated==false)
		//System.out.println(oldActor+ "not found");
	
	return isMovieActorUpdated;
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