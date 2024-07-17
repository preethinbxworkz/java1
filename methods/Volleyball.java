class Volleyball{
static String name;
static int ageOfParticipant;
static int gradeOfParticipant;
static String dist;
static String size;
static String fatherName;
static long contact;


public static void Registration(String participantName,int age,int grade,String schoolDist,String shirtSize,String parentName,long emergencyContact)
{
	name=participantName;
	ageOfParticipant=age;
	gradeOfParticipant=grade;
	dist=schoolDist;
	size=shirtSize;
	fatherName=parentName;
	contact=emergencyContact;
}
public static void details()
{
	System.out.println("Participant Name: "+name);
	System.out.println("Age: "+ageOfParticipant);
	System.out.println("Grade: "+gradeOfParticipant);
	System.out.println("Dist: "+dist);
	System.out.println("Shirt size: "+size);
	System.out.println("Parent's Name: "+fatherName);
	System.out.println("Emergency Contact num: "+contact);
	} }