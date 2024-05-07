package homeworkweek8.cylinder;

public class Cylinder extends Circle {


        // Field representing the height of the cylinder
        private double height;

        // Constructor to initialize the radius and height
        public Cylinder(double radius, double height) {
            // Call the constructor of the parent class (Circle)
            super(radius);
            // Set the height, ensuring it is not negative
            this.height = height >= 0 ? height : 0;
        }

        // Method to get the height
        public double getHeight() {
            return this.height;
        }

        // Method to calculate the volume of the cylinder
        public double getVolume() {
            // Calculate the volume using the formula area * height
            return getArea() * this.height;
        }
    }

