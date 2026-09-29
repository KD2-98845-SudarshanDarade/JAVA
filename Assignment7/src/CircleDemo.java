
// User-defined exception
class NegativeDiameterException extends Exception {

    public NegativeDiameterException(String message) {
        super(message);
    }
}


// Circle class
class Circle {

    // Attributes
    private double myX;
    private double myY;
    private double myDiameter;

    // Default constructor
    public Circle() {
        myX = 0;
        myY = 0;
        myDiameter = 100;
    }

    // Accessor for X coordinate
    public double getX() {
        return myX;
    }

    // Accessor for Y coordinate
    public double getY() {
        return myY;
    }

    // Accessor for diameter
    public double getDiameter() {
        return myDiameter;
    }

    // Setter for X coordinate
    public void setX(double x) {
        myX = x;
    }

    // Setter for Y coordinate
    public void setY(double y) {
        myY = y;
    }

    // Setter for diameter
    public void setDiameter(double diameter)
            throws NegativeDiameterException {

        if (diameter < 0) {
            throw new NegativeDiameterException(
                "Diameter cannot be negative"
            );
        }

        myDiameter = diameter;
    }
}


// Main class
public class CircleDemo {

    public static void main(String[] args) {

        Circle c = new Circle();

        System.out.println("X = " + c.getX());
        System.out.println("Y = " + c.getY());
        System.out.println("Diameter = " + c.getDiameter());

        try {

            c.setDiameter(50);

            System.out.println("New Diameter = "
                    + c.getDiameter());

            c.setDiameter(-20);

        }
        catch (NegativeDiameterException e) {

            System.out.println(e.getMessage());
        }
    }
}
