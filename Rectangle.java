public class Rectangle {
    private double length;
    private double breadth;

    // Default constructor
    public Rectangle() {
        this.length = 0.0;
        this.breadth = 0.0;
    }

    // Constructor with one parameter (assuming a square)
    public Rectangle(double side) {
        this.length = side;
        this.breadth = side;
    }

    // Constructor with two parameters
    public Rectangle(double length, double breadth) {
        this.length = length;
        this.breadth = breadth;
    }

    // Method to calculate the area of the rectangle
    public double calculateArea() {
        return length * breadth;
    }

    // Method to display rectangle details
    public void display() {
        System.out.println("Length: " + length + ", Breadth: " + breadth + ", Area: " + calculateArea());
    }

    public static void main(String[] args) {
        // Creating objects using different constructors
        Rectangle rect1 = new Rectangle();
        Rectangle rect2 = new Rectangle(5.0);
        Rectangle rect3 = new Rectangle(4.0, 6.0);

        // Displaying the details of each rectangle
        rect1.display();
        rect2.display();
        rect3.display();
    }
}