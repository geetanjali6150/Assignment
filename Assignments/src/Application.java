class Company
{
	String compname;
	static void comp(String compname)
	{
		
		System.out.println("Company name is:"+compname);
		}
	}
class Customer extends Company
{

int	cid=1;
String	cname="Ram";
void display()
{
System.out.println("Customer name:"+cname);
System.out.println("Customer id:"+cid);
order o=new order();
o.print(1,44);
Item i=new Item();
i.display(43,"Bat");
regCustomer r=new regCustomer();
r.regCus();


}}
class order 
{
	int cid;
	int totalorder;
	
	void print(int cid,int totalorder) {
	
System.out.println("Order Id:"+cid)	;
System.out.println("Total orders:"+totalorder);

	}
	
}

class regCustomer 
{
	void regCus()
	{
	System.out.println("If customer is a register customer");
	}
    Discount d=new Discount();



}
class Item
{
	int itemcode;
	String itemName;
	void display(int itemcode,String itemname)
	{		System.out.println("Item Code:"+itemcode);
	System.out.println("Item Name:"+itemname);
	}	}
class Discount
{ 
	
	 Discount()
	{
	System.out.println("Customer gets discount");
	}}
public class Application
{
	public static void main(String args[])
	{
		
Customer c=new Customer();
c.comp("DXC");
c.display();






	}
}
