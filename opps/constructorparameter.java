package opps;

public class constructorparameter {

	int x;
	int y;
	
	
	constructorparameter(int a, int b)
	{
		
		x=a;
		y=b;
		
		
		
	}
	
	void display()
	{
		System.out.println(x+y);
	}
	
	
	
	
public static void main(String[] args) {
		// TODO Auto-generated method stub

	constructorparameter cm1 = new constructorparameter(100,200);
	cm1.display();
	
	
	
	
	
	
	
	
	
	
	
	
	}

}
