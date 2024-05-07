package homeworkweek8.methodoverriding24;

public class Test2 {
    public static void main(String[] args) {
        Sbi s = new Sbi();
        Icici i = new Icici();
        Axis a = new Axis();
        System.out.println("Sbi Rate Of Intrest: "+s.getRateOfIntrest());
        System.out.println("Icici Rate of Intrest: "+i.getRateOfIntrest());
        System.out.println("Axis Rate of Intrest: "+a.getRateOfIntrest());
    }
}

