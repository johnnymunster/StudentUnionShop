/*
StudentUnion.java
J Munster
8 10 2018
*/

public class StudentUnion{

	//data members
	private int capAmount;
	private int hoodyAmount;
	private int shirtAmount;
	private final double CAPCOST;
	private final double HOODYCOST;
	private final double SHIRTCOST;
	private double totalCost;


	//constructor
	//declare variables
	public StudentUnion(){
		capAmount=0;
		hoodyAmount=0;
		shirtAmount=0;
		CAPCOST=5.00;
		HOODYCOST=10.00;
		SHIRTCOST=20.00;
		totalCost=0.0;
	}

	//setters = inputs = we need 3
	//return in the cap amount
	public void setCapAmount(int capAmount){
		//saves the variable in capAmount
		this.capAmount=capAmount;
	}
	public void setHoodyAmount(int hoodyAmount){
		this.hoodyAmount=hoodyAmount;
	}
	public void setShirtAmount(int shirtAmount){
		this.shirtAmount=shirtAmount;
	}

	//compute - calcs = 1 calc
	public void compute(){

		totalCost=(capAmount*CAPCOST)+(hoodyAmount*HOODYCOST)+(shirtAmount*SHIRTCOST);
	}

	//Getters = outputs = 1 output
	public double getTotalCost(){
		//return the totalCost to the App
		return totalCost;
	}

}//ends class signature