package javapractice;

public class Learn_ObjectAndClass {

	public static void main(String[] args) {
		int ver1 =5;
		double var2 =3.65;
		
		aircraft cessna172 = new aircraft(); // create object of class airceaft
	    aircraft piperSaratoga= new aircraft();
	    
	    cessna172.cruisSpeed=201;
	    cessna172.fuelBurnRate=20.5;
	    cessna172.fuelCapacity=102.5;
	    cessna172.passengers=6;
	    System.out.println("cessna172 cruisSpeed is" + " " + cessna172.passengers);
	    System.out.println("cessna172 number of passangers is" + " "+ cessna172.passengers);
	    System.out.println("cessna172 fuel burn is :"+ " "+ cessna172.fuelBurnRate + " "+ " g/h" );
	
	
	}

}

class aircraft{ 
	int passengers;
	int cruisSpeed;
	double fuelCapacity;
	double fuelBurnRate;
	
	



}
