import java.nio.file.spi.FileSystemProvider;
import java.util.Scanner;
abstract class Fruit{
	String color;
	Double weight;
	String name;
	Boolean isFresh;
	
	public String getColor() {
		return color;
	}

	public void setColor(String color) {
		this.color = color;
	}

	public Double getWeight() {
		return weight;
	}

	public void setWeight(Double weight) {
		this.weight = weight;
	}

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public Boolean getIsFresh() {
		return isFresh;
	}

	public void setIsFresh(Boolean isFresh) {
		this.isFresh = isFresh;
	}

	void accept() {
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter Fruits weight");
		weight = sc.nextDouble();
		System.out.println("Enter is fruit fresh or not");
		isFresh = sc.nextBoolean();
	}
	
	public String toString() {
		return (" name : " + name + " weight :" + weight 
				+ " color : " + color + " isFresh : " + isFresh);
	}
//	public Fruit(String color, Double weight, String name, Boolean isFresh) {
//		this.color = color;
//		this.weight = weight;
//		this.name = name;
//		this.isFresh = isFresh;
//	}
	
	abstract void setDetails();
	
	abstract public String taste();
	
}

class Apple extends Fruit{
	

	void setDetails() {
		color = "Red";
		name = "Apple";		
	}
	
	public String taste() {
		return "Sweet and sour";
	}
}

class Orange extends Fruit{
	void setDetails() {
		color = "Orange";
		name = "Orange";		
	}
	public String taste() {
		return "Sour";
	}
}

class Mango extends Fruit{
	void setDetails() {
		color = "Yellow";
		name = "Mango";		
	}
	public String taste() {
		return "Sweet";
	}
}

public class FruitAssignment {
	public static int menuList() {
		int choice;
		Scanner sc = new Scanner(System.in);
		System.out.println("0.Exit");
		System.out.println("1.Apple");
		System.out.println("2.Orange");
		System.out.println("3.Mango");
		System.out.println("4.Display names of all fruits in your cart");
		System.out.println("5.Display details of cart");
		System.out.println("6.Display tastes of all");
		System.out.print("Enter your choice : ");
		choice = sc.nextInt();
		return choice;
	}
  public static void main(String[] args) {
	  Scanner sc = new Scanner(System.in);
	  int choice;
	  System.out.println("Enter size of basket :");
	  int size = sc.nextInt();
	  int count = 0;
	  Fruit[] basket = new Fruit[size];
	  while((choice = menuList()) != 0) {
		  Fruit fruit = null;
		  switch (choice) {
		case 1:
			if(count == size) {
				System.out.println("Your cart is full");
				break;
			}
			fruit = new Apple();
			break;
		case 2:
			if(count == size) {
				System.out.println("Your cart is full");
				break;
			}
			fruit = new Orange();
			break;
		case 3:
			if(count == size) {
				System.out.println("Your cart is full");
				break;
			}
			fruit = new Mango();
		    break;
		case 4:
			System.out.println("==========Names of all fruits============");
			for(int i =0;i<count;i++) {
				System.out.println(basket[i].getName());
			}
			System.out.println("=========================================");
			break;
		case 5:
			System.out.println("==========Details of all fruits=============");
			for(int i =0;i<count;i++) {
				System.out.println(basket[i].toString());
				if(basket[i].getIsFresh() == true) {
					System.out.println("Fruit is fresh");
				} else {
					System.out.println("Fruit is not fresh");
				};
			}
			System.out.println("==============================================");
			break;
		case 6:
			System.out.println("============Tastes of all stale fruits=============");
			for(int i=0;i<count;i++) {
				if(basket[i].getIsFresh() == false) {
					System.out.println(basket[i].taste());
				};
			}
			System.out.println("================================================");
			break;
		case  7:
			 System.out.println("Enter index at which");
			 int input = sc.nextInt();
			 if(input > count || input < 0) {
				 System.out.println("Invalid input");
				 } else {
				 basket[input].setIsFresh(false);
				 System.out.println("========Fruit updated==========");
				 break;
			 }
		case 8:
			for(int i=0;i<count;i++) {
				if((basket[i].taste()) == "Sour") {
					basket[i].setIsFresh(false);
				}
			}
		default:
			break;
		}
		  if(fruit!= null) {
			  fruit.setDetails();
				fruit.accept();
				basket[count++] = fruit;
		  }
	  }
  }
}
