package homeworkweek8.methodoverriding23;
//Creating a child class
public class Bike2 extends Vehicle{
    //defining the same method as in the parent class

    @Override
    public void run() {
        System.out.println("Bike is running safely");
    }

    public static void main(String[] args) {
        Bike2 obj = new Bike2();//creating object
        obj.run();//calling method
    }
    }

