package homeworkweek8.carpetcostcalculator;

public class Floor {
    // Fields representing the width and length of the floor
    private double width;
    private double length;

    // Constructor to initialize the fields
    public Floor(double width, double length) {
        // Set width and length, ensuring they are not negative
        this.width = width >= 0 ? width : 0;
        this.length = length >= 0 ? length : 0;
    }

    // Method to calculate the area of the floor
    public double getArea() {
        return width * length;
    }
}
