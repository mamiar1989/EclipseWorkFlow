package javapractice;


public class Student {
	
	int rno;
    String name;
	public Student (){
                    }
	public Student ( String srg,int n ){
	}
	
	int n=rno;
	String srg=name;

	public static void main(String[] args) {
		
		Student S1 = new Student();
		Student S2= new Student ();
		S1.name="ABC";
		S1.rno= 123;
		S2.n=426;
		S2.name="DEF";
		System.out.println(S1.name);
		System.out.println(S1.rno);	
		System.out.println(S2.n);
		System.out.println(S2.name);
	}
		
		
		
	
		
		
		
		
		
	}


