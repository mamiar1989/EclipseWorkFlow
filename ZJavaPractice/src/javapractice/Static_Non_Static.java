package javapractice;

public class Static_Non_Static {

	public static String car="Honda";
	public static String bus="yotota";
	String WorkPlace;
	int yearofE;
	double wage;
	
	public static void main(String[] args) {
		System.out.println(car);
		System.out.println(bus);
		
		
		Static_Non_Static obj = new Static_Non_Static(); 
		obj.wage =500.00;
		obj.yearofE=5;
		System.out.println(obj.wage);
		System.out.println(obj.yearofE);
		
		
		
		
		
		
	}
	
	
	
	
	
}
