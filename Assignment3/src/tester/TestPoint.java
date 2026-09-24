package tester;
import com.app.geometry.Point2D;

public class TestPoint {
	
  public static void main(String[] args) {
	  Point2D pt1 = new Point2D();
	  System.out.println("Enter co-ordinate of 1st point :");
	  pt1.acceptRecord();
//	  pt1.display();
	  Point2D pt2 = new Point2D();
	  System.out.println("Enter co-ordinate of 2nd point :");
	  pt2.acceptRecord();
//	  pt1.display();
	  
	  System.out.println(pt1.getDetails());
	  System.out.println(pt2.getDetails());
	  if(pt1.isEqual(pt2)) {
		  System.out.println("Points are Equal");
	  }
	  else {
		  System.out.print("Points are Different ");
		  System.out.println("Difference between points are : "+pt1.calculateDistance(pt2));
	  }
	  
	  
	  
  }
}
