package opps;

public class Studentankur {

	
	int sid;
	String sname;
	char grade;
	
	void getValues(int id,String name,char g)
	//method
	
	{
		
		sid=id;
		sname=name;
		grade=g;
	}
	
	void display()
	{
		System.out.println(sid+"  "+sname+ "    "+ grade);
	}
	
	
	
	
	}


