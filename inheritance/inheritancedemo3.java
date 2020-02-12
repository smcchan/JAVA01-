package inheritance;

class parent
{
	
	int a;
	void display()
	{
		
		System.out.println(a);
	}

class child1 extends parent
{
int y;
void show()
{
	System.out.println(y);
}



public class inheritancedemo3 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

	child1 c1=new child1();
	
		c1.a=100;
		c1.b=200;
		c1.display();
		c1.print();
	}
}


