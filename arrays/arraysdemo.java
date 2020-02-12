package arrays;

public class arraysdemo {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

	
	//array: arrays is collection of elements of the same data type
	//2 types of arrays
	//1) single dimensional
	//2) two/multi dimensional
	
	//single dimensional arrays
	//1) declare an array
//2) insert values into arrays
	//3) find size of an arrays
//4) read values from an arrays

	
	int a[]=new int[5]; // declared array with size 5, starting index is 0, last index is 9
	a[0]=100;
	a[1]=200;		
	a[2]=300;
	a[3]=400;
	a[4]=500;
			
			
System.out.println("length of an array:" +a.length); //print length size of an arrays
	System.out.println(a[2]); 
	
	for(int i=0;i<=a.length-1;i++)
	{
	System.out.println(a[i]);
	
	}
	}
}



