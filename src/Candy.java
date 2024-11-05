public class Candy {
    String type;
    boolean isSour;
    int calories;


    public Candy(String paramType, int paramCalories, boolean paramIsSour){
        type = paramType;
        isSour = paramIsSour;
        calories = paramCalories;
    }

    public void printInfo() {
        System.out.println("Type of candy is " + type);
        System.out.println(" # of calories: " + calories);
        System.out.println(" is sour: " + isSour);
    }

}
