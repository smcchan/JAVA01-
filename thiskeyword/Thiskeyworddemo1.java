package thiskeyword;

public class Thiskeyworddemo1 {


	int a,b;  //instance variable
	
	void getValues (int a, int b) //method variable
	
	{
	this.a=a;
 this.b=b;
 
 
 Void Printvalues()
 
 {
	 System.out.println(a);
	 System.out.println(b);
 }
 
 
	
	}
	
	
	
	public static void main(String[] args) 
	
	{
		// TODO Auto-generated method stub

		Thiskeyworddemo1 th= new Thiskeyworddemo1();
 th.getValues(10,200);
 th.PrintValues();
 
	
	//keyworld "This" is a reference variable in java that refers to current object
	
	
	
	
	}

}
