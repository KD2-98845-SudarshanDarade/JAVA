
import java.util.Scanner;

class TestDate{
	private Date d = new Date();
	private Scanner sc = new Scanner(System.in);

		public void display() {
			System.out.println();
			System.out.println("DATE :  " + d.getDay()+"/"+d.getMonth()+"/"+d.getYear());
		}
		
		public void accept() {
			System.out.print("Day : ");
			int s = sc.nextInt();
			d.setDay(s);
		
			System.out.print("Month : ");
			int m = sc.nextInt();
			d.setMonth(m);
			
			System.out.print("Year: ");
			int n = sc.nextInt();
			d.setYear(n);
			
	}
	
}

class Date {
		private int day;
		private int month;
		private int year;
		
		Date(){
			this.day = 0;
			this.month = 0;
			this.year = 0;
		}
		
		
		Date(int day, int month, int year){
			this.day = day;
			this.month = month;
			this.year = year;
		}
		
		// getters
		
		public int getDay() {
			return this.day;
		}
		
		public int getMonth() {
			return this.month;
		}
		
		public int getYear() {
			return this.year;
		}
		
		
		//setters
		
		public  void setDay(int day) {
			this.day = day;
		}
		
		public  void setMonth(int month) {
			this.month = month;
		}
		
		public  void setYear(int year) {
			this.year = year;
		}
}

public class Q3 {
	public static void main(String [] args) {
		TestDate d = new TestDate();
		d.accept();
		d.display();
	}
}