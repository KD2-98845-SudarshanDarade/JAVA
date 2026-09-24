package com.sunbeam;

import java.util.ArrayList;
import java.util.Comparator;
import java.util.List;
import java.util.ListIterator;
import java.util.Scanner;

public class Program {
	public static Scanner sc = new Scanner(System.in);
	public static List<Book> list = new ArrayList<>();

	public static int menuList() {
		System.out.println("0.Exit");
		System.out.println("1.AddBook");
		System.out.println("2.Display books in frwd direction");
		System.out.println("3.Display book in bkwrd direction");
		System.out.println("4.Delete book at given index");
		System.out.println("5.Sort in desc order");
		int choice = sc.nextInt();
		return choice;
	}

	public static Book acceptBookDetails() {
		System.out.print("Enter book isbn : ");
		String isbn = sc.next();
		System.out.print("Enter Price : ");
		double price = sc.nextDouble();
		System.out.print("Enter Author Name : ");
		String authorName = sc.next();
		System.out.print("Enter quantity : ");
		int quantity = sc.nextInt();
		return new Book(isbn, price, authorName, quantity);
	}
	
	public static void deleteBook(int indx) {
		Book getBook = list.get(indx);
		list.remove(getBook);
	}

	public static void addBook() {
		list.add(acceptBookDetails());
	}

	public static void printBooks() {
		System.out.println("=====================");
		for (int i = 0; i < list.size(); i++) {
			System.out.println(list.get(i));
		}
		System.out.println("=====================");
	}

	public static void main(String[] args) {
		int choice;
		while((choice = menuList()) != 0) {
			switch(choice) {
			case 1:
				addBook();
				break;
			case 2:
				ListIterator<Book> trav = list.listIterator();
				while(trav.hasNext()) {
					Book ele = trav.next();
					System.out.println(ele + " ");
				}
				break;
			case 3:
				trav = list.listIterator(list.size());
				while(trav.hasPrevious()) {
					Book ele = trav.previous();
					System.out.println(ele + " ");
				}
				break;
			case 4:
				System.out.print("Enter index : ");
				int indx = sc.nextInt();
				deleteBook(indx);
				break;
			case 5:
				list.sort(new sortByPrice()); 
				printBooks();
				break;
			}
		}
	}

}

class sortByPrice implements Comparator<Book>{
	public int compare(Book x, Book y) {
		return Double.compare(y.getPrice(), x.getPrice());
	}
}











