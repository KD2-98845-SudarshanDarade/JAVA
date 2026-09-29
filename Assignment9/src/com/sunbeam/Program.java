package com.sunbeam;

import java.util.ArrayList;
import java.util.Collections;
import java.util.Comparator;
import java.util.Iterator;
import java.util.List;
import java.util.Scanner;

class Student {
	private int roll;
	private String name;
	private double marks;

	public Student() {
		super();
	}

	public Student(int roll, String name, double marks) {
		super();
		this.roll = roll;
		this.name = name;
		this.marks = marks;
	}

	public int getRoll() {
		return roll;
	}

	public void setRoll(int roll) {
		this.roll = roll;
	}

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public double getMarks() {
		return marks;
	}

	public void setMarks(double marks) {
		this.marks = marks;
	}

	@Override
	public boolean equals(Object obj) {
		if (obj == null)
			return false;
		if (this == obj)
			return true;
		if (!(obj instanceof Student))
			return false;
		Student other = (Student) obj;
		return this.roll == other.roll;
	}

	@Override
	public String toString() {
		return "Student [roll=" + roll + ", name=" + name + ", marks=" + marks + "]";
	}
}

class SortByRoll implements Comparator<Student> {
	@Override
	public int compare(Student x, Student y) {
		return x.getRoll() - y.getRoll();
	}
}

class SortByName implements Comparator<Student> {
	@Override
	public int compare(Student x, Student y) {
		return x.getName().compareTo(y.getName());
	}
}

class SortByMarks implements Comparator<Student> {
	@Override
	public int compare(Student x, Student y) {
		return Double.compare(x.getMarks(), y.getMarks());
	}
}

public class Program {
	public static Scanner sc = new Scanner(System.in);
	public static List<Student> list = new ArrayList<>();

	// Accept records in an array
	public static Student[] getInstances() {
		System.out.println("How many students do you want to add?");
		int n = sc.nextInt();

		Student[] arr = new Student[n];
		for (int i = 0; i < n; i++) {
			System.out.println("Enter the RollNo");
			int roll = sc.nextInt();

			System.out.println("Enter the Name");
			String name = sc.next();

			System.out.println("Enter the Marks");
			double marks = sc.nextDouble();

			arr[i] = new Student(roll, name, marks);
		}
		return arr;
	}

	// Add the array records in the collection
	public static void acceptRecord(Student[] arr) {
		for (Student s1 : arr) {
			list.add(s1);
		}
	}

	// Display all students using iterator
	public static void displayRecord() {
		Iterator<Student> it = list.iterator();
		while (it.hasNext()) {
			Student student = it.next();
			System.out.println(student);
		}
	}

	// Search student by roll no
	public static void searchStudentByRollNo() {
		System.out.println("Enter the RollNo to search");
		int roll = sc.nextInt();

		Student key = new Student();
		key.setRoll(roll);

		if (list.contains(key)) {
			int idx = list.indexOf(key);
			System.out.println("Student is present");
			System.out.println(list.get(idx));
		} else
			System.out.println("Student not found");
	}

	// Remove student by roll no
	public static void removeStudent() {
		System.out.println("Enter the RollNo to remove");
		int roll = sc.nextInt();

		Student key = new Student();
		key.setRoll(roll);

		if (list.contains(key)) {
			list.remove(key);
			System.out.println("Student removed");
		} else
			System.out.println("Student not found");
	}

	// Update student by roll no
	public static void updateStudent() {
		System.out.println("Enter the RollNo to update");
		int roll = sc.nextInt();

		Student key = new Student();
		key.setRoll(roll);

		if (list.contains(key)) {
			int idx = list.indexOf(key);
			Student s = list.get(idx);

			System.out.println("Enter the new Name");
			s.setName(sc.next());

			System.out.println("Enter the new Marks");
			s.setMarks(sc.nextDouble());

			System.out.println("Student updated");
		} else
			System.out.println("Student not found");
	}

	public static int menuList() {
		int choice;
		System.out.println("0.Exit");
		System.out.println("1.Add Student");
		System.out.println("2.Display Students");
		System.out.println("3.Search Student by Roll No");
		System.out.println("4.Remove Student");
		System.out.println("5.Update Student");
		System.out.println("6.Sort the Student by Roll No");
		System.out.println("7.Sort the Student by Name");
		System.out.println("8.Sort the Student by Marks");
		System.out.println("Enter the choice");
		choice = sc.nextInt();
		return choice;
	}

	public static void main(String[] args) {
		int choice;
		while ((choice = menuList()) != 0) {
			switch (choice) {
			case 1:
				Student[] arr = Program.getInstances();
				Program.acceptRecord(arr);
				break;
			case 2:
				Program.displayRecord();
				break;
			case 3:
				Program.searchStudentByRollNo();
				break;
			case 4:
				Program.removeStudent();
				break;
			case 5:
				Program.updateStudent();
				break;
			case 6:
				Collections.sort(list, new SortByRoll());
				break;
			case 7:
				Collections.sort(list, new SortByName());
				break;
			case 8:
				Collections.sort(list, new SortByMarks());
				break;
			default:
				System.out.println("Invalid choice");
				break;
			}
		}
	}
}