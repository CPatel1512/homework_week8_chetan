package homeworkweek8.carpetcostcalculator;

public class Carpet {

    // Field representing the cost per square meter of the carpet
    private double cost;

    // Constructor to initialize the cost
    public Carpet(double cost) {
        // Set cost, ensuring it is not negative
        this.cost = cost >= 0 ? cost : 0;
    }

    // Method to get the cost of the carpet
    public double getCost() {
        return cost;
    }
}
