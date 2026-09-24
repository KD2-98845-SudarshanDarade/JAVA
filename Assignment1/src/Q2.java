import java.util.*;

public class Q2 {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter first number :");
		if(sc.hasNextDouble()) {
			if(sc.hasNextInt()) {
				System.out.println("Err : Number is not double");
				return;
			}
		} else {
			System.out.println("Err : Number is not double");
			return;
		}
		double num1 = sc.nextInt();
		System.out.println("Enter second number : ");
		if(sc.hasNextDouble()) {
			if(sc.hasNextInt()) {
				System.out.println("Err : Number is not double");
				return;
			}
		} else {
			System.out.println("Err : Number is not double");
			return;
		}
		double num2 = sc.nextInt();
		double avg = (num1 + num2)/2;
		System.out.println("Average of both :" + avg);
		
	}
}
