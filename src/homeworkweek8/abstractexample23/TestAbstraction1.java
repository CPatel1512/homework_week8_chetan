package homeworkweek8.abstractexample23;

public class TestAbstraction1 {
    //In real scenario, method is called by programmer or user
    public static void main(String args[]){
        Shape s = new Circle1() ;//in a real scenario, object is provided through method,eg getShape() method
        s.draw();

    }
}
