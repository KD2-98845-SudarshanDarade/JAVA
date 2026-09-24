import java.util.Scanner;

public class CheckedException {

	static double  divide(double num , double den) throws Exception {
		if(den == 0) {
			throw new Exception("Divide by zero");
		}
		double  res;
		res = num / den;
		return res;
	}
	public static void main(String[] args) {
		
		Scanner sc = new Scanner(System.in);
		System.out.print("Enter num : ");
		double num = sc.nextDouble();
		System.out.print("Enter den : ");
		double den = sc.nextDouble();
		try {
			double result = divide(num , den);
		} catch (Exception e) {
			System.out.println("Divide by zero");
		}
		
	}

}
