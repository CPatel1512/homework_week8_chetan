package homeworkweek8.poolarea;

public class Cuboid extends Rectangle {

    // Field representing the height of the cuboid
    private double height;

    // Constructor to initialize width, length, and height
    public Cuboid(double width, double length, double height) {
        // Call the constructor of the parent class (Rectangle)
        super(width, length);
        // Set the height, ensuring it is not negative
        this.height = height >= 0 ? height : 0;
    }

    // Method to get the height
    public double getHeight() {
        return this.height;
    }

    // Method to calculate the volume of the cuboid
    public double getVolume() {
        // Calculate the volume using the formula area * height
        return getArea() * height;
    }
}
