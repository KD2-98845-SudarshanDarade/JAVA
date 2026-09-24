import java.util.*;

public class Q1 {

	public static void main(String[] args) {
       Scanner sc = new Scanner(System.in);
       System.out.println("Enter number :");
       int n = sc.nextInt();
       String toBinary = Integer.toBinaryString(n);
       String toOctal = Integer.toOctalString(n);
       String toHex = Integer.toHexString(n);
       System.out.println("Binary : " + toBinary);
       System.out.println("Octal :" + toOctal);
       System.out.println("Hexadecimal : " + toHex);
	}
}
