package QuizesAnswer;
import java.util.Scanner;
public class Quiz1Scanner {

	private static final String Username = null;

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		Scanner toy= new Scanner (System.in);
		System.out.println("Enter your name please!");
		String name=toy.next();
		System.out.println("your name is :" + name);
	 
		System.out.println("Enter your Age please!");
		int Age=toy.nextInt();
		System.out.println("Your Age is:" + Age);
		
	    System.out.println("Enter  your Usename please!");
	    String Username1=toy.next();
	    System.out.println("Your username is :" + Username1 );
	
	    System.out.println("Are you a PNC costumer");
	    Boolean Answer=toy.nextBoolean();
	    System.out.println("Your Answer is:" + Answer);
	    		
	
	
	
	
	}
	
	

}
