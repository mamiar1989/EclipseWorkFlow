import java.util.Scanner;

public class LearnScanner {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		
		// class name is Scanner 
		// How to create an object of Scanner class;
		
		// className objectName=new constractorOfClass
		
		Scanner input = new Scanner(System.in);
		
		System.out.println("enter your first name");
		String firstName= input.nextLine();
		System.out.println("First name:"+ firstName);
		
		
		

		System.out.println("enter your last name");
		String lastName= input.nextLine();
		System.out.println("last name:" + lastName);
		
System.out.println("Full Name:"+" "+ firstName+" "+ lastName );
		
		System.out.println("Enter coursee fee");
		double cfee=input.nextDouble();
		System.out.println("course fee is " +cfee);
		 
		System.out.println("Enter your age");
		int age= input.nextInt();
		System.out.println("My age is:" + age);
		// to close scanner 
		input.close();
		
		
	}

}
