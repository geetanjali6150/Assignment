
abstract class CricketTeam
{ 

	CricketTeam()
	{
 	System.out.println("CricketTeams");
 	System.out.println("*************");
	}
	
    void  Batsman()
    {
    	 System.out.println("Team has Batsman");
 		
    }
    void Bowlers()
	{
		 System.out.println("Team has Bowlers");
		
	}
	void   WicketKeeper()
	{
		 System.out.println("Team has WicketKeeper");
	}
void  allrounders()
{
	 System.out.println("Team has WicketKeeper");
}
	


}
 class Men extends CricketTeam

{ Men()
	 {
	System.out.println("Mens team");
	 }
	

	
}
class Women extends CricketTeam

{
	Women()
	{
		System.out.println("Women Team");
	}
}
public class DXC
{
	public static void main(String args[])
	{
		CricketTeam c=new Men();
		
		System.out.println(c instanceof Men);
	    c.allrounders();
	    c.Batsman();
	    c.Bowlers();
	    c.WicketKeeper();
	    System.out.println("*********************");
	    
	c=new Women();
	System.out.println(c instanceof Women);
	    c.allrounders();
	    c.Batsman();
	    c.Bowlers();
	    c.WicketKeeper();
	}
}