
public class AccessModifier {

	
	protected static int salary=4000;// only accessible from the classes of the same package, we will protect the info unless u give the access to certain people

	private static int age=24;// private can be called in the same class
	
	public static void main(String[] args) {// can be called 
		

		// Access modifier/ Access specifier we can use them in class variable or method
		// private: we can use or call only within the class where it is located
		//public: we can use or call within the class where it is located and
		//other class.
		//protected:  only accessible from all the classes that have a particular package
		/*
		*/
		// public
		//private
		//protected
		//default
		System.out.println(LearnDatatype.mobileBrand);  // created in another project but can be used in other project 
		System.out.println(LearnDatatype.vehicule);
		System.out.println(AccessModifier.age);
	
	
	
	
	
	}

}
