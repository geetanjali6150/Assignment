class Employee
{
	int empId;
	 		String ename;   
	 		String	     	designation;           
	 			double   basic;            
				double	hra;
				Employee(int empId,String ename,String designation,double basic)
				{
					this.empId=empId;
					this.ename=ename;
					this.designation=designation;
					this.basic=basic;
					
				}
				void printDET()
				{
				System.out.println("Employee name:"+ename);
				System.out.println("Employee designation:"+designation);
				System.out.println("Employee basic salary:"+basic);
				
				}
				
				void CaculateHRA()
				{
					if(designation=="Manager")
					{
						hra=(basic*10)/100;
						
					}
					if (designation=="Officer")
					{
						hra=(basic*12)/100;
						
					}
					if(designation=="Clerk")
					{
						hra=(basic*5)/100;
					}
				System.out.println("Employee hra"+hra);
				
				
				}

}
public class ProblemStatement1 {
public static void main(String args[])
{
	Employee e=new Employee(1,"geet","Clerk",2500);
	e.printDET();
	e.CaculateHRA();
	
}
}
