package inheritance;



Class A //parent class
{

int a;

void display()
{
	System.out.println(a);
	
	
}


Class B extends A 

// b is  child class, a is parent class

int b;
void print()
{
	system.out.println(b);
}


public class inheritancedemo1 {

	
public static void main(String[] args) {
		// TODO Auto-generated method stub

A aobj=new A();
aobj.A=100;
aobj.display();

B aobj=new B();
aobj.B=200;
bobj A=100;

aobj.display();
aobj.print();

	
	}

}
