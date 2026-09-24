import java.util.*;
class creditLimitCalculator{
	int accountNumber;
	int initBalance;
	int totalCharges;
	int totalCredits;
	int creditLimit;
	
	void acceptRecord() {
		Scanner sc = new Scanner(System.in);
		System.out.print("Enter Account number : ");
		accountNumber = sc.nextInt();
		System.out.print("Enter Initial balance : ");
		initBalance = sc.nextInt();
		System.out.print("Enter Total charges : ");
		totalCharges = sc.nextInt();
		System.out.print("Enter Total credits : ");
		totalCredits = sc.nextInt();
		System.out.print("Enter Credit limit : ");
		creditLimit = sc.nextInt();
	}
	
	   int caluculateNewBal() {
		   int newBal = initBalance + totalCharges - totalCredits;
	       return newBal;
	    }
	   
	    void displayNewBal() {
	    	int newBal= caluculateNewBal();
	    	 if(newBal > creditLimit) {
				   System.out.println("Credit limit exceeded");
			   }
	    	 else {
		    	 System.out.println("New balance : " + newBal);
	    	 }
	    }
}



public class CreditLimit {

	public static void main(String[] args) {
		creditLimitCalculator clc = new creditLimitCalculator();
		clc.acceptRecord();
		clc.displayNewBal();
	}

}
