package com.sunbeam;
import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

interface Stack {
	public static final int STACK_SIZE = 5;
	
	public void push();
	
	public Employee pop();
	
	public void printData();

}

class FixedStack implements Stack {
	static Scanner sc = new Scanner(System.in);
	 Employee []empArr = new Employee[STACK_SIZE];
	 
	 public static Employee acceptRecord() {
		 System.out.println("Enter Id : ");
		 int id = sc.nextInt();
		 System.out.println("Name : ");
		 String name = sc.next();
		 System.out.println("Salary : ");
		 double sal = sc.nextDouble();
		 
		 return new Employee(id, name , sal);
	 }
	 
	 int top = -1;
	@Override
	public void push() {
		
		if(top == STACK_SIZE - 1) {
			System.out.println("Stack is Full");
		}else {			
			Employee employee = acceptRecord();
			top++;
			empArr[top] = employee;
		}
	}

	@Override
	public Employee pop() {
		
		if(top == -1) {
			System.out.println("Stack is Empty");
			return null;
		}
		Employee employee = empArr[top];
		
		empArr[top] = null;
		top--;
		
		return employee ;
		
	}
	@Override
	public void printData() {
		for(Employee employee : empArr) {
			System.out.println(employee.toString());
		}
	}
}

class GrowableStack implements Stack{
	List<Employee> growArr = new ArrayList<>();
	
	int top = -1;
	@Override
	public void push() {
		growArr.add(FixedStack.acceptRecord());
	}

	@Override
	public Employee pop() {
		if(top < 0) {
			System.out.println("Stack is Empty");
			return null;
		}		
		
		top = growArr.size() - 1;
		
		return growArr.remove(top);
	}
	public void printData() {
		for(Employee employee : growArr) {
			System.out.println(employee.toString());
		}
	}
	
}

class Employee {
	private int id;
	private String name;
	private double salary;

	public Employee(int id, String name, double salary) {
		this.id = id;
		this.name = name;
		this.salary = salary;
	}
	
	public int getId() {
		return id;
	}
	
	public void setId(int id) {
		this.id = id;
	}
	
	public String getName() {
		return name;
	}
	
	public void setName(String name) {
		this.name = name;
	}
	
	public double getSalary() {
		return salary;
	}

	public void setSalary(double salary) {
		this.salary = salary;
	}
	
	@Override
	public String toString() {
		return "Employee [id=" + id + ", name=" + name + ", salary=" + salary + "]";
	}
	
}


public class Que1 {
	
	public static Scanner sc = new Scanner(System.in);
	public static int menuList() {
		int choice;
		System.out.println("0. Exit");
		System.out.println("1. Choose Fixed Stack");
		System.out.println("2. Choose Growable Stack");
		System.out.println("3. Push Data");
		System.out.println("4. Pop Data");
		System.out.println("5. Print Data");
		System.out.print("Enter Your Choice : ");
		choice = sc.nextInt();
		return choice;
	}
	
	public static void main(String[] args) {
		int choice;
		Stack stack = null;
		while((choice = menuList()) != 0) {
			switch (choice) {
			case 1:
				stack = new FixedStack();
				System.out.println("Fixed Stack is Choosen");
				System.out.println("Now add Data");
				stack.push();
				break;
			case 2:
				stack = new GrowableStack();
				System.out.println("Growable Stack is Choosen");
				System.out.println("Now add Data");
				stack.push();
				break;
			case 3:
				if(stack == null) {
					System.out.println("No stack is choosen");
				}else {
					stack.push();
					System.out.println("Push Successfull!");
				}
				break;
			case 4:
				if(stack == null) {
					System.out.println("No stack is choosen");
				}else {
					stack.pop();
					System.out.println("Pop successfully !");
				}
				break;
			case 5:
				if(stack == null) {
					System.out.println("No Data is Present");
				}else {
					stack.printData();					
				}
				break;
			}
		}
		sc.close();
	}
}
