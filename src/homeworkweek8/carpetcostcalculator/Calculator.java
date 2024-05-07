package homeworkweek8.carpetcostcalculator;

public class Calculator {

    // Fields for the floor and carpet
    private Floor floor;
    private Carpet carpet;

    // Constructor to initialize the floor and carpet
    public Calculator(Floor floor, Carpet carpet) {
        this.floor = floor;
        this.carpet = carpet;
    }

    // Method to calculate the total cost to cover the floor with the carpet
    public double getTotalCost() {
        // Multiply the area of the floor with the cost of the carpet
        return floor.getArea() * carpet.getCost();
    }
}
