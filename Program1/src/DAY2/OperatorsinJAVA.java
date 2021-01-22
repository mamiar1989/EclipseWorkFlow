package DAY2;

public class OperatorsinJAVA {

	public static void main(String[] args) {
		
		int a=10;
		int b=20;
		System.out.println(a+b);
		System.out.println("---------Arithemetic operators------");
		
		// add a string to the operation 
		System.out.println(" Sum of a and b is:" +(a+b));
		System.out.println("Diff of a and b is:" +(b-a));
		System.out.println(" mul of a and b is:" +(a*b));
		System.out.println(" Div of a and b is:" +(a/b));
		System.out.println(" Mod div of a and b is:" +(a%b));
		
		
		
		System.out.println(a==b);
		//== compare between a and b 
		// it will return a boolean value which will be 
		//false
		System.out.println("---------logicaloperators-------");
		System.out.println(a==b);
		System.out.println(a>b);
		System.out.println(a<b);
		System.out.println(a>=b);
		System.out.println(a<=b);
		System.out.println(a!=b);
		
		// logical operators 
		// works between two boolean 
		
		System.out.println("---------relational operators-------");
		
		boolean x=true;
		boolean y=false;
		System.out.println(x & y);// false
		System.out.println(x||y);// true
		System.out.println(!x);// false
		System.out.println(!y);// false
		
		System.out.println("-------------assignement operators-------");
	a=19;
	System.out.println(a);
        
	
	// homework 
	
	System.out.println("Hello");
	System.out.println("Hello Maria");
	System.out.println(a);
	
	a=74;
	b=36;
	System.out.println(a+b);
	// swap 
	}
	
	
	

}
