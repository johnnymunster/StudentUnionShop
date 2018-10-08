/*
StudentUnionApp.java
J Munster
8 10 2018
*/
import java.util.*;

public class StudentUnionApp{
	public static void main(String args[]){

	//variables
	int capAmount;
	int hoodyAmount;
	int shirtAmount;
	final double CAPCOST;
	final double HOODYCOST;
	final double SHIRTCOST;
	double totalCost;

	//objects - external
	Scanner keyboard;
	keyboard=new Scanner(System.in);

	//bring in StudentUnion page
	StudentUnion myStudentUnion;
	myStudentUnion=new StudentUnion();

	//input - ask the user a question (we need 3)
	//ask the question
	System.out.println("how many caps do you want?");
	//store the answer
	capAmount=keyboard.nextInt();
	myStudentUnion.setCapAmount(capAmount);

	//ask the question
	System.out.println("how many shirts do you want?");
	//store the answer
	hoodyAmount=keyboard.nextInt();
	myStudentUnion.setHoodyAmount(hoodyAmount);

	//ask the question
	System.out.println("how many shirts do you want?");
	//store the answer
	shirtAmount=keyboard.nextInt();
	myStudentUnion.setShirtAmount(shirtAmount);


	//process - Calcualte
	myStudentUnion.compute();

	//output
	totalCost=myStudentUnion.getTotalCost();
	System.out.println("So your total cost is "+totalCost);

	}

}//ends signature class