import java.util.Scanner;
public class TestData2 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		Scanner input=new Scanner (System.in);
		System.out.println("Input the First Number");
		int a=input.nextInt();
		System.out.println("The Frist numert is:" + a);
		
		System.out.println("Input the Second Number");
		int b=input.nextInt();
		System.out.println("The Second Number is:");
		
		System.out.println("Expected Output:"+ a*b );
		
		
	}

}
