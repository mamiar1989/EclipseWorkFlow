
public class Block {
	
	
	public static void display() {   // this is also a method,  we give a name , i gave a name display . we can give any name 
	System.out.println("This is Display Method");
		// the rule is that Static method or variable we can call them by class name in this case learn block is our calss name 
		// we use . to link to the display method, the value of our method is satic for now
	    // this needs to be called inside the main method in order to be printed 
	    // we can create an other block inside another block
	  
	  
	}
	public static void Tree() {
		System.out.println("This is a practical trial ");
		{
			System.out.println("This is to practice how we can create a block inside another block");   // as we called the method insid 
		}                                      // we dont need to do it again
		
	}
	
	public static void Table() {
		
		System.out.println("thsi is a very nice day ");
		 
		System.out.println("thsi is a very beatiful day");
		 
	}
	
	
	
	
	
	
	
	public static void main(String[] args) {// Block

	System.out.println("Hello");
	System.out.println("this is a block");	
	 Block.display();
	 Block.Tree();
	 Block.Table();
	
	/*{// Block start point 
    //block body
    }// block end point*/

	
	
	
	
	
	
}
}