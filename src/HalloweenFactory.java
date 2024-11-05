public class HalloweenFactory {

    int temp;
    int year;

    public static void main(String[] args) {
        HalloweenFactory myHalloween; // declare
        myHalloween = new HalloweenFactory();
        myHalloween.temp = 13;
        myHalloween.year = 1962;


        System.out.println("In the year " + myHalloween.year + " the temperature is " + myHalloween.temp);

        Student myStudent; // declare
        myStudent = new Student("Jace", 100, false); // contruct

        myStudent.printInfo();


        Candy myCandy; // declare
        myCandy = new Candy("Twix", 100, false); // contruct

        myCandy.printInfo();
    }
}