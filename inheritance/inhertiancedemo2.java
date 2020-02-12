package inheritance;

class A
{

	
	int A;
	void display()
	
	{
		System.out.println(A);
	}
}
   class B extends A
	{
		int B;
		void print()
		{

System.out.println(B);
		}
	}
	
class C extends B
{
	int C;
	void show()
	{
		System.out.println(C);
	}
	
}

public class inhertiancedemo2 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

	C cobj = new C();
	cobj.A=10;
	cobj.B=20;
	cobj.C=30;
	
	cobj.display();
	cobj.print();
	cobj.show();
	
	
	}

}
