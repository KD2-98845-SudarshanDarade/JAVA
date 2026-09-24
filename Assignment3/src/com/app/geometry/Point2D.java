package com.app.geometry;
import java.lang.Math;
import java.util.*;

public class Point2D {
	double x;
	double y;
	
	public Point2D() {
		x=0.0;
		y=0.0;
	}

	public Point2D(double x, double y) {
		this.x = x;
		this.y = y;
	}

	public double getX() {
		return x;
	}

	public void setX(double x) {
		this.x = x;
	}

	public double getY() {
		return y;
	}

	public void setY(double y) {
		this.y = y;
	}
	
	public String getDetails() {
		return ("Cordinates of point " + "x : " + x + ", Y : " + y);
	}
	
	

	public boolean isEqual(Point2D t) {
		return this.x==t.x && this.y==t.y;
	}
	

	public void acceptRecord(){
		Scanner sc = new Scanner(System.in);
		System.out.print("Enter x cordinate :");
		x = sc.nextDouble();
		System.out.print("Enter y cordinate :");
		y = sc.nextDouble();
	}
	
	public double calculateDistance(Point2D a) {
		return Math.sqrt(Math.pow(this.x-a.x, 2)+Math.pow(this.y-a.y, 2));
	}
}
