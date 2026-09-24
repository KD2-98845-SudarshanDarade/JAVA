import java.util.*;
public class ExceptionHandling {
	
	static double divide(double num, double den) {
		double res = num / den;
		return res;
	}
	
//	public static void main(String[] args) {
//		Scanner sc = new Scanner(System.in);
//		try {
//			System.out.print("Enter num : ");
//			double num = sc.nextDouble();
//			System.out.print("Enter den : ");
//			double den = sc.nextDouble();
//			double result = divide(num , den);
//			System.out.println("Result : " + result);
//		} catch (ArithmeticException e) {
//             System.out.println("Divide by zero");
//		} catch (InputMismatchException i) {
//			System.out.println("Input should be number");
//		}
//	}
	
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		try {
			System.out.print("Enter num : ");
			double num = sc.nextDouble();
			System.out.print("Enter den : ");
			double den = sc.nextDouble();
			double result = divide(num , den);
			System.out.println("Result : " + result);
		} catch (InputMismatchException | ArithmeticException e) {
             System.out.println("Invalid i/p");
		}
	}
}
