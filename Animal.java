import java.util.Date;

public class Animal {
    private int numOfAnimals = 0;

    // Animal Attributes
    private String animalID;
    private String animalName;
    private Date animalBirthDate;
    private String animalColor;
    private char animalGender;
    private float animalWeight;
    private String arrivingFrom;


    // Getters & Setters
    public String getAnimalID() {
        return animalID;
    }

    // Animal ID Setter
    public void setAnimalID(String animalID) {
        this.animalID = animalID;
    }

    // Animal Name Getter
    public void getAnimalName(String animalName) {
        this.animalName = animalName;
    }

    // Constructor
    public Animal() {
        System.out.println("\n");
        numOfAnimals++;
    }

    public int getNumOfAnimals(){
        return numOfAnimals;
    }
}

