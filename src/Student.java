public class Student {

    String name;
    boolean costume;
    int nCandy;


    public Student(String paramName, int paramNCandy, boolean paramCostume){
        name = paramName;
        nCandy = paramNCandy;
        costume = paramCostume;
    }

    public void printInfo() {
        System.out.println("Name of student is " + name);
        System.out.println(" # of candy: " + nCandy);
        System.out.println(" has costume: " + costume);
    }
}

