//3. Display food menu to user. User will select items from menu along with the
//quantity. (eg 1. Dosa 2. Samosa 3. Idli ... 10 . Generate Bill ) Assign fixed
//prices to food items(hard code the prices) When user enters 'Generate Bill'
//option , display total bill & exit.
//import java.nio.file.spi.FileSystemProvider;
import java.util.*;
public class Q3 {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int select;
		int total = 0;
		do {
			System.out.println("0. EXIT and PrintBill");
			System.out.println("1. Dosa, Price : 50");
			System.out.println("2. Samosa, Price : 100");
			System.out.println("3. Idli, Price : 80");
			System.out.println("4. Pav bhaji, Price : 150");
			System.out.println("5. Poha, Price : 30");
			System.out.println("6. Uttapam, Price : 90");
			System.out.println("7. Kachori, Price : 60");
			System.out.println("8. Tea, Price : 25");
			System.out.println("9. Egg, Price : 10");
			System.out.println("10. Pizza, Price : 220");
			select = sc.nextInt();
			switch(select) {
			case 1 :
				System.out.println("Enter quatity : ");
				int n = sc.nextInt();
				total = total + (50 * n);
				break;
			case 2 :
				System.out.println("Enter quatity : ");
				n = sc.nextInt();
				total = total + (100 * n);
				break;
			case 3 :
				System.out.println("Enter quatity : ");
				n = sc.nextInt();
				total = total + (80 * n);
				break;
			case 4 :
				System.out.println("Enter quatity : ");
				n = sc.nextInt();
				total = total + (150 * n);
				break;
			case 5 :
				System.out.println("Enter quatity : ");
				n = sc.nextInt();
				total = total + (30 * n);
				break;
			case 6 :
				System.out.println("Enter quatity : ");
				n = sc.nextInt();
				total = total + (90 * n);
				break;
			case 7 :
				System.out.println("Enter quatity : ");
				n = sc.nextInt();
				total = total + (60 * n);
				break;
			case 8 :
				System.out.println("Enter quatity : ");
				n = sc.nextInt();
				total = total + (25 * n);
				break;
			case 9 :
				System.out.println("Enter quatity : ");
				n = sc.nextInt();
				total = total + (10 * n);
				break;
			case 10 :
				System.out.println("Enter quatity : ");
				n = sc.nextInt();
				total = total + (220 * n);
				break;
			}
		} while (select != 0);
		
		
		System.out.println("TOTAL BILL :" + total);
	}
}

