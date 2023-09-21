public class Animal {

    // Counter
    public static int numOfAnimals = 0;


    // Constructor
    public Animal() {
        numOfAnimals++;
    }


    // Fields/Attributes
    String name;
    String desc;
    String birthSeason;
    String color;
    String weight;
    String origin01;
    String origin02;


    // Methods
    public void makenoise() {
        System.out.println("This is an animal object making noise... ");
    }
    public String makenoise02() {
        return "This is a string returned from a method in my Animal Class";
    }

}
