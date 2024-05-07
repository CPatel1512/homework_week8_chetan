package homeworkweek8.carpetcostcalculator;

public class Main {
    public static void main(String[] args) {
        // Create instances of Carpet and Floor, and use Calculator to calculate total cost
        Carpet carpet = new Carpet(3.5);
        Floor floor = new Floor(2.75, 4.0);
        Calculator calculator = new Calculator(floor, carpet);
        System.out.println("total= " + calculator.getTotalCost()); // Output: 38.5

        // Create new instances of Carpet and Floor and calculate again
        carpet = new Carpet(1.5);
        floor = new Floor(5.4, 4.5);
        calculator = new Calculator(floor, carpet);
        System.out.println("total= " + calculator.getTotalCost()); // Output: 36.45
    }
}
